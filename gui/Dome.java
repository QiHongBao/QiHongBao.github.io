package gui;

import javax.swing.*;

//登录界面
@SuppressWarnings("serial")
public class Dome extends JFrame{
	public Dome(){
		
		this.setLayout(null);
		//设置首行文字
		JLabel jlabel1 = new JLabel();
		jlabel1.setText("登录界面");
		jlabel1.setBounds(10,0,200,40);
		this.add(jlabel1);
		//显示账号
		JLabel jlabel2 = new JLabel();
		jlabel2.setText("账号：");
		jlabel2.setBounds(60,60,50,20);
		this.add(jlabel2);
		//显示密码
		JLabel jlabel3 = new JLabel();
		jlabel3.setText("密码：");
		jlabel3.setBounds(60,100,50,20);
		this.add(jlabel3);
		//创建输入账号的文本框
		JTextArea jtext1 = new JTextArea();
		jtext1.setText("请输入账号");
		jtext1.setBounds(110,60,200,20);
		this.add(jtext1);
		//创建输入密码的密码框
		JPasswordField jtext2 = new JPasswordField();
		jtext2.setBounds(110,100,200,20);
		this.add(jtext2);
		//设置登录按钮
		JButton jbutton = new JButton("安全登录");
		jbutton.setBounds(110,160,200,30);
		this.add(jbutton);
		//设置窗口标题以及大小
		this.setTitle("登录界面");
		this.setBounds(0,0,445,340);
		this.setVisible(true);
	}
	public static void main(String[] args) {
		new Dome();
	}
}
