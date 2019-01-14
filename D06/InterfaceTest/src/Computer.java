
public class Computer {
	public void computerOn() {
		System.out.println("开机");
	}
	
	public void computerOff() {
		System.out.println("关机");
	}
	
	public void useUSB(USB usb) {
		usb.USBOn();
		usb.USBOff();
	}
}
