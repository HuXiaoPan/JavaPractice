package ThreadDemo;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestThread myThread = new TestThread();
		Thread th2 = new Thread(new InterThreadDemo());
		th2.setName("�ŷ�");
		myThread.setName("����");

		Thread th = Thread.currentThread();
		th.setName("����");
		myThread.start();
		th2.start();
		new Thread() {
			public void run() {
				setName("����");
				for (int i = 0; i < 1000; i++) {
					try {
						sleep(1000);
						System.out.println(getName() + "�̣߳�" + i + " =================");
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}.start();
		new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub

			}
		});

		for (int i = 0; i < 1000; i++) {
			try {
				Thread.sleep(10);
				System.out.println(th.getName() + "�̣߳�" + i + " ��");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
