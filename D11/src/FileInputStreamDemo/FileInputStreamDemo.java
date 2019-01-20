package FileInputStreamDemo;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream fis = new FileInputStream("d:\\a.txt");
//		int i = fis.read();
//		System.out.println((char)i);
//		i = fis.read();
//		System.out.println((char)i);
//		i = fis.read();
//		System.out.println((char)i);
//		i = fis.read();
//		System.out.println((char)i);
//		i = fis.read();
//		System.out.println((char)i);
		
		byte[] b = new byte[2];
		int len = 0;
		while ((len =fis.read(b))!=-1) {
			System.out.print(new String(b));
		}
		fis.close();

	}
	
}
