package Deadlock;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DeadlockProgram dp = new DeadlockProgram();
		Thread th1 = new Thread(dp);
		Thread th2 = new Thread(dp);
		th1.setName("�߳�0");
		th2.setName("�߳�1");
		th1.start();
		th2.start();
	}

}
