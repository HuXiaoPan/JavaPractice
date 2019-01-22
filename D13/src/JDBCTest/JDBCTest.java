package JDBCTest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class JDBCTest {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		//DriverManager.registerDriver(new Driver());
		Class.forName("com.mysql.jdbc.Driver");
		
		String url = "jdbc:mysql://192.168.11.107:3306/mybase?useSSL=true";
		String name = "root";
		String pwd = "123456";
		
		Connection conn = DriverManager.getConnection(url, name, pwd);
		System.out.println(conn);
		
		Statement stat = conn.createStatement();
		stat.executeUpdate("insert into sort(sname,sprice,sdesc) values('汽车用品',50000,'疯狂涨价')");
		
		stat.close();
		conn.close();
	}

}
