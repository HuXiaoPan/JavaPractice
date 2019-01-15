package EqualsTest;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1 = new Person("张三",18);
		Person p2 = new Person("张三",24);
		System.out.println(p1.equals(p2));
		System.out.println(p1.equals(p1));
	}

}
