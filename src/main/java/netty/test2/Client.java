/**
 * 
 */
package netty.test2;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import message.MessageId;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;
import java.net.UnknownHostException;

import com.alibaba.fastjson.JSONObject;

import netty.ToString;

/**
 * @author wangyu
 *
 */
public class Client implements Runnable{
	public static final int port = 8080;
	public static final String host = "192.168.21.51";
	public static int num = 0;
	public static int maxnum = 1;

	public static void main(String[] args) throws UnknownHostException, IOException, InterruptedException {
		num = 0;
		for (int i = 0; i < maxnum; i++) {
			num ++;
			new Thread(new Client(num)).start();
		}
	}
	
	public Client() throws UnknownHostException, IOException, InterruptedException{
		
	}
	
	int numc;
	public Client(final int num) throws UnknownHostException, IOException, InterruptedException{
		this.numc = num;
	}

	public void creatsocket() throws UnknownHostException, IOException, InterruptedException{
		ToString.println("Client Start..."+Thread.currentThread().getId(), this.numc);
		Socket socket = null;
		// 创建一个流套接字并将其连接到指定主机上的指定端口号
		socket = new Socket(host, port);
		// 读取服务器端数据
		BufferedReader input = new BufferedReader(
				new InputStreamReader(socket.getInputStream()));
		// 向服务器端发送数据
		PrintStream out = new PrintStream(socket.getOutputStream());
		boolean close = true;
		while(close){
//			ToString.println(numc, num);
			if(num>=maxnum){//避免发送太早影响连接
				sends(out);
			}
			Thread.sleep(1500);
		}
		
		out.close();
		input.close();
	}

	private void sends(PrintStream out) throws IOException {
		String s = "";
		JSONObject json = new JSONObject();
		json.put("msgid", MessageId.login );
		json.put("msg", "日日日日日日");
		json.put("numc", numc);
		
		s = json.toString();
//		ToString.println(s);
	    int total = 4 + 4 + s.getBytes().length;
	    ByteBuf byteBuf = Unpooled.buffer(total);
	    byteBuf.writeInt(total);
		byteBuf.writeInt(s.getBytes().length);
		byteBuf.writeBytes(s.getBytes());
//		ToString.println(8,new String(byteBuf.array()),8);
		out.write(byteBuf.array());
	}


	@Override
	public void run() {
		try {
			creatsocket();
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	
	
	
	
	
	
	
	
	
	
}
