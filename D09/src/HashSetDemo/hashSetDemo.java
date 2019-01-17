package HashSetDemo;

import java.util.HashSet;
import java.util.Set;

public class hashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		hashSetTest();
	}
	
	public static void hashSetTest() {
		Set<String> set = new HashSet<String>();
		set.add("a");
		set.add("b");
		set.add("c");
		set.add("d"); 
		
		System.out.println(set);
		for (String string : set) {
			System.out.println(string.hashCode());
		}
	}

}
