package ExtendPractice;

public class Waiter extends Employee implements VIPServer {

	@Override
	public void VIP() {
		// TODO Auto-generated method stub
		System.out.println("˽�˶��Ʒ���");
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("����Ա�Է�");
	}

	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		System.out.println("����Ա˯��");
	}

	@Override
	public void work() {
		// TODO Auto-generated method stub
		System.out.println("����Ա������");
	}

}
