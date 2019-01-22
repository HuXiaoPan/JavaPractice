package WaitAndNotify;

public class Output implements Runnable {
	private Resource r;

	public Output(Resource r) {
		this.r = r;
	}

	@Override
	public void run() {
		while (true) {
			synchronized (r) {
				if(!r.mark) {
					try {
						r.wait();
					} catch (Exception e) {
						// TODO: handle exception
					}
				}
				// TODO Auto-generated method stub
				System.out.println(r.age + "--------" + r.name);
				r.mark = false;
				r.notify();
			}
		}
	}

}
