package caiquan;
public class Jisuanji {
	static int y;
	public void say(){
		Jisuanji.y = (int)(Math.random()*3+1);
		switch(y){
			case 1:System.out.println("����ѡ�������");break;
			case 2:System.out.println("����ѡ���ʯͷ");break;
			case 3:System.out.println("����ѡ�����");break;
		}
	}

}
