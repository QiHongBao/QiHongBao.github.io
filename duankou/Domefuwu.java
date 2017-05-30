package duankou;

import java.io.IOException;
import java.io.InputStream;
import java.net.*;
import java.util.Scanner;

public class Domefuwu {
	static Scanner sc = new Scanner(System.in);
	static Socket socket = null;
	static ServerSocket sever = null;
	public static void main(String[] args) {
		System.out.println("已经建立服务器");
		try {
			sever = new ServerSocket(7878);
			while(true){
				socket = sever.accept();
				System.out.println("已经和"+socket.getLocalAddress()+"建立聊天通道\n等待对方发言");
				duqu();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void duqu() throws IOException {
		InputStream input = socket.getInputStream();
		byte[] bytes = new byte[1024];
		int len = 0;
		StringBuffer buffer = new StringBuffer();
		while((len = input.read(bytes)) != -1){
			buffer.append(new String(bytes,0,len));
		}
		input.close();
		System.out.println("对方发来消息"+buffer.toString());
	}
}
