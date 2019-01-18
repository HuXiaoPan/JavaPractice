package ExceptionDemo;

public class ExceptionDemo {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		try {
			int[] arr = null;
			System.out.println(getNum(arr));
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		try {
			int[] arr2 = { 1, 2, 3 };
			System.out.println(getNum(arr2));
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}

	public static int getNum(int[] arr) throws Exception {
		if (arr == null) {
			throw new NullPointerException("数组为空！");
		}
		if (arr.length < 4) {
			throw new Exception("太短了");
		}
		
		int i = arr[3];
		return i + 1;
	}

}
