package gjp.controller;

import java.util.List;

import gjp.domain.Zhangwu;
import gjp.service.ZhangwuService;

public class ZhangwuController {
	private ZhangwuService service = new ZhangwuService();
	
	public List<Zhangwu> selectAll(){
		return service.selectAll();
	}
}
