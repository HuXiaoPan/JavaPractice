package upLoadImage;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ServerSocket server = new ServerSocket(8000);
		Socket socket = server.accept();
		InputStream in = socket.getInputStream();
		byte[] data = new byte[1024 * 1024 * 5];
		int len = 0;
		FileOutputStream fileOut = new FileOutputStream("D:\\学习\\123321.jpg");

		while ((len = in.read(data)) != -1) {
			fileOut.write(data, 0, len);
		}
		System.out.println("======================================================================");
		socket.shutdownInput();

		socket.getOutputStream().write("上传完毕".getBytes());

	}

}
