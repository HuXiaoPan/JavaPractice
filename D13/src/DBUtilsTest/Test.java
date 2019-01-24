package DBUtilsTest;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import JDBCUtils.JDBCUtils;

public class Test {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		Connection con = JDBCUtils.getConnection();

		System.out.println(con);
		String sql = "update sort set sname=? where sid=?";
		PreparedStatement pstat = con.prepareStatement(sql);
		pstat.setString(1, "Œ¿…˙”√∆∑");
		pstat.setInt(2, 12);
		pstat.execute();

		ResultSet rs = pstat.executeQuery("select * from sort;");
		while (rs.next()) {
			System.out.println(rs.getInt(1) + rs.getString(2) + rs.getDouble(3) + rs.getString(4));
		}
	}

}
