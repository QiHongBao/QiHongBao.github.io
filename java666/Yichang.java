import java.util.*;
public class Yichang{
	static String n;
	static Scanner sc = new Scanner(System.in);
	public void Yichang(String n){
		this.n = n;
	}
	public static void changdu(){
		if(n.length()!=5){
			System.out.println("���������������������");
			String n = sc.next();
			changdu();
		}
	}
}