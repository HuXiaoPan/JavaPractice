package IODemo;
import java.io.File;

public class IODemo1 {
	public static void main(String[] args) {
		String pathSeparator = File.pathSeparator;
		System.out.println(pathSeparator);
		String separator = File.separator;
		System.out.println(separator);
		
		try {
			fileTest();
			fileMk();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void fileTest() throws Exception {
		File file = new File("d:\\1");
		System.out.println(file);
		file.createNewFile();
		File file2 = new File("d:\\aabbcc\\b\\c");
		System.out.println(file2.mkdirs());
	}
	
	public static void fileMk() {
		File file2 = new File("d:\\abc\\b\\c");
		System.out.println(file2.mkdirs());
	}
}
