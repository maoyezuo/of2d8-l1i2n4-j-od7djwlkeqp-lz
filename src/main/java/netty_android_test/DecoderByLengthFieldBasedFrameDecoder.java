/**
 * 
 */
package netty_android_test;

import java.nio.ByteOrder;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.DecoderException;
import io.netty.handler.codec.LengthFieldBasedFrameDecoder;

public class DecoderByLengthFieldBasedFrameDecoder extends LengthFieldBasedFrameDecoder {  
	private final static Logger logger = LoggerFactory.getLogger(DecoderByLengthFieldBasedFrameDecoder.class);
	
    // 第一个参数为信息最大长度，超过这个长度回报异常，  
    // 第二参数为长度属性的起始（偏移）位，我们的协议中长度是0到第3个字节，所以这里写0，  
    // 第三个参数为“长度属性”的长度，我们是4个字节，所以写4，  
    // 第四个参数为长度调节值，在总长被定义为包含包头长度时，修正信息长度，  
    // 第五个参数为跳过的字节数，根据需要我们跳过前4个字节，以便接收端直接接受到不含“长度属性”的内容。  
  
    public DecoderByLengthFieldBasedFrameDecoder(int maxFrameLength, int lengthFieldOffset,  
            int lengthFieldLength) {  
        super(maxFrameLength, lengthFieldOffset, lengthFieldLength);  
    }
    
	public DecoderByLengthFieldBasedFrameDecoder(int maxFrameLength, int lengthFieldOffset,
			int lengthFieldLength, int lengthAdjustment, int initialBytesToStrip) {
		super(maxFrameLength, lengthFieldOffset, lengthFieldLength,
				lengthAdjustment, initialBytesToStrip);
	}
    
    private ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
    private int maxFrameLength = 1024*10;
    private int lengthFieldLength = 4;
    private int initialBytesToStrip = 0;
    private long tooLongFrameLength;
    private long bytesToDiscard;
    private boolean failFast = true;

	@Override
	protected Object decode(ChannelHandlerContext ctx, ByteBuf in)
			throws Exception {
		if(!in.isReadable()){
			return null;
		}
		int frameLength = (int) in.getUnsignedInt(0);//获取头部
		int frameLength2 = (int) in.getUnsignedInt(4);
		if(in.readableBytes() < frameLength)//当ByteBuf没有达到长度时，return null
        {
            return null;
        }
        in.skipBytes(8);//舍弃头部
        int index =  in.readerIndex();
        ByteBuf frame = in.slice(index, frameLength2).retain();//取出自己定义的packet包返回给ChannelRead
        String name = new String(frame.readBytes(frameLength2).array(), "UTF-8");
        System.out.println(name);
        in.readerIndex(frameLength);//这一步一定要有，不然其实bytebuf的readerIndex没有变，netty会一直从这里开始读取，将readerIndex移动就相当于把前面的数据处理过了废弃掉了。
       
        return name;
	}

	@Override
	/** 重写这里只是想注释掉".decode() did not read anything but decoded a message."不显示，如果可以设置异常级别不显示这条异常，那么就不用这个方法 */
	protected void callDecode(ChannelHandlerContext ctx, ByteBuf in,
			List<Object> out) {
		try {
            //循环读取数据
            while (in.isReadable()) {
                int outSize = out.size();
                int oldInputLength = in.readableBytes();
                decode(ctx, in, out);//业务扩展处理

                // Check if this handler was removed before continuing the loop.
                // If it was removed, it is not safe to continue to operate on the buffer.
                //
                // See https://github.com/netty/netty/issues/1664
                //如果 handler 删除之前，那么不读取数据了
                if (ctx.isRemoved()) {
                    break;
                }
                //下面写得很不清晰。。。。。
                
                if (outSize == out.size()) {
                    if (oldInputLength == in.readableBytes()) {
                        break;
                    } else {
                        continue;
                    }
                }

                if (oldInputLength == in.readableBytes()) {
//                    throw new DecoderException(
//                            StringUtil.simpleClassName(getClass()) +
//                            ".decode() did not read anything but decoded a message.");
                }else{
                	 if (isSingleDecode()) {
                         break;
                     }
                }
            }
        } catch (DecoderException e) {
            throw e;
        } catch (Throwable cause) {
            throw new DecoderException(cause);
        }
	}

//	@Override
//	public void channelRead(ChannelHandlerContext ctx, Object msg)
//			throws Exception {
////		ToString.println("-----------------",Thread.currentThread().getId(),ctx.channel().remoteAddress());
////		ToString.println("333333");
////		if(msg instanceof ByteBuf){
////			ByteBuf byteBuf = (ByteBuf)msg;
////			 int nameSize = byteBuf.readByte();
////			 ToString.println(nameSize);
////		}
//			
////		if(msg instanceof ByteBuf)
////        {
////            ByteBuf byteBuf = (ByteBuf)msg;
////            int nameSize = byteBuf.readByte();
////            String name = new String(byteBuf.readBytes(nameSize).array(), "UTF-8");
//////            int fileSize = byteBuf.readInt();
//////            FileOutputStream fileOutputStream = new FileOutputStream(new File(name));
//////            fileOutputStream.write(byteBuf.readBytes(fileSize).array());
////            System.out.println(name );
////        }
//
//		super.channelRead(ctx, msg);
//	}




  
    
  
}  