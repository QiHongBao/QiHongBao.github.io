 package jishiben;

import javax.swing.*;

@SuppressWarnings("serial")
public class Dome extends JFrame{
	public Dome(){
		
		this.setLayout(null);
		
		JTextArea jtext1 = new JTextArea();
		jtext1.setBounds(0,0,400,400);
		jtext1.setLineWrap(true);
		this.add(jtext1);
		
		//���˵���
		JMenuBar menuBar = new JMenuBar();  
		JMenu menu1 = new JMenu("�ļ�");  
		JMenu menu2 = new JMenu("�༭");  
		JMenu menu3 = new JMenu("��ʽ");  
		JMenu menu4 = new JMenu("�鿴");  
		JMenu menu5 = new JMenu("����");  
		setJMenuBar(menuBar);  
        menuBar.add(menu1);  
        menuBar.add(menu2);  
        menuBar.add(menu3);  
        menuBar.add(menu4);  
        menuBar.add(menu5);  
        
        //�ļ������˵�
        JMenuItem menu11 = new JMenuItem("�½�");  
        JMenuItem menu12 = new JMenuItem("��");  
        JMenuItem menu13 = new JMenuItem("����");  
        JMenuItem menu14 = new JMenuItem("���Ϊ");     
        JMenuItem menu15 = new JMenuItem("�˳�");        
        menu1.add(menu11);  
        menu1.add(menu12);  
        menu1.add(menu13);  
        menu1.add(menu14);  
        menu1.addSeparator();    
        menu1.addSeparator();   
        menu1.add(menu15);  
          
        //�༭�����˵�
        JMenuItem menu21 = new JMenuItem("����");  
        JMenuItem menu22 = new JMenuItem("����");  
        JMenuItem menu23 = new JMenuItem("����");  
        JMenuItem menu24 = new JMenuItem("ճ��");  
        JMenuItem menu25 = new JMenuItem("ɾ��");   
        JMenuItem menu26 = new JMenuItem("ȫѡ");         
        menu2.add(menu21);  
        menu2.addSeparator();  
        menu2.add(menu22);  
        menu2.add(menu23);  
        menu2.add(menu24);  
        menu2.add(menu25);  
        menu2.addSeparator();    
        menu2.addSeparator();  
        menu2.add(menu26);

        //��ʽ �����˵�
        JMenuItem menu31 = new JMenuItem("�Զ�����");  
        JMenuItem menu32 = new JMenuItem("����");      
        menu3.add(menu31);  
        menu3.add(menu32);  
          
        //�鿴�����˵�
        JMenuItem menu41=new JMenuItem("״̬��");          
        menu4.add(menu41);  
          
        //����  
        JMenuItem menu51 = new JMenuItem("�鿴����");  
        JMenuItem menu52 = new JMenuItem("���ڼ��±�");       
        menu5.add(menu51);  
        menu5.addSeparator();
        menu5.add(menu52);  
		
		this.setTitle("���±�");
		this.setBounds(0,0,400,400);
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		new Dome();

	}

}
