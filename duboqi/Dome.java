package duboqi;

import java.awt.event.*;
import javax.swing.*;

//产生随机数
@SuppressWarnings("serial")
public class Dome extends JFrame{
	int a = 0,b = 0;
	public Dome(){
		
		this.setLayout(null);
		
		JLabel jlabel3 = new JLabel();				//创建一个文本窗口
		jlabel3.setBounds(125,100,50,30);			//固定位置
		this.add(jlabel3);							//将其填入对话框
		
		this.setTitle("0~99999随机");				//设置标题
		this.setBounds(0,0,300,300);				//设置对话框大小
		this.setVisible(true);						//对话框可视
		while(true){								//循环监听按钮
			JButton jbutton = new JButton();
			jbutton.setText("开始/停止");
			jbutton.setBounds(100,150,100,30);
			jbutton.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e){
					b = b+1;
				}
			});
			this.add(jbutton);
			while(b%2==0){							//循环生成随机数
				a = (int)(Math.random()*99999);
				jlabel3.setText(""+a);
			}
		}
	}
	public static void main(String[] args) {
		new Dome();									//调用构造器

	}

}
