package ThreadSafety;

public class Tickets implements Runnable {
	private static int ticketsNums = 100;
	private Object obj = new Object();

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while (true) {
			synchronized (obj) {
				if (ticketsNums > 0) {
					try {
						Thread.sleep(10);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println(Thread.currentThread().getName() + "Ïß³ÌÂô³ö" + ticketsNums-- + "ºÅÆ±");
				}
			}
		}
	}

}
