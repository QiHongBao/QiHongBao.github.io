import java.util.*;
public class Main{
	public static void main(String[] args){
		Yichang yc = new Yichang();
		System.out.println("�������������");
		Scanner sc = new Scanner(System.in);
		String n = sc.next();
		Yichang.changdu();
		char[] a = n.toCharArray();
		for(int i=0;i<n.length();i++){
			System.out.println(a[i]);
		}
	}
}