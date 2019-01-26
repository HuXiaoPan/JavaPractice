package upLoadImage;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class Client {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Socket socket = new Socket("127.0.0.1", 8000);
		OutputStream out = socket.getOutputStream();
		FileInputStream fileIn = new FileInputStream("D:\\teteIcon.jpg");
		byte[] buffer = new byte[1024 * 1024 * 5];
		int len = fileIn.read(buffer);
		while (len != -1) {
			out.write(buffer, 0, len);
			len = fileIn.read(buffer);
		}
		socket.shutdownOutput();
		
		InputStream in = socket.getInputStream();
		len = in.read(buffer);
		System.out.println(new String(buffer, 0, len));

		fileIn.close();
		socket.close();
	}

}
