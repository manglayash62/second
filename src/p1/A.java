package p1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class A {
	public static void main(String[] args) {
		try {
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/yipee","root","1234");
			Statement stmnt = conn.createStatement();
			ResultSet result = stmnt.executeQuery("select * from registration");
			while(result.next()) {
				System.out.println(result.getString(1));
				System.out.println(result.getString(2));
			}
		conn.close();
		}catch(Exception e) {
			System.out.println(e);
		}
	}
}
