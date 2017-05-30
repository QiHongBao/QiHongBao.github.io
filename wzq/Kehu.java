package wzq;


import java.io.DataInputStream;  
import java.io.DataOutputStream;  
import java.io.IOException;  
import java.net.Socket;  
import java.util.Scanner;  
  
public class Kehu {  
      
    public static void main(String[] args) {  
        new Kehu().startClient();  
    }  
      
    public void startClient(){  
        try {  
            //���ӵ�������  
            Socket socket = new Socket("127.0.0.1", 9999);  
            DataInputStream dis = new DataInputStream(socket.getInputStream());  
            DataOutputStream dos = new DataOutputStream(socket.getOutputStream());  
            Scanner scanner = new Scanner(System.in);  
            String line = null;  
            listenServerReply(dis);  
            while((line = scanner.nextLine()) != null){//��ȡ�Ӽ��������һ��  
                dos.writeUTF(line);//���������  
                System.out.println("���߷����� " + line);  
            }  
        } catch (Exception e) {  
            e.printStackTrace();  
        }  
    }  
      
    //��������˻ظ�����Ϣ  
    public void listenServerReply(final DataInputStream dis){  
        new Thread(){  
            @Override  
            public void run() {  
                super.run();  
                String line = null;  
                try {  
                    while((line = dis.readUTF()) != null){  
                        System.out.println("���Է���������Ϣ" + line);  
                    }  
                } catch (IOException e) {  
                    e.printStackTrace();  
                }  
            }  
        }.start();  
    }  
  
}  