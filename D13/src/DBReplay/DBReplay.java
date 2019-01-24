package DBReplay;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/*
 * 1.注册驱动
 * 2.获得连接
 * 3.获得执行者
 * 4.执行语句
 * 5.处理结果
 * 6.释放资源
 */
public class DBReplay {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		// TODO Auto-generated method stub
		
		//1.注册驱动
		//DriverManager.registerDriver(new Driver());
		Class.forName("com.mysql.jdbc.Driver");
		
		//2.获得连接
		String url = "jdbc:mysql://localhost:3306/mybase?useSSL=false";
		String name = "root";
		String pwd = "123456";
		Connection con = DriverManager.getConnection(url, name, pwd);
		
		//3.获得执行者
		//Statement stat = con.createStatement();
		String sql = "insert into sort(sname,sprice,sdesc) values(?,?,?);";
		PreparedStatement pstat = con.prepareStatement(sql);
		System.out.println(con);
		
		//4.执行语句
		//String sql = "insert into sort(sname,sprice,sdesc) values('汽车用品',50000,'疯狂涨价');";
		pstat.setString(1,"洗漱用品");
		pstat.setInt(2, 800);
		pstat.setObject(3, "清仓甩卖");
		int resultNum = pstat.executeUpdate();
		sql = "select * from sort;";
		pstat = con.prepareStatement(sql);
		ResultSet rs = pstat.executeQuery(); 
		
		//5.处理结果
		System.out.println(resultNum);
		while (rs.next()) {
			System.out.println(rs.getInt("sid") + rs.getString("sname") + rs.getDouble(3) + rs.getObject(4));
		}
		
		//6.释放资源
		rs.close();
		con.close();
		pstat.close();
	}

}
