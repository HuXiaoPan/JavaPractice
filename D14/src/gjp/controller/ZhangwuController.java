package gjp.controller;

import java.util.List;

import gjp.domain.Zhangwu;
import gjp.service.ZhangwuService;

public class ZhangwuController {
	private ZhangwuService service = new ZhangwuService();
	
	public List<Zhangwu> selectAll(){
		return service.selectAll();
	}

	public List<Zhangwu> select(String start, String end) {
		// TODO Auto-generated method stub
		return service.select(start,end);
	}

	public int addZhangwu(Zhangwu zw) {
		// TODO Auto-generated method stub
		return service.addZhangwu(zw);
	}

	public int editZhangwu(Zhangwu zw) {
		// TODO Auto-generated method stub
		return service.editZhangwu(zw);
	}
	
	public int dropZhangwu(Zhangwu zw) {
		return service.dropZhangwu(zw);
	}
}
