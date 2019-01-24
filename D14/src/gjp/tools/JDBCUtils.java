package gjp.tools;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import javax.sql.DataSource;

import org.apache.commons.dbcp.BasicDataSource;

public class JDBCUtils {
	private static BasicDataSource dataSource = new BasicDataSource();
	static {
		InputStream in = JDBCUtils.class.getResourceAsStream("/config.properties");
		Properties prop = new Properties();
		try {
			prop.load(in);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			throw new RuntimeException("∂¡»°≈‰÷√Œƒº˛ ß∞‹");
		}
		dataSource.setDriverClassName(prop.getProperty("driverClass"));
		dataSource.setUrl(prop.getProperty("url"));
		dataSource.setUsername(prop.getProperty("userName"));
		dataSource.setPassword(prop.getProperty("password"));
		dataSource.setMaxActive(10);
		dataSource.setMaxIdle(5);
		dataSource.setMinIdle(2);
		dataSource.setInitialSize(10);
	}
	
	public static DataSource getDataSource() {
		return dataSource;
	}
}
