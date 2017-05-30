package caiquan;
import java.util.*;
public class Ren {
	static Scanner sc = new Scanner(System.in);
	static int x;
	public void say(){
		System.out.println("1，剪刀\t2，石头\t3，布");
		try{
			Ren.x = sc.nextInt();
		}catch(Exception e){
			System.out.println("检查到你有疑似作弊行为，机器拒绝和你猜拳了");
			System.exit(0);
		}
		switch(x){
			case 1:System.out.println("你选择出剪刀");break;
			case 2:System.out.println("你选择出石头");break;
			case 3:System.out.println("你选择出布");break;
			default:
				System.out.println("输入有误，请重新输入");
				say();
				break;
		}
	}
}
