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
				System.out.println(name+"�����˵� "+Piao.piao+++"Ʊ");
			}
			switch(name){
				case "����һ":a+=1;break;
				case "���ڶ�":b+=1;break;
				case "������":c+=1;break;
			}
		}
		System.out.println(name+"����");
			if(Piao.piao == 50){
				System.out.println("С���򴰿�һ��Ʊ�ĸ���Ϊ"+(a/50.0));
				System.out.println("С���򴰿ڶ���Ʊ�ĸ���Ϊ"+(b/50.0));
				System.out.println("С���򴰿�����Ʊ�ĸ���Ϊ"+(c/50.0));
			}

	}
}
