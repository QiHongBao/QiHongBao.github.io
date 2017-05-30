package caiquan;
public class Jisuanji {
	static int y;
	public void say(){
		Jisuanji.y = (int)(Math.random()*3+1);
		switch(y){
			case 1:System.out.println("机器选择出剪刀");break;
			case 2:System.out.println("机器选择出石头");break;
			case 3:System.out.println("机器选择出布");break;
		}
	}

}
