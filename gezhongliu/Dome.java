package gezhongliu;

import java.io.*;
import java.util.*;

public class Dome {											//主方法
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) throws Exception{
		neicun();
		dayin();
		huanchong();
	}
	public static void neicun() throws Exception{				//定义内存操作流方法
		System.out.println("下面测试内存操作流,书写内容存向内存中");
		String nei = sc.next();
		InputStream input = new ByteArrayInputStream(nei.getBytes());
		OutputStream output = new ByteArrayOutputStream();
		int i = 0;
		while((i=input.read())!= -1){
			output.write(Character.toUpperCase((char)i));
		}
		String str = output.toString();
		input.close();
		output.close();
		System.out.println("你刚刚向内存中输入的内容是"+str);
	}
	private static void dayin() throws Exception {					//定义打印流方法
		PrintStream out = new PrintStream(new FileOutputStream(new File("E://wenjian"+File.separator+"text.txt")));
		System.out.println("下面测试打印流，请向文件里输入内容");
		String da = sc.next();
		out.println(da);
		out.println("以上是你输入的内容");
		out.close();
		System.out.printf("你已经在E盘下wenjian目录下text.txt文件中输入了内容");
	}
	private static void huanchong() throws Exception {				//定义缓冲流方法
		System.out.println("\n已经测试使用缓冲流将AA中的文件复制到BB");
		BufferedReader br = new BufferedReader(new FileReader("E://wenjian/AA.txt"));
		BufferedWriter bw = new BufferedWriter(new FileWriter("E://wenjian/BB.txt"));
		String line = null;
		while((line=br.readLine()) != null){
			bw.write(line);
			bw.newLine();
		}
		bw.close();
		br.close();
	}
}
