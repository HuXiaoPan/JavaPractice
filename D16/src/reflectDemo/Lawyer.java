package reflectDemo;

public class Lawyer extends Person {
	public String type = "��ʦ";

	public void say() {
		System.out.println("������ʦ���һ���˾");
	}

	@Override
	public String work() {
		// TODO Auto-generated method stub
		System.out.println("���˾���˾���˾���˾���˾");
		return type + "������";
	}
}
