package caiquan;

public class Demo {
	public static void main(String[] args) {
		System.out.println("欢迎进入猜拳游戏，请输入对应数字和电脑猜拳");
		Ren ren1 = new Ren();
		ren1.say();
		Jisuanji js1 = new Jisuanji();
		js1.say();
		switch(Ren.x){
		 case 1:
			 switch(Jisuanji.y){
			 case 1:System.out.println("平局");break;
			 case 2:System.out.println("你输了");break;
			 case 3:System.out.println("你赢了");break;
			 }break;
		 case 2:
			 switch(Jisuanji.y){
			 case 1:System.out.println("你赢了");break;
			 case 2:System.out.println("平局");break;
			 case 3:System.out.println("你输了");break;
			 }break;
		 case 3:
			 switch(Jisuanji.y){
			 case 1:System.out.println("你输了");break;
			 case 2:System.out.println("你赢了");break;
			 case 3:System.out.println("平局");break;
			 }break;
		}
	}
}
