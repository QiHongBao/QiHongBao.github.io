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
            //服务器在9999端口监听客户端的连接  
            ServerSocket ss = new ServerSocket(9999);  
            System.out.println("服务端已开通");  
            while(true){  
                //阻塞的accept方法，当一个客户端连接上，才会返回Socket对象  
                Socket s = ss.accept();  
                System.out.println("已经建立连接");  
                //开启线程处理通信  
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
            //读取客户端发过来的消息  
            String msg = null;  
            try {  
                while((msg = dis.readUTF()) != null){  
                    System.out.println("客户端发来消息" + msg);  
                    String replyMsg = "客户端说 " + msg;  
                    dos.writeUTF(replyMsg);
                }  
            } catch (IOException e) {  
                e.printStackTrace();  
            }  
        }  
    }  
  
}  
