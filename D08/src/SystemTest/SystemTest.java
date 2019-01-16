package SystemTest;

public class SystemTest {

	public static void main(String[] args) {
		
		int[] src = {11,22,33,44,55,66};
		int[] dest = {77,88,99};
		
		System.arraycopy(src, 1, dest, 1, 2);
		
		System.out.println(dest[0]+ "" +dest[1]+dest[2]);
		// TODO Auto-generated method stub
		System.out.println(System.currentTimeMillis());
		System.gc();
		System.out.println(System.getProperties());
		System.exit(0); 
	}

}
