/**
 * 
 */
package netty.test2;

import init.Initialize;
import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelOption;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioServerSocketChannel;
import io.netty.handler.codec.string.StringDecoder;
import io.netty.handler.codec.string.StringEncoder;
import netty.ToString;

/**
 * @author wangyu
 *
 */
public class Server {
	private int port;
    
    public Server(int port) {
        this.port = port;
    }
    public static EventLoopGroup bossGroup = new NioEventLoopGroup(); 
    public static EventLoopGroup workerGroup = new NioEventLoopGroup(10);
    public static ServerBootstrap serverBootstrap ;
    
    public void run() throws Exception {
        try {
            serverBootstrap = new ServerBootstrap(); // (2)
            serverBootstrap.group(bossGroup, workerGroup)
             .channel(NioServerSocketChannel.class) // (3)
             .childHandler(new ChannelInitializer<SocketChannel>() { // (4)
                 @Override
                 public void initChannel(SocketChannel ch) throws Exception {
//                     ch.pipeline().addLast(new Decoder2(1024,0,4));
//                	 ch.pipeline().addLast(workerGroup,"codec", new WebSocketServerProtocolHandler("ws"));
                	 ch.pipeline().addLast(workerGroup,"codec",new DecoderByLengthFieldBasedFrameDecoder(1024*1024, 4, 4, 4, 8));
                	 ch.pipeline().addLast(workerGroup,"decoder", new StringDecoder());
                	 ch.pipeline().addLast(workerGroup,"encoder", new StringEncoder());
                	 ch.pipeline().addLast(workerGroup,"handle", new MyBusinessLogicHandler());
                 }
             })
             .option(ChannelOption.SO_BACKLOG, 128)          // (5)
             .childOption(ChannelOption.SO_KEEPALIVE, true)
             ; // (6)
            
            // Bind and start to accept incoming connections.
            ChannelFuture f = serverBootstrap.bind(port).sync(); // (7)
            
//            GenericFutureListener genericFutureListener = null;
//            f.addListener(genericFutureListener);
//            genericFutureListener.operationComplete(future);
            
            System.out.println("---- [netty start] "+port);
            
            // Wait until the server socket is closed.
            // In this example, this does not happen, but you can do that to gracefully
            // shut down your server.
            f.channel().closeFuture().sync();
            ToString.println(f.channel().remoteAddress());
        } finally {
            workerGroup.shutdownGracefully();
            bossGroup.shutdownGracefully();
        }
    }
    
    public static void main(String[] args) throws Exception {
    	Initialize.run();
    	
        int port;
        if (args.length > 0) {
            port = Integer.parseInt(args[0]);
        } else {
            port = Client.port;
        }
        new Thread(new Runnable() {
			
			@Override
			public void run() {
				 try {
					new Server(port).run();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}).start();
        
        Thread.sleep(2500);
        
//        while(true){
//        	 Iterator<EventExecutor> iterator = workerGroup.iterator();
//             while(iterator.hasNext()){
//             	EventExecutor ee = iterator.next();
//             	if(ee.inEventLoop()){
//             		ToString.println("true");//证明不同线程，试一下inEventLoop,没用
//             	}
//             	Thread.sleep(1000);
//             	Promise<String> d = ee.newPromise();
//             	ToString.println(d.isSuccess());
////             	Future ff = (Future) ee.newSucceededFuture(new Future(null));
////             	ff.evaluate();
//             }
//        }
        
    }
	
}
