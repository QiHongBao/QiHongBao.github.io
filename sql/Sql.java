package sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class Sql implements Runnable{
	static Scanner sc = new Scanner(System.in);
	public Sql(){
		run();
	}
	public static void main(String[] args){
		new Sql();
	}
	@Override
	public void run() {
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","00000");
			if(!con.isClosed())
			System.out.println("Succeeded connecting to the Databases");
			Statement sta = con.createStatement();
			String sql = sc.next();
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