package TCPServer;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ServerSocket server = new ServerSocket(8888);
		Socket socket = server.accept();
		InputStream in = socket.getInputStream();
		byte[] data = new byte[1024];
		int length = in.read(data);
		System.out.println(new String(data, 0,length));
		
		OutputStream out = socket.getOutputStream();
		out.write("ÄãºÃClient~£¡".getBytes());
		
		socket.close();
		server.close();
	}

}
