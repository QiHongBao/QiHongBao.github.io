package wzq;

import java.io.DataInputStream;  
import java.io.DataOutputStream;  
import java.io.IOException;  
import java.net.ServerSocket;  
import java.net.Socket;  
  
public class Fuwu {  
      
    public static void main(String[] args) {  
        new Fuwu().startServer();  
    }  
      
    public void startServer(){  
        try {  
            //��������9999�˿ڼ����ͻ��˵�����  
            ServerSocket ss = new ServerSocket(9999);  
            System.out.println("������ѿ�ͨ");  
            while(true){  
                //������accept��������һ���ͻ��������ϣ��Ż᷵��Socket����  
                Socket s = ss.accept();  
                System.out.println("�Ѿ���������");  
                //�����̴߳���ͨ��  
                new CommunicateThread(s).start();  
            }  
        } catch (IOException e) {  
            e.printStackTrace();  
        }  
    }  
      
    public class CommunicateThread extends Thread{  
          
        Socket socket;  
        DataInputStream dis;  
        DataOutputStream dos;  
          
        public CommunicateThread(Socket socket){  
            this.socket = socket;  
            try {  
                dis = new DataInputStream(socket.getInputStream());  
                dos = new DataOutputStream(socket.getOutputStream());  
            } catch (IOException e) {  
                e.printStackTrace();  
            }  
        }  
          
        @Override  
        public void run() {  
            super.run();  
            //��ȡ�ͻ��˷���������Ϣ  
            String msg = null;  
            try {  
                while((msg = dis.readUTF()) != null){  
                    System.out.println("�ͻ��˷�����Ϣ" + msg);  
                    String replyMsg = "�ͻ���˵ " + msg;  
                    dos.writeUTF(replyMsg);
                }  
            } catch (IOException e) {  
                e.printStackTrace();  
            }  
        }  
    }  
  
}  
