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
		
		//主菜单栏
		JMenuBar menuBar = new JMenuBar();  
		JMenu menu1 = new JMenu("文件");  
		JMenu menu2 = new JMenu("编辑");  
		JMenu menu3 = new JMenu("格式");  
		JMenu menu4 = new JMenu("查看");  
		JMenu menu5 = new JMenu("帮助");  
		setJMenuBar(menuBar);  
        menuBar.add(menu1);  
        menuBar.add(menu2);  
        menuBar.add(menu3);  
        menuBar.add(menu4);  
        menuBar.add(menu5);  
        
        //文件二级菜单
        JMenuItem menu11 = new JMenuItem("新建");  
        JMenuItem menu12 = new JMenuItem("打开");  
        JMenuItem menu13 = new JMenuItem("保存");  
        JMenuItem menu14 = new JMenuItem("另存为");     
        JMenuItem menu15 = new JMenuItem("退出");        
        menu1.add(menu11);  
        menu1.add(menu12);  
        menu1.add(menu13);  
        menu1.add(menu14);  
        menu1.addSeparator();    
        menu1.addSeparator();   
        menu1.add(menu15);  
          
        //编辑二级菜单
        JMenuItem menu21 = new JMenuItem("撤销");  
        JMenuItem menu22 = new JMenuItem("剪贴");  
        JMenuItem menu23 = new JMenuItem("复制");  
        JMenuItem menu24 = new JMenuItem("粘贴");  
        JMenuItem menu25 = new JMenuItem("删除");   
        JMenuItem menu26 = new JMenuItem("全选");         
        menu2.add(menu21);  
        menu2.addSeparator();  
        menu2.add(menu22);  
        menu2.add(menu23);  
        menu2.add(menu24);  
        menu2.add(menu25);  
        menu2.addSeparator();    
        menu2.addSeparator();  
        menu2.add(menu26);

        //格式 二级菜单
        JMenuItem menu31 = new JMenuItem("自动换行");  
        JMenuItem menu32 = new JMenuItem("字体");      
        menu3.add(menu31);  
        menu3.add(menu32);  
          
        //查看二级菜单
        JMenuItem menu41=new JMenuItem("状态栏");          
        menu4.add(menu41);  
          
        //帮助  
        JMenuItem menu51 = new JMenuItem("查看帮助");  
        JMenuItem menu52 = new JMenuItem("关于记事本");       
        menu5.add(menu51);  
        menu5.addSeparator();
        menu5.add(menu52);  
		
		this.setTitle("记事本");
		this.setBounds(0,0,400,400);
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		new Dome();

	}

}
