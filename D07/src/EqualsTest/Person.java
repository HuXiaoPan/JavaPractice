package EqualsTest;

public class Person {
	private String name;
	private int age;
	
	public Person() {};
	public Person(String name,int age) {
		setName(name);
		setAge(age);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if (obj == null) {
			return false;
		}
		
		if (this == obj) {
			return true;
		}
		if (obj instanceof Person) {
			Person p = (Person) obj;
			return this.name == p.name;
		}
		return false;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name;
	}
}
