package reflectDemo;

public class Student extends Person {
	public String type = "ѧ��";

	public void say() {
		System.out.println("����ѧ�����ҹ�P������");
	}

	@Override
	public String work() {
		// TODO Auto-generated method stub
		System.out.println("д��ҵд��ҵд��ҵд��ҵд��ҵ");
		return type + "������";
	}
}
