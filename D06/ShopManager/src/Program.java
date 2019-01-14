import java.util.ArrayList;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		ArrayList<Item> arr = new ArrayList<Item>();
		init(arr);
		// TODO Auto-generated method stub
		ManagerUI ui = new ManagerUI();
		while (true) {
			ui.FirstUI();
			int operation = choice();
			logic(operation);
		}
	}

	private static void logic(int operation) {
		// TODO Auto-generated method stub
		switch (operation) {
		case 1:
			System.out.println("功能1");
			break;
		case 2:

			break;
		case 3:

			break;
		case 4:

			break;
		case 5:

			break;

		default:
			System.out.println("没有找到此功能！");
			break;
		}
	}

	private static int choice() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		return sc.nextInt();
	}

	private static void init(ArrayList<Item> arr) {
		// TODO Auto-generated method stub
		Item i1 = new Item();
		Item i2 = new Item();
		Item i3 = new Item();

		i1.setName("苹果");
		i2.setName("香蕉");
		i3.setName("鸭梨");
		i1.setCount(111);
		i2.setCount(222);
		i3.setCount(333);
		i1.setPrice(1.1);
		i2.setPrice(2.2);
		i3.setPrice(3.3);
		i1.setID(1);
		i2.setID(2);
		i3.setID(3);

		arr.add(i1);
		arr.add(i2);
		arr.add(i3);
	}

}
