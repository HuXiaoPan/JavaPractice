package ThreadDemo;

public class InterThreadDemo implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 1000; i++) {
			try {
				Thread.currentThread().sleep(10);
				System.out.println(Thread.currentThread().getName() + "Ïß³Ì£º" + i + " ¡ú");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
