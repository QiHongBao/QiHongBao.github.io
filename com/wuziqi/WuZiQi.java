package com.wuziqi;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class WuZiQi extends JFrame{
	public  WuZiQi(){
		this.setLayout(null);
		Text text = new Text();
		text.setBounds(30, 30, 550, 5500);
		
		this.setTitle("五子棋-单机版");

				WuZiQi.this.add(text);
				WuZiQi.this.repaint();
			
		this.setBounds(200,200,750,650);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		
	}
	public static void main(String[] args){
		new WuZiQi();
	}
}
