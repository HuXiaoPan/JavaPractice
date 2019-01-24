package JDBCUtils;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;

public class JDBCUtils {
	private JDBCUtils() {
	}

	private static Connection con;
	static {
		try {
			InputStream in = JDBCUtils.class.getResourceAsStream("/config.properties");
			Properties config = new Properties();
			config.load(in);
			Class.forName(config.getProperty("driverClass"));
			String url = config.getProperty("url");
			String name = config.getProperty("userName");
			String pwd = config.getProperty("password");
			con = DriverManager.getConnection(url, name, pwd);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			throw new RuntimeException("连接数据库失败了");
		}
	}

	public static Connection getConnection() {
		return con;
	}

	public static void close(Statement stat, ResultSet rs) {
		if (con != null) {
			try {
				con.close();
			} catch (Exception e) {}
		}
		if (stat != null) {
			try {
				stat.close();
			} catch (Exception e) {}
		}
		if (rs != null) {
			try {
				rs.close();
			} catch (Exception e) {}
		}
	}
}
