package duboqi;

import java.awt.event.*;
import javax.swing.*;

//���������
@SuppressWarnings("serial")
public class Dome extends JFrame{
	int a = 0,b = 0;
	public Dome(){
		
		this.setLayout(null);
		
		JLabel jlabel3 = new JLabel();				//����һ���ı�����
		jlabel3.setBounds(125,100,50,30);			//�̶�λ��
		this.add(jlabel3);							//��������Ի���
		
		this.setTitle("0~99999���");				//���ñ���
		this.setBounds(0,0,300,300);				//���öԻ����С
		this.setVisible(true);						//�Ի������
		while(true){								//ѭ��������ť
			JButton jbutton = new JButton();
			jbutton.setText("��ʼ/ֹͣ");
			jbutton.setBounds(100,150,100,30);
			jbutton.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e){
					b = b+1;
				}
			});
			this.add(jbutton);
			while(b%2==0){							//ѭ�����������
				a = (int)(Math.random()*99999);
				jlabel3.setText(""+a);
			}
		}
	}
	public static void main(String[] args) {
		new Dome();									//���ù�����

	}

}
