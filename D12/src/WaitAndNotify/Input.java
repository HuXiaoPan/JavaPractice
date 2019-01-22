package WaitAndNotify;

public class Input implements Runnable {
	private Resource r;
	public Input(Resource r) {
		this.r = r;
	}

	@Override
	public void run() {
		int i = 0;
		// TODO Auto-generated method stub
		while (true) {
			synchronized (r) {
				
				if(r.mark) {
					try {
						r.wait();
					} catch (Exception e) {
						// TODO: handle exception
					}
				}
				
				if (i % 2 == 0) {
					r.age = 18;
					r.name = "����";
				} else {
					r.age = 20;
					r.name = "����";
				}
				i++;
				r.mark = true;
				r.notify();
			}
		}
	}

}
