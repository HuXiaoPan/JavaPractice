package gjp.view;

import java.util.List;
import java.util.Scanner;

import gjp.controller.ZhangwuController;
import gjp.domain.Zhangwu;

public class MainView {
	private ZhangwuController controller = new ZhangwuController();

	public void run() {
		boolean flag = true;
		Scanner sc = new Scanner(System.in);
		while (flag) {
			System.out.println("---------------管家婆家庭记账软件---------------");
			System.out.println("1.添加账务　2.编辑账务　3.删除账务　4.查询账务　5.退出系统");
			System.out.println("请输入要操作的功能序号[1-5]:");
			int choose = sc.nextInt();
			switch (choose) {
			case 1:
				break;
			case 2:
				break;
			case 3:
				break;
			case 4:
				selectZhangwu();
				break;
			case 5:
				System.out.println("系统已退出，再见！");
				flag = false;
				break;
			default:
				System.out.println("输入错误，请重新输入！");
				break;
			}
		}

	}

	private void selectZhangwu() {
		// TODO Auto-generated method stub
		System.out.println("1.查询所有　2.按条件查询");
		Scanner sc = new Scanner(System.in);
		int choose = sc.nextInt();
		switch (choose) {
		case 1:
			selectAll();
			break;
		case 2:
			select();
			break;
		default:
			System.out.println("输入错误，请重新输入！");
			selectZhangwu();
			break;
		}

	}

	private void select() {
		// TODO Auto-generated method stub
		
	}

	private void selectAll() {
		// TODO Auto-generated method stub
		List<Zhangwu> list = controller.selectAll();
		for (Zhangwu zhangwu : list) {
			System.out.println(zhangwu.toString());
		}
	}
}
