package InetAdressDemo;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAdressDemo {

	public static void main(String[] args) throws UnknownHostException {
		// TODO Auto-generated method stub
		InetAddress ip =InetAddress.getLocalHost();
		System.out.println(ip);
		
		InetAddress ip2 = InetAddress.getByName("www.baidu.com");
		System.out.println(ip2);
	}

}
