package gezhongliu;

import java.io.*;
import java.util.*;

public class Dome {											//������
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) throws Exception{
		neicun();
		dayin();
		huanchong();
	}
	public static void neicun() throws Exception{				//�����ڴ����������
		System.out.println("��������ڴ������,��д���ݴ����ڴ���");
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
		System.out.println("��ո����ڴ��������������"+str);
	}
	private static void dayin() throws Exception {					//�����ӡ������
		PrintStream out = new PrintStream(new FileOutputStream(new File("E://wenjian"+File.separator+"text.txt")));
		System.out.println("������Դ�ӡ���������ļ�����������");
		String da = sc.next();
		out.println(da);
		out.println("�����������������");
		out.close();
		System.out.printf("���Ѿ���E����wenjianĿ¼��text.txt�ļ�������������");
	}
	private static void huanchong() throws Exception {				//���建��������
		System.out.println("\n�Ѿ�����ʹ�û�������AA�е��ļ����Ƶ�BB");
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
