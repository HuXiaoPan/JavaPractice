package gjp.service;

import java.util.List;

import gjp.dao.ZhangwuDao;
import gjp.domain.Zhangwu;

public class ZhangwuService {
	private ZhangwuDao dao = new ZhangwuDao();
	
	public List<Zhangwu> selectAll(){
		return dao.selectAll();
	}

	public List<Zhangwu> select(String start, String end) {
		// TODO Auto-generated method stub
		return dao.select(start,end);
	}

	public int addZhangwu(Zhangwu zw) {
		// TODO Auto-generated method stub
		return dao.addZhangwu(zw);
	}

	public int editZhangwu(Zhangwu zw) {
		// TODO Auto-generated method stub
		return dao.editZhangwu(zw);
	}
	
	public int dropZhangwu(Zhangwu zw) {
		return dao.dropZhangwu(zw);
	}
}
