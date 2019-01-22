package Deadlock;

public class LockA {
	private LockA() {}
	public final static LockA lockA = new LockA();
}
