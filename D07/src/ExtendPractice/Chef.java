package ExtendPractice;

public class Chef extends Employee implements VIPServer {

	@Override
	public void VIP() {
		// TODO Auto-generated method stub
		System.out.println("��ʦVIP����");
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("��ʦ�Է���");
	}

	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		System.out.println("��ʦ˯����");
	}

	@Override
	public void work() {
		// TODO Auto-generated method stub
		System.out.println("��ʦ����");
	}

}
