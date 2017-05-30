package honglvdeng;

import java.awt.*;
import java.util.Scanner;

import javax.swing.*;

@SuppressWarnings("serial")
public class Dome extends JFrame{
	static Scanner sc = new Scanner(System.in);
	private static int a = 1;
	private int b = 1;
	public Dome(){
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(null);
		
		this.setTitle("红绿灯");
		this.setBounds(0,0,700,400);
		this.setVisible(true);
	}
	public static void main(String[] args) {	
		new Dome();
		while(true){
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
			a=a++;
			if(a==4){
				a=1;
			}
		}
	}
	public void paint(Graphics g){
		if(b!=a){
			super.paint(g);
			b=a;
			repaint();
		}else{
			switch(a){
			case 1:
				g.setColor(Color.red);;
				g.fillOval(100, 100, 100, 100);
			break;
			case 2:
				g.setColor(Color.yellow);;
				g.fillOval(300, 100, 100, 100);
			break;
			case 3:
				g.setColor(Color.green);;
				g.fillOval(500, 100, 100, 100);
			break;
			}
		}
	}
}
