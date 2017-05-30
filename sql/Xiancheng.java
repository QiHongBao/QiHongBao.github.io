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
		// TODO 自动生成的方法存根
		try{
			//加载驱动　　加载到JVM中
			Class.forName("com.mysql.jdbc.Driver");
			//getConnection()方法，链接到mysql数据库
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","00000");
			//验证链接是否成功
			if(!con.isClosed())
			System.out.println("Succeeded connecting to the Databases");
			//创建statement对象，用来执行sql语句
			Statement sta = con.createStatement();
			//要执行的sql语句
			String sql = sc.next();
			//ResultSet类 存放获取的结果集
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
