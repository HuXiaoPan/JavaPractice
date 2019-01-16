package DateTest;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		getDate();
	}
	
	public static void getDate() {
		Date date = new Date();
		System.out.println(date.getTime());
		System.out.println(date.toString());
		DateFormat formatter = new SimpleDateFormat("yy-YY-MMMM");
		System.out.println(formatter.format(date));
	}
}
