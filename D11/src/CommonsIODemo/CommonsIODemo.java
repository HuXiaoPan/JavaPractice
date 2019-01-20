package CommonsIODemo;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;

public class CommonsIODemo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println(FilenameUtils.getBaseName("abc.java"));
		FileUtils.copyFile(new File("d:\\a.txt"), new File("d:\\aa.txt"));
	}

}
