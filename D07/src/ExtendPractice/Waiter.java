package ExtendPractice;

public class Waiter extends Employee implements VIPServer {

	@Override
	public void VIP() {
		// TODO Auto-generated method stub
		System.out.println("私人定制服务");
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("服务员吃饭");
	}

	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		System.out.println("服务员睡觉");
	}

	@Override
	public void work() {
		// TODO Auto-generated method stub
		System.out.println("服务员传菜了");
	}

}
