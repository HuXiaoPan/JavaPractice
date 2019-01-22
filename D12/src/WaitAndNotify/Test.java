package WaitAndNotify;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Resource r = new Resource();
		Input in = new Input(r);
		Output out = new Output(r);
		
		Thread th1 = new Thread(in);
		Thread th2 = new Thread(out);
		
		th1.start();
		th2.start();
		
	}

}
