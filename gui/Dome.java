package gui;

import javax.swing.*;

//��¼����
@SuppressWarnings("serial")
public class Dome extends JFrame{
	public Dome(){
		
		this.setLayout(null);
		//������������
		JLabel jlabel1 = new JLabel();
		jlabel1.setText("��¼����");
		jlabel1.setBounds(10,0,200,40);
		this.add(jlabel1);
		//��ʾ�˺�
		JLabel jlabel2 = new JLabel();
		jlabel2.setText("�˺ţ�");
		jlabel2.setBounds(60,60,50,20);
		this.add(jlabel2);
		//��ʾ����
		JLabel jlabel3 = new JLabel();
		jlabel3.setText("���룺");
		jlabel3.setBounds(60,100,50,20);
		this.add(jlabel3);
		//���������˺ŵ��ı���
		JTextArea jtext1 = new JTextArea();
		jtext1.setText("�������˺�");
		jtext1.setBounds(110,60,200,20);
		this.add(jtext1);
		//������������������
		JPasswordField jtext2 = new JPasswordField();
		jtext2.setBounds(110,100,200,20);
		this.add(jtext2);
		//���õ�¼��ť
		JButton jbutton = new JButton("��ȫ��¼");
		jbutton.setBounds(110,160,200,30);
		this.add(jbutton);
		//���ô��ڱ����Լ���С
		this.setTitle("��¼����");
		this.setBounds(0,0,445,340);
		this.setVisible(true);
	}
	public static void main(String[] args) {
		new Dome();
	}
}
