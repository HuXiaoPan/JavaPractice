package PropertiesDemo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

public class PropertiesDemo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Properties p = new Properties();
		p.setProperty("a", "1");
		p.setProperty("#b", "2");
		p.setProperty("c", "3");
		
		System.out.println(p.getProperty("b"));
		p.load(new FileInputStream("d:\\test.properties"));
		System.out.println(p);
		
		p.store(new FileOutputStream("d:\\test.properties"),"¸Ä¶¯");
		
	}

}
