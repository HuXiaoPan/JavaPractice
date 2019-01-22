package LockDemo;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Tickets implements Runnable {
	private static int ticketsNums = 1000;
	private Lock lock = new ReentrantLock();

	@Override
	public void run() {

		// TODO Auto-generated method stub
		while (true) {
			lock.lock();
			if (ticketsNums > 0) {
				try {
					Thread.sleep(10);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println(Thread.currentThread().getName() + "Ïß³ÌÂô³ö" + ticketsNums-- + "ºÅÆ±");
			}
			lock.unlock();
		}
	}
}
