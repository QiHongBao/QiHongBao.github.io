package wuziqi;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import javax.swing.JFrame;

@SuppressWarnings("serial")
public class Dome extends JFrame implements MouseListener{
	int x;
	int y;
	int c=1;
	boolean ishei = false;
	java.util.List<Qizi> qizilist = new ArrayList<Qizi>();
	public Dome(){
		
		this.setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.addMouseListener(this);
		
		this.setTitle("Îå×ÓÆå");
		this.setBounds(0,0,500,500);
		this.setVisible(true);
	}

	
	public static void main(String[] args) {
		new Dome();
	}
	
	public void paint(Graphics g){
		if(c==1){
			for(int i=1;i<=11;i++){
				g.drawLine(40, i*40,440, i*40);
				g.drawLine(i*40, 40,i*40, 440);
			}
			c=2;
		}else{
			for(Qizi s:qizilist){
				g.setColor(s.getColor());
				g.fillOval(s.getX(),s.getY(),Qizi.QSIZE, Qizi.QSIZE);
			}
			
		}
	}


	@Override
	public void mouseClicked(MouseEvent e) {
		x = Math.round((e.getX()-15)/40)*40+25;
		y = Math.round((e.getY()-15)/40)*40+25;
		Qizi qizi = new Qizi(x,y);
			if(ishei == true){
				qizi.setColor(Color.black);
				ishei = false;
			}else{
				qizi.setColor(Color.yellow);
				ishei = true;
			}
			qizilist.add(qizi);
		this.repaint();
	}


	@Override
	public void mousePressed(MouseEvent e) {
		
		
	}


	@Override
	public void mouseReleased(MouseEvent e) {
		
		
	}


	@Override
	public void mouseEntered(MouseEvent e) {
		
		
	}


	@Override
	public void mouseExited(MouseEvent e) {
		
		
	}
}
