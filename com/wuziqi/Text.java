package com.wuziqi;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import javax.swing.JComponent;

@SuppressWarnings("serial")
public class Text extends JComponent implements MouseListener{
	
	java.util.List<Qizi> qiziList = new ArrayList<Qizi>();
	private boolean isHei = true;
	private int currentX = 0;
	private int currentY = 0;
	private boolean isWinNow = false;
	public Text(){
		this.addMouseListener(this);
	}
	
	public void paint(Graphics g) {
		//棋盘
		for(int i=-1;i<10;i++){
			g.drawLine(20, (i*50+70), 520, (i*50+70));
			g.drawLine((i*50+70),20 , (i*50+70), 520);
		}
		for(Qizi q:qiziList){
			g.setColor(q.getColor());
			g.fillOval(q.getX(), q.getY(), Qizi.SIZE, Qizi.SIZE);
		}
		isWin();
		if(isWinNow==true){
			g.setFont(new Font("楷体",Font.ITALIC,100));
			g.drawString("赢", 300, 300);
		}
		
	}
	public void isWin(){
		
		//东
		int dongxi = 0;
		for(int nowX = currentX,i=0;nowX<=520&&i<5;nowX+=50,i++){
			Qizi qizi = findQizi(nowX, currentY);
			System.out.println(qizi);
			if(qizi!=null){
				if(isHei!=true){
					if(qizi.getColor()==Color.black){
						dongxi++;
					}else{
						break;
					}
				}
				if(isHei!=false){
					if(qizi.getColor()==Color.white){
						dongxi++;
					}else{
						break;
					}
				}
			}else{
				break;
			}
		}
		//西
		for(int nowX = currentX-50,i=0;nowX>=0&&i<5;nowX-=50,i++){
			Qizi qizi = findQizi(nowX, currentY);
			System.out.println(qizi);
			if(qizi!=null){
				if(isHei!=true){
					if(qizi.getColor()==Color.black){
						dongxi++;
					}else{
						break;
					}
				}
				if(isHei!=false){
					if(qizi.getColor()==Color.white){
						dongxi++;
					}else{
						break;
					}
				}
			}else{
				break;
			}
		}
		if(dongxi>=5){	
			System.out.println("赢");
		}
		//南
		int nanbei = 0;
		for(int nowY = currentY,i=0;nowY<=520&&i<5;nowY+=50,i++){
			Qizi qizi = findQizi(currentX,nowY );
			if(qizi!=null){
				if(isHei!=true){
					if(qizi.getColor()==Color.black){
						nanbei++;
					}
				}
				if(isHei!=false){
					if(qizi.getColor()==Color.white){
						nanbei++;
					}
				}
			}else{
				break;
			}
		}
				if(nanbei>=5){	
				System.out.println("赢");
		}
		//北
		for(int nowY = currentY-50,i=0;nowY>=0&&i<5;nowY-=50,i++){
			Qizi qizi = findQizi(currentX, nowY);
			if(qizi!=null){
				if(isHei!=true){
					if(qizi.getColor()==Color.black){
						nanbei++;
					}
				}
				if(isHei!=false){
					if(qizi.getColor()==Color.white){
						nanbei++;
					}
				}
			}else{
				break;
			}
		}
		if(nanbei>=5){
					if(nanbei>=5){	
				System.out.println("赢");
		}
		}
		//东北
		//西南
		int dongbeixinan = 0;
		for(int nowX = currentX,nowY = currentY,i=0;nowY>=0&&i<5&&nowX<=520;nowX+=50,nowY-=50,i++){
			Qizi qizi = findQizi(nowX, nowY);
			if(qizi!=null){
				if(isHei!=true){
				if(qizi.getColor()==Color.black){
					dongbeixinan++;
					}else{
						break;
					}
				}
				if(isHei!=false){
					if(qizi.getColor()==Color.white){
						dongbeixinan++;
					}else{
						break;
					}
				}
			}else{
				break;
			}
		}
		for(int nowX = currentX-50,nowY = currentY-50,i=0;nowY<=520&&i<5&&nowX>=0;nowX-=50,nowY+=50,i++){
			Qizi qizi = findQizi(nowX, nowY);
			if(qizi!=null){
				if(isHei!=true){
				if(qizi.getColor()==Color.black){
					dongbeixinan++;
					}else{
						break;
					}
				}
				if(isHei!=false){
					if(qizi.getColor()==Color.white){
						dongbeixinan++;
					}else{
						break;
					}
				}
			}else{
				break;
			}
		}
		if(dongbeixinan>=5){
					if(dongbeixinan>=5){	
				System.out.println("赢");
		}
		}
		//东南
		//西北
		int dongnanxibei = 0;
		for(int nowX = currentX,nowY = currentY,i=0;nowY<=520&&i<5&&nowX<=520;nowX+=50,nowY+=50,i++){
			Qizi qizi = findPoint(nowX, nowY);
			if(qizi!=null){
				if(isHei!=true){
				if(qizi.getColor()==Color.black){
					dongnanxibei++;
					}else{
						break;
					}
				}
				if(isHei!=false){
					if(qizi.getColor()==Color.white){
						dongnanxibei++;
					}else{
						break;
					}
				}
			}else{
				break;
			}
		}
		for(int nowX = currentX-50,nowY = currentY-50,i=0;nowY>=0&&i<5&&nowX>=0;nowX-=50,nowY-=50,i++){
			Qizi qizi = findQizi(nowX, nowY);
			if(qizi!=null){
				if(isHei!=true){
				if(qizi.getColor()==Color.black){
					dongnanxibei++;
					}else{
						break;
					}
				}
				if(isHei!=false){
					if(qizi.getColor()==Color.white){
						dongnanxibei++;
					}else{
						break;
					}
				}
			}else{
				break;
			}
		}
		if(dongnanxibei>=5){	
				System.out.println("赢");
		}
	}
	private Qizi findQizi(int nowX, int currentY2) {
		return null;
	}
	public Qizi findPoint(int x,int y){
		for(Qizi q:qiziList){
			if(q.getX() == x && q.getY() == y){
				return q;
			}
		}
		return null;
	}
	public void mouseClicked(MouseEvent e) {
		System.out.println("点了"+e.getX()+" "+e.getY());
		
		int x = e.getX();
		int y = e.getY();
		double xianX = Math.round((x-20)/50.0);
		double xianY = Math.round((y-20)/50.0);
		x =((int) xianX)*50;
		y =((int) xianY)*50;
		currentX = x;
		currentY = y;
		boolean isHave = false;
		for(Qizi q:qiziList){
			if(q.getX()==x&&q.getY()==y){
				isHave = true;
			}
		}
		
		if(!isHave){
			Qizi qizi = new Qizi(x,y);
			if(isHei == true){
				qizi.setColor(Color.black);
				isHei = false;
			}else{
				qizi.setColor(Color.white);
				isHei = true;
			}
			if(isWinNow==false){
				qiziList.add(qizi);
			}
			
			this.repaint();
		}
		System.out.println("棋子数"+qiziList.size());
	}
	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}
