package peizhi;

import java.io.*;
import java.util.*;

public class Dome {
	static{
		System.out.println("��д�����ļ������������");
	}
	static Scanner sc = new Scanner(System.in);
	static String A = sc.next();
	public static void main(String[] args) {
		File file = new File("E://wenjian/text.txt");
		try{
			file.createNewFile();
		}catch(Exception e){
			e.printStackTrace();
		}
		try {
			Writer wr = new FileWriter(A);
			wr.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
