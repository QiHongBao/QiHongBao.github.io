package liaotian;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;

@SuppressWarnings("serial")
public class Dome extends JFrame{
	static Scanner sc = new Scanner(System.in);
	static Socket socket = null;
	static String xiaoxi;
	public Dome(){
		
		this.setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JTextArea jtext1 = new JTextArea();
		jtext1.setBounds(10,10,465,290);
		this.add(jtext1);
		
		JTextArea jtext2 = new JTextArea();
		jtext2.setBounds(10,310,465,40);
		this.add(jtext2);
		
		JButton jbutton = new JButton("发送消息");
		jbutton.setBounds(370,370,100,30);
		jbutton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				xiaoxi = jtext2.getText();
				try {
					fayan();
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		});
		this.add(jbutton);
		
		this.setTitle("多人聊天");
		this.setBounds(0,0,500,500);
		this.setVisible(true);								//循环监听按钮
	}
	public static void main(String[] args) {
		new Dome();
		try {
			socket = new Socket("127.0.0.1",7878);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void fayan() throws Exception {
		System.out.println("链接成功，请发言");
		String nei = xiaoxi;
		OutputStream output = socket.getOutputStream();
		output.write(nei.getBytes());
		output.close();
	}

}
