package reflectDemo;

public class Doctor extends Person {
	public String type = "医生";

	public void say() {
		System.out.println("我是医生，我会做手术");
	}

	@Override
	public String work() {
		// TODO Auto-generated method stub
		System.out.println("做手术做手术做手术做手术做手术");
		return type + "啦啦啦";
	}

}
