package ListDemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		listTest();
	}

	public static void listTest() {
		List<String> list = new ArrayList<String>();
		list.add("aaa");
		list.add("bbb");
		list.add("ccc");
		list.add("ddd");
		System.out.println(list);
		list.add(1,"222");
		System.out.println(list);
		
		Iterator it = list.iterator();
		while(it.hasNext()) {
			if(it.next().equals("222")) {
				System.out.println("OK");
			}
		}
	}

}
