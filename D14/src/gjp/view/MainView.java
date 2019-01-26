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
				System.out.println("ϵͳ���˳����ټ���");
				flag = false;
				break;
			default:
				System.out.println("����������������룡");
				break;
			}
		}

	}

	private void dropZhangwu() {
		// TODO Auto-generated method stub
		selectAll();
		System.out.println("������Ҫɾ�������е�ID��");
		Scanner sc = new Scanner(System.in);
		if (controller.dropZhangwu(new Zhangwu(sc.nextInt())) < 1) {
			System.out.println("ɾ������ʧ�ܣ�");
		} else {
			System.out.println("ɾ�����ݳɹ���");
		}
	}

	private void editZhangwu() {
		// TODO Auto-generated method stub
		selectAll();
		System.out.println("������Ҫ���������е�ID��");
		Scanner sc = new Scanner(System.in);
		int id = sc.nextInt();
		Zhangwu zw = buildZhangwu();
		zw.setZwid(id);
		if (controller.editZhangwu(zw) < 1) {
			System.out.println("�޸�����ʧ�ܣ�");
		} else {
			System.out.println("�޸����ݳɹ���");
		}
	}

	private void addZhangwu() {
		// TODO Auto-generated method stub

		if (controller.addZhangwu(buildZhangwu()) < 1) {
			System.out.println("�������ʧ�ܣ�");
		} else {
			System.out.println("������ݳɹ���");
		}
	}

	private Zhangwu buildZhangwu() {
		Scanner in = new Scanner(System.in);
		Zhangwu zw = new Zhangwu();
		System.out.println("���������");
		zw.setFlname(in.next());
		System.out.println("�������˻���");
		zw.setAccount(in.next());
		System.out.println("�������");
		zw.setMoney(in.nextDouble());
		System.out.println("������ʱ�䣺");
		zw.setCreateDate(in.next());
		System.out.println("������˵����");
		zw.setDescription(in.next());
		return zw;
	}

	private void selectZhangwu() {
		// TODO Auto-generated method stub
		System.out.println("1.��ѯ���С�2.��������ѯ��0.�����ϼ��˵�");
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
			System.out.println("����������������룡");
			selectZhangwu();
			break;
		}

	}

	private void select() {
		// TODO Auto-generated method stub
		System.out.println("��������ѯ�����������ڸ�ʽ��XXXX-XX-XX");
		Scanner in = new Scanner(System.in);
		System.out.print("�������ѯ��ʼʱ�䣺");
		String start = in.next();
		System.out.print("�������ѯ����ʱ�䣺");
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
			System.out.println("��ѯ���Ϊ�գ������²�ѯ��");
			selectZhangwu();
		}

	}
}
