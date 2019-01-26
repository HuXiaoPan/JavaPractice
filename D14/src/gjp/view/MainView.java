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
				addZhangwu();
				break;
			case 2:
				editZhangwu();
				break;
			case 3:
				dropZhangwu();
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

	private void dropZhangwu() {
		// TODO Auto-generated method stub
		selectAll();
		System.out.println("请输入要删除数据行的ID：");
		Scanner sc = new Scanner(System.in);
		if (controller.dropZhangwu(new Zhangwu(sc.nextInt())) < 1) {
			System.out.println("删除数据失败！");
		} else {
			System.out.println("删除数据成功！");
		}
	}

	private void editZhangwu() {
		// TODO Auto-generated method stub
		selectAll();
		System.out.println("请输入要操作数据行的ID：");
		Scanner sc = new Scanner(System.in);
		int id = sc.nextInt();
		Zhangwu zw = buildZhangwu();
		zw.setZwid(id);
		if (controller.editZhangwu(zw) < 1) {
			System.out.println("修改数据失败！");
		} else {
			System.out.println("修改数据成功！");
		}
	}

	private void addZhangwu() {
		// TODO Auto-generated method stub

		if (controller.addZhangwu(buildZhangwu()) < 1) {
			System.out.println("添加数据失败！");
		} else {
			System.out.println("添加数据成功！");
		}
	}

	private Zhangwu buildZhangwu() {
		Scanner in = new Scanner(System.in);
		Zhangwu zw = new Zhangwu();
		System.out.println("请输入类别：");
		zw.setFlname(in.next());
		System.out.println("请输入账户：");
		zw.setAccount(in.next());
		System.out.println("请输入金额：");
		zw.setMoney(in.nextDouble());
		System.out.println("请输入时间：");
		zw.setCreateDate(in.next());
		System.out.println("请输入说明：");
		zw.setDescription(in.next());
		return zw;
	}

	private void selectZhangwu() {
		// TODO Auto-generated method stub
		System.out.println("1.查询所有　2.按条件查询　0.返回上级菜单");
		Scanner sc = new Scanner(System.in);
		int choose = sc.nextInt();
		switch (choose) {
		case 1:
			selectAll();
			break;
		case 2:
			select();
			break;
		case 0:
			break;
		default:
			System.out.println("输入错误，请重新输入！");
			selectZhangwu();
			break;
		}

	}

	private void select() {
		// TODO Auto-generated method stub
		System.out.println("按条件查询，请输入日期格式：XXXX-XX-XX");
		Scanner in = new Scanner(System.in);
		System.out.print("请输入查询起始时间：");
		String start = in.next();
		System.out.print("请输入查询结束时间：");
		String end = in.next();

		zhangwuPrint(controller.select(start, end));
	}

	private void selectAll() {
		// TODO Auto-generated method stub
		zhangwuPrint(controller.selectAll());
	}

	private void zhangwuPrint(List<Zhangwu> list) {
		if (list.size() > 0) {
			for (Zhangwu zhangwu : list) {
				System.out.println(zhangwu.toString());
			}
		} else {
			System.out.println("查询结果为空，请重新查询！");
			selectZhangwu();
		}

	}
}
