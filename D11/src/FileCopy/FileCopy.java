package FileCopy;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {
	public static void main(String[] args) {
		FileInputStream fis = null;
		FileOutputStream fos = null;

		try {
			fis = new FileInputStream("d:\\a.txt");
			fos = new FileOutputStream("d:\\b.txt");
			byte[] arr = new byte[1024];
			int len = 0;
			while ((len = fis.read(arr)) != -1) {
				fos.write(arr, 0, len);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (fos != null) {
					fos.close();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally {
				try {
					if (fis != null) {
						fis.close();
					}
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}
