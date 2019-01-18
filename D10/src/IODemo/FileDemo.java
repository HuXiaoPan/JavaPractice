package IODemo;

import java.io.File;

public class FileDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File dir = new File("D:\\360Downloads");
		getAllDir(dir);
	}

	public static void getAllDir(File dir) {
		System.out.println(dir);
		File[] fileArr = dir.listFiles();
		for (File file : fileArr) {
			if (file.isDirectory()) {
				getAllDir(file);
			}else {				
				System.out.println(file);
			}
		}
	}

}
