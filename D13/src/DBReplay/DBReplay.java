package DBReplay;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/*
 * 1.ע������
 * 2.�������
 * 3.���ִ����
 * 4.ִ�����
 * 5.������
 * 6.�ͷ���Դ
 */
public class DBReplay {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		// TODO Auto-generated method stub
		
		//1.ע������
		//DriverManager.registerDriver(new Driver());
		Class.forName("com.mysql.jdbc.Driver");
		
		//2.�������
		String url = "jdbc:mysql://localhost:3306/mybase?useSSL=false";
		String name = "root";
		String pwd = "123456";
		Connection con = DriverManager.getConnection(url, name, pwd);
		
		//3.���ִ����
		//Statement stat = con.createStatement();
		String sql = "insert into sort(sname,sprice,sdesc) values(?,?,?);";
		PreparedStatement pstat = con.prepareStatement(sql);
		System.out.println(con);
		
		//4.ִ�����
		//String sql = "insert into sort(sname,sprice,sdesc) values('������Ʒ',50000,'����Ǽ�');";
		pstat.setString(1,"ϴ����Ʒ");
		pstat.setInt(2, 800);
		pstat.setObject(3, "���˦��");
		int resultNum = pstat.executeUpdate();
		sql = "select * from sort;";
		pstat = con.prepareStatement(sql);
		ResultSet rs = pstat.executeQuery(); 
		
		//5.������
		System.out.println(resultNum);
		while (rs.next()) {
			System.out.println(rs.getInt("sid") + rs.getString("sname") + rs.getDouble(3) + rs.getObject(4));
		}
		
		//6.�ͷ���Դ
		rs.close();
		con.close();
		pstat.close();
	}

}
