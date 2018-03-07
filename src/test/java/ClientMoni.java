/**
 * 
 */


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
 *模拟客户端操作
 */
public class ClientMoni implements Runnable{
	public static final int port = 18080;
	public static final String host = "192.168.21.51";
	public static int num = 0;
	public static int maxnum = 1;

	public static void main(String[] args) throws UnknownHostException, IOException, InterruptedException {
		num = 0;
		for (int i = 0; i < maxnum; i++) {
			num ++;
			new Thread(new ClientMoni(num)).start();
		}
	}
	
	public ClientMoni() throws UnknownHostException, IOException, InterruptedException{
		
	}
	
	int numc;
	public ClientMoni(final int num) throws UnknownHostException, IOException, InterruptedException{
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
		sends(out, registerRequest());
		Thread.sleep(1000);
		System.out.println("ddddddddddd "+input.read());;
//		sends(out, loginRequest());
	
		out.close();
		input.close();
	}

	private void sends(PrintStream out, JSONObject json) throws IOException {
		String s = json.toString();
//		ToString.println(s);
	    int total = 4 + 4 + s.getBytes().length;
	    ByteBuf byteBuf = Unpooled.buffer(total);
	    byteBuf.writeInt(total);
		byteBuf.writeInt(s.getBytes().length);
		byteBuf.writeBytes(s.getBytes());
//		ToString.println(8,new String(byteBuf.array()),8);
		out.write(byteBuf.array());
	}

	private JSONObject loginRequest() {
		JSONObject json = new JSONObject();
		json.put("msgid", MessageId.login );
		
		String uuid = json.getString("uuid");
		String psw = json.getString("psw");
		json.put("uuid", "日日日日日日");
		json.put("numc", numc);
		return json;
	}
	
	private JSONObject registerRequest() {
		JSONObject json = new JSONObject();
		json.put("msgid", MessageId.register );
		json.put("serverId", "100001");
		json.put("nickname", "test01");
		json.put("psw", "123456");
		return json;
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
