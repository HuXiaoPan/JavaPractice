package gjp.dao;

import org.apache.commons.dbutils.QueryRunner;

import gjp.tools.JDBCUtils;

public class ZhangwuDao {
	private QueryRunner qr = new QueryRunner(JDBCUtils.getDataSource());
}
