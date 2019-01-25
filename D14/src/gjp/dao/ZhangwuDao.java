package gjp.dao;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import gjp.domain.Zhangwu;
import gjp.tools.JDBCUtils;

public class ZhangwuDao {
	private QueryRunner qr = new QueryRunner(JDBCUtils.getDataSource());
	
	public List<Zhangwu> selectAll(){
		try {
			return qr.query("SELECT * FROM gjp_zhangwu;", new BeanListHandler<>(Zhangwu.class));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException("²éÑ¯Êý¾ÝÊ§°Ü£¡");
		}
	}
}
