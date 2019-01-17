package MapDemo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		mapTest();
		mapTest1();
	}

	public static void mapTest() {
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("a", 1);
		map.put("b", 2);
		map.put("c", 3);
		map.put("c", 4);
		System.out.println(map);
	}

	public static void mapTest1() {
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "a");
		map.put(2, "b");
		map.put(3, "c");
		map.put(4, "d");

		Set<Integer> set = map.keySet();
		Iterator it = set.iterator();
		while(it.hasNext()) {
			int key = (Integer)it.next();
			System.out.println(map.get(key));
		}
		System.out.println(set.getClass());
	}
}
