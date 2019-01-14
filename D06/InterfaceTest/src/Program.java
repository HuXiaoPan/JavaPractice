
public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Computer c = new Computer();
		c.computerOn();
		c.useUSB(new Mouse());
		c.useUSB(new Keyboard());
		c.computerOff();
	}
}
