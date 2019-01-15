package ExtendPractice;

public class Chef extends Employee implements VIPServer {

	@Override
	public void VIP() {
		// TODO Auto-generated method stub
		System.out.println("³øÊ¦VIP³´²Ë");
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("³øÊ¦³Ô·¹ÁË");
	}

	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		System.out.println("³øÊ¦Ë¯¾õÁË");
	}

	@Override
	public void work() {
		// TODO Auto-generated method stub
		System.out.println("³øÊ¦³´²Ë");
	}

}
