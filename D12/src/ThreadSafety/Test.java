package ThreadSafety;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tickets t = new Tickets();
		new Thread(t).start();;
		new Thread(t).start();;
		new Thread(t).start();;
	}

}
