package sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class Xiancheng implements Runnable{
	Scanner sc = new Scanner(System.in);
	@Override
	public void run() {
		// TODO �Զ����ɵķ������
		try{
			//���������������ص�JVM��
			Class.forName("com.mysql.jdbc.Driver");
			//getConnection()���������ӵ�mysql���ݿ�
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","00000");
			//��֤�����Ƿ�ɹ�
			if(!con.isClosed())
			System.out.println("Succeeded connecting to the Databases");
			//����statement��������ִ��sql���
			Statement sta = con.createStatement();
			//Ҫִ�е�sql���
			String sql = sc.next();
			//ResultSet�� ��Ż�ȡ�Ľ����
			ResultSet rs = sta.executeQuery(sql);
			while(rs.next()){
				String name = rs.getString("sname");
				int id = rs.getInt("id");
				System.out.println(name+"\t"+id);
			}
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	

}
