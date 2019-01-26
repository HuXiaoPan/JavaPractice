package gjp.dao;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import gjp.domain.Zhangwu;
import gjp.tools.JDBCUtils;

public class ZhangwuDao {
	private QueryRunner qr = new QueryRunner(JDBCUtils.getDataSource());

	public List<Zhangwu> selectAll() {
		try {
			return qr.query("SELECT * FROM gjp_zhangwu;", new BeanListHandler<Zhangwu>(Zhangwu.class));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException("查询数据失败！");
		}
	}

	public List<Zhangwu> select(String start, String end) {
		// TODO Auto-generated method stub
		try {
			return qr.query("SELECT * FROM gjp_zhangwu WHERE createDate BETWEEN ? AND ?;",
					new BeanListHandler<Zhangwu>(Zhangwu.class), start, end);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException("查询数据失败！");
		}
	}

	public int addZhangwu(Zhangwu zw) {
		// TODO Auto-generated method stub
		try {
			return qr.update("INSERT INTO gjp_zhangwu (flname,money,account,createdate,description) VALUES(?,?,?,?,?)", getParam(zw));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException("添加数据失败");
		}
	}
	
	public int editZhangwu(Zhangwu zw) {
		// TODO Auto-generated method stub
		try {
			return qr.update("UPDATE gjp_zhangwu SET flname=?,money=?,account=?,createDate=?,description=? WHERE zwid=?", getParamWithID(zw));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException("修改数据失败");
		}
	}

	public int dropZhangwu(Zhangwu zw) {
		try {
			return qr.update("DELETE FROM gjp_zhangwu where zwid=?", zw.getZwid());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException("删除数据失败！");
		}
	}
	
	private Object[] getParamWithID(Zhangwu zw) {
		// TODO Auto-generated method stub
		return new Object[] {zw.getFlname(), zw.getMoney(), zw.getAccount(), zw.getCreateDate(), zw.getDescription() ,zw.getZwid() };
	}

	private Object[] getParam(Zhangwu zw) {
		// TODO Auto-generated method stub
		return new Object[] { zw.getFlname(), zw.getMoney(), zw.getAccount(), zw.getCreateDate(), zw.getDescription() };
	}

}
