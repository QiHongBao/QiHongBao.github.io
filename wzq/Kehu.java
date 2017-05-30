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
            //连接到服务器  
            Socket socket = new Socket("127.0.0.1", 9999);  
            DataInputStream dis = new DataInputStream(socket.getInputStream());  
            DataOutputStream dos = new DataOutputStream(socket.getOutputStream());  
            Scanner scanner = new Scanner(System.in);  
            String line = null;  
            listenServerReply(dis);  
            while((line = scanner.nextLine()) != null){//读取从键盘输入的一行  
                dos.writeUTF(line);//发给服务端  
                System.out.println("告诉服务器 " + line);  
            }  
        } catch (Exception e) {  
            e.printStackTrace();  
        }  
    }  
      
    //监听服务端回复的消息  
    public void listenServerReply(final DataInputStream dis){  
        new Thread(){  
            @Override  
            public void run() {  
                super.run();  
                String line = null;  
                try {  
                    while((line = dis.readUTF()) != null){  
                        System.out.println("来自服务器的消息" + line);  
                    }  
                } catch (IOException e) {  
                    e.printStackTrace();  
                }  
            }  
        }.start();  
    }  
  
}  