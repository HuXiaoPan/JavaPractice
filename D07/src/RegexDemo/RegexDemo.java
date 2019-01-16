package RegexDemo;

public class RegexDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(checkQQ("85045512"));
		System.out.println(checkQQ("qq85045512"));
		System.out.println(checkPhoneNum("13678548592"));
		System.out.println(checkPhoneNum("136785485921"));
		for (String string : strSplit("abcsadkaaaaajfijlk,aolanalspfg.;", "[a|c]+")) {
			System.out.println(string);
		}
		System.out.println(checkMail("hupan008@qq.com"));

	}

	public static boolean checkQQ(String qq) {
		return qq.matches("[1-9][0-9]{4,9}");
	}

	public static boolean checkPhoneNum(String phoneNum) {
		return phoneNum.matches("1[34578][0-9]{9}");
	}

	public static String[] strSplit(String str, String spl) {
		return str.split(spl);
	}
	
	public static boolean checkMail(String mail) {
		return mail.matches("[0-9a-zA-Z_]+\\@[0-9a-z]+(\\.[a-z]+)+");
	}

}
