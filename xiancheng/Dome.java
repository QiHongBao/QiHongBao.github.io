package xiancheng;

public class Dome {
	public static void main(String[] args) {
		Chuangkou c1 = new Chuangkou("����һ");
		Chuangkou c2 = new Chuangkou("���ڶ�");
		Chuangkou c3 = new Chuangkou("������");
		Thread t1 = new Thread(c1);
		Thread t2 = new Thread(c2);
		Thread t3 = new Thread(c3);
		t1.start();
		t2.start();
		t3.start();
	}
}
