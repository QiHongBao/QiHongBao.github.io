package duankou;
import java.io.*;
import java.net.*;
import java.util.*;

public class Domekehu {
	static Scanner sc = new Scanner(System.in);
	static Socket socket = null;
	public static void main(String[] args) throws Exception {
		System.out.println("�ͻ������ڳ�������");
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
		System.out.println("���ӳɹ����뷢��");
		String nei = sc.next();
		OutputStream output = socket.getOutputStream();
		output.write(nei.getBytes());
		output.close();
	}
}
