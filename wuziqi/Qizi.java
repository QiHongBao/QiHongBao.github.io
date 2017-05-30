package wuziqi;

import java.awt.Color;

public class Qizi {						//Æå×Ó
	private Color color;
	private int x;
	private int y;
	public static final int QSIZE = 30;
	public Qizi(int x,int y){
		this.x = x;
		this.y = y;
	}
	public Qizi(Color color,int x,int y){
		this.color = color;
		this.x = x;
		this.y = y;
	}
	public int getX(){
		return x;
	}
	public void setX(int x){
		this.x = x;
	}
	public int getY(){
		return y;
	}
	public void setY(int y){
		this.y = y;
	}
	public Color getColor(){
		return color;
	}
	public void setColor(Color color){
		this.color = color;
	}
}
