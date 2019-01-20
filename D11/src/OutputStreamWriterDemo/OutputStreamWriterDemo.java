package OutputStreamWriterDemo;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class OutputStreamWriterDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileOutputStream fos = new FileOutputStream("d:\\abc.txt");
		OutputStreamWriter osw = new OutputStreamWriter(fos);
		osw.write("ÄãºÃ°¡");
		osw.close();
	}

}
