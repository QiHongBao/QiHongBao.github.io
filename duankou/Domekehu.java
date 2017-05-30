package duankou;
import java.io.*;
import java.net.*;
import java.util.*;

public class Domekehu {
	static Scanner sc = new Scanner(System.in);
	static Socket socket = null;
	public static void main(String[] args) throws Exception {
		System.out.println("客户端正在尝试连接");
		try {
			socket = new Socket("127.0.0.1",7878);
			try {
				fayan();
			} catch (Exception e) {
				e.printStackTrace();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}	
	}
	private static void fayan() throws Exception {
		System.out.println("链接成功，请发言");
		String nei = sc.next();
		OutputStream output = socket.getOutputStream();
		output.write(nei.getBytes());
		output.close();
	}
}
