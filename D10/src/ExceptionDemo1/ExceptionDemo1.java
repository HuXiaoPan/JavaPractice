package ExceptionDemo1;

public class ExceptionDemo1 {
	public static void main(String[] args) {
		int avg = getAvg(97, 98, 78, -56);
		System.out.println(avg);
	}

	public static int getAvg(int... source) throws testException {
		int sum = 0;
		for (int i : source) {
			if (i < 0) {
				throw new testException("�׳��ҵ��쳣�ˣ�" + i);
			}
			sum += i;
		}
		return sum / source.length;
	}
}
