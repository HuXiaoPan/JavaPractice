package gjp.service;

import java.util.List;

import gjp.dao.ZhangwuDao;
import gjp.domain.Zhangwu;

public class ZhangwuService {
	private ZhangwuDao dao = new ZhangwuDao();
	
	public List<Zhangwu> selectAll(){
		return dao.selectAll();
	}
}
