package Deadlock;

public class DeadlockProgram implements Runnable {

	private int i = 0;

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while (true) {
			if (i % 2 == 0) {
				synchronized (LockA.lockA) {
					System.out.println(Thread.currentThread().getName() + "偶数私有变量获得A锁" + "	i=" + i);
					synchronized (LockB.lockB) {
						System.out.println(Thread.currentThread().getName() + "偶数私有变量获得B锁" + "	i=" + i);
					}
				}
			} else {
				synchronized (LockB.lockB) {
					System.out.println(Thread.currentThread().getName() + "奇数私有变量获得B锁" + "	i=" + i);
					synchronized (LockA.lockA) {
						System.out.println(Thread.currentThread().getName() + "奇数私有变量获得A锁" + "	i=" + i);
					}
				}
			}
			i++;
		}
	}
}
