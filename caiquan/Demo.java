package caiquan;

public class Demo {
	public static void main(String[] args) {
		System.out.println("��ӭ�����ȭ��Ϸ���������Ӧ���ֺ͵��Բ�ȭ");
		Ren ren1 = new Ren();
		ren1.say();
		Jisuanji js1 = new Jisuanji();
		js1.say();
		switch(Ren.x){
		 case 1:
			 switch(Jisuanji.y){
			 case 1:System.out.println("ƽ��");break;
			 case 2:System.out.println("������");break;
			 case 3:System.out.println("��Ӯ��");break;
			 }break;
		 case 2:
			 switch(Jisuanji.y){
			 case 1:System.out.println("��Ӯ��");break;
			 case 2:System.out.println("ƽ��");break;
			 case 3:System.out.println("������");break;
			 }break;
		 case 3:
			 switch(Jisuanji.y){
			 case 1:System.out.println("������");break;
			 case 2:System.out.println("��Ӯ��");break;
			 case 3:System.out.println("ƽ��");break;
			 }break;
		}
	}
}
