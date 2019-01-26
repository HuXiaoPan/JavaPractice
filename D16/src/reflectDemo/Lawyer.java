package reflectDemo;

public class Lawyer extends Person {
	public String type = "律师";

	public void say() {
		System.out.println("我是律师，我会打官司");
	}

	@Override
	public String work() {
		// TODO Auto-generated method stub
		System.out.println("打官司打官司打官司打官司打官司");
		return type + "啦啦啦";
	}
}
