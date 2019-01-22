package UpdateAndQuery;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class Test {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.jdbc.Driver");

		String url = "jdbc:mysql://192.168.31.32:3306/mybase?useSSL=false";
		String name = "root";
		String pwd = "123456";
		Connection conn = DriverManager.getConnection(url, name, pwd);
		Statement stat = conn.createStatement();

		ResultSet rs = stat.executeQuery("select * from sort;");

		while (rs.next()) {
			System.out.println(rs.getInt("sid") + "    " + rs.getString("sname") + "    " + rs.getDouble("sprice")
					+ "    " + rs.getString("sdesc"));
		}

		rs.close();
		stat.close();
		conn.close();
	}

}
