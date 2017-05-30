package xiancheng;

public class Chuangkou implements Runnable{
	public String name;
	static int a = 0;
	static int b = 0;
	static int c = 0;
	public Chuangkou(String name) {
		this.name = name;
	}
	public void run(){
		while(Piao.piao<49){
			try {
				Thread.sleep(1/10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			synchronized(Piao.name){
				System.out.println(name+"卖出了第 "+Piao.piao+++"票");
			}
			switch(name){
				case "窗口一":a+=1;break;
				case "窗口二":b+=1;break;
				case "窗口三":c+=1;break;
			}
		}
		System.out.println(name+"售罄");
			if(Piao.piao == 50){
				System.out.println("小明买窗口一的票的概率为"+(a/50.0));
				System.out.println("小明买窗口二的票的概率为"+(b/50.0));
				System.out.println("小明买窗口三的票的概率为"+(c/50.0));
			}

	}
}
