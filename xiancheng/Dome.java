package xiancheng;

public class Dome {
	public static void main(String[] args) {
		Chuangkou c1 = new Chuangkou("窗口一");
		Chuangkou c2 = new Chuangkou("窗口二");
		Chuangkou c3 = new Chuangkou("窗口三");
		Thread t1 = new Thread(c1);
		Thread t2 = new Thread(c2);
		Thread t3 = new Thread(c3);
		t1.start();
		t2.start();
		t3.start();
	}
}
