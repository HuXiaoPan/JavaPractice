package reflectDemo;

public class Teacher extends Person {
	public String type = "��ʦ";

	public void say() {
		System.out.println("������ʦ���һ��ѧ��");
	}

	@Override
	public String work() {
		// TODO Auto-generated method stub
		System.out.println("�мҳ��мҳ��мҳ��мҳ��мҳ�");
		return type + "������";
	}
}
