package TCPClient;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class TCPClient {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Socket socket = new Socket(InetAddress.getByName("127.0.0.1"), 8888);
		OutputStream out = socket.getOutputStream();
		out.write("ÄãºÃserver£¡".getBytes());
		
		InputStream in = socket.getInputStream();
		byte[] data = new byte[1024];
		System.out.println(new String(data,0,in.read(data)));
	}

}
