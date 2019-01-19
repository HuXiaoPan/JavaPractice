package LotteryRandomNum;

import java.util.Random;

public class LotteryMaker {
	public static void getLotteryNum() {
		int[] lotteryNums = new int[7];
		int temp;
		for (int i = 0; i < 6; i++) {
			do {
				Random r = new Random();
				temp = r.nextInt(33) + 1;
			} while (!checkRepetitiveNum(temp, lotteryNums));

			lotteryNums[i] = temp;
		}
		lotteryNums[6] = new Random().nextInt(16) + 1;

		System.out.println("红球分别是：" + lotteryNums[0] + "，" + lotteryNums[1] + "，" + lotteryNums[2] + "，"
				+ lotteryNums[3] + "，" + lotteryNums[4] + "，" + lotteryNums[5] + "；蓝球是：" + lotteryNums[6] + "；");
	}

	// 红球重复性检查
	private static boolean checkRepetitiveNum(int checkNum, int[] arr) {
		for (int i : arr) {
			if (checkNum == i) {
				return false;
			}
		}
		return true;
	}
}
