package ObjectStreamDemo;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Test {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("d:\\Student.txt"));
		oos.writeObject(new Student("ÕÅÈý",15,"³õÈý","12345678901"));
		oos.close();
	}

}
