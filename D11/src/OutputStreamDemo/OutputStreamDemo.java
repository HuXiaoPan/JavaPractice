package OutputStreamDemo;

import java.io.FileOutputStream;
import java.io.IOException;

public class OutputStreamDemo {
	public static void main(String[] args) throws IOException {
		FileOutputStream fos = new FileOutputStream("d:\\a.txt");
		fos.write(123);
		fos.write("helloStream".getBytes());
		fos.close();
	}
}
