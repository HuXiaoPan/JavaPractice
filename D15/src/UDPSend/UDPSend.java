package UDPSend;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

public class UDPSend {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		byte[] data = "���UDP".getBytes();
		InetAddress ip = InetAddress.getByName("127.0.0.1");
		DatagramPacket dp = new DatagramPacket(data, data.length, ip, 6000);
		DatagramSocket ds = new DatagramSocket();
		ds.send(dp);
		System.out.println("���ͳɹ�������UDP,���չ��ˣ������ˣ�");
		ds.close();
	}

}
