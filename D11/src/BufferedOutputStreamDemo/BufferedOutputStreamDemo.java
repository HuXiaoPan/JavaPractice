package BufferedOutputStreamDemo;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedOutputStreamDemo {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("d:\\a.txt",true));
		bos.write(("HelloWorld"+System.currentTimeMillis()+"\r\n").getBytes());
		bos.close();
	}

}
