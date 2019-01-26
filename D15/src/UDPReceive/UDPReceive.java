package UDPReceive;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UDPReceive {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		DatagramSocket ds = new DatagramSocket(6000);
		byte[] data = new byte[1024];
		DatagramPacket dp = new DatagramPacket(data, data.length);
		ds.receive(dp);
		for (int i = 0; i < data.length; i++) {
			System.out.print(data[i]);
		}
		System.out.println(data.toString());
		System.out.println("数据接收完毕");
		ds.close();
	}
}
