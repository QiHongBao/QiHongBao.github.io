package douhao;
import java.util.*;
public class Demo {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("输入一串字符串为您分开");
		String b = sc.next();
		char[] a = b.toCharArray();
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]);
			if(i<a.length-1){
				System.out.print(",")
				;
			}
		}
	}

}
