package ArraysTest;

import java.util.Arrays;

public class ArraysTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] i = {5,4,3,2,1};
		Arrays.sort(i);
		for (int j : i) {
			System.out.println(j);
		}
		
		System.out.println(Arrays.binarySearch(i, 3));
		System.out.println(Arrays.toString(i));
	}

}
