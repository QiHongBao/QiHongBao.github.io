package caiquan;
import java.util.*;
public class Ren {
	static Scanner sc = new Scanner(System.in);
	static int x;
	public void say(){
		System.out.println("1������\t2��ʯͷ\t3����");
		try{
			Ren.x = sc.nextInt();
		}catch(Exception e){
			System.out.println("��鵽��������������Ϊ�������ܾ������ȭ��");
			System.exit(0);
		}
		switch(x){
			case 1:System.out.println("��ѡ�������");break;
			case 2:System.out.println("��ѡ���ʯͷ");break;
			case 3:System.out.println("��ѡ�����");break;
			default:
				System.out.println("������������������");
				say();
				break;
		}
	}
}
