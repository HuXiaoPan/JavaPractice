package Deadlock;

public class DeadlockProgram implements Runnable {

	private int i = 0;

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while (true) {
			if (i % 2 == 0) {
				synchronized (LockA.lockA) {
					System.out.println(Thread.currentThread().getName() + "ż��˽�б������A��" + "	i=" + i);
					synchronized (LockB.lockB) {
						System.out.println(Thread.currentThread().getName() + "ż��˽�б������B��" + "	i=" + i);
					}
				}
			} else {
				synchronized (LockB.lockB) {
					System.out.println(Thread.currentThread().getName() + "����˽�б������B��" + "	i=" + i);
					synchronized (LockA.lockA) {
						System.out.println(Thread.currentThread().getName() + "����˽�б������A��" + "	i=" + i);
					}
				}
			}
			i++;
		}
	}
}
