package LinkedListDemo;

import java.util.LinkedList;

public class LinkListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		linkListTest();
	}
	
	public static void linkListTest() {
		LinkedList<String> link = new LinkedList<String>();
		
		link.addLast("a");
		link.addLast("b");
		link.addLast("c");
		link.addLast("d");
		
		System.out.println(link);
		
		link.addFirst("aaa");
		System.out.println(link);
	}

}
