package StringPractice;

public class StrCount {
	public static void getStrCount(String str) {
		int UCount = 0;
		int LCount = 0;
		int NCount = 0;
		for (int i = 0; i < str.length(); i++) {
			char item = str.charAt(i);
			if (item >= 65 && item <= 90) {
				UCount++;
			} else if (item >= 97 && item <= 122) {
				LCount++;
			} else if (item >= 48 && item <= 57) {
				NCount++;
			}
		}

		System.out.println("本行字符串共有：\n大写字母：" + UCount + "个\n小写字母：" + LCount + "个\n数字：" + NCount + "个");
	}
}
