package reflectDemo;

public class Doctor extends Person {
	public String type = "ҽ��";

	public void say() {
		System.out.println("����ҽ�����һ�������");
	}

	@Override
	public String work() {
		// TODO Auto-generated method stub
		System.out.println("������������������������������");
		return type + "������";
	}

}
