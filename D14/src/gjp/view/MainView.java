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
			System.out.println("---------------�ܼ��ż�ͥ�������---------------");
			System.out.println("1.�������2.�༭����3.ɾ������4.��ѯ����5.�˳�ϵͳ");
			System.out.println("������Ҫ�����Ĺ������[1-5]:");
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
				System.out.println("ϵͳ���˳����ټ���");
				flag = false;
				break;
			default:
				System.out.println("����������������룡");
				break;
			}
		}

	}

	private void selectZhangwu() {
		// TODO Auto-generated method stub
		System.out.println("1.��ѯ���С�2.��������ѯ");
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
			System.out.println("����������������룡");
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
