package reflectDemo;

public class Student extends Person {
	public String type = "学生";

	public void say() {
		System.out.println("我是学生，我狗P都不会");
	}

	@Override
	public String work() {
		// TODO Auto-generated method stub
		System.out.println("写作业写作业写作业写作业写作业");
		return type + "啦啦啦";
	}
}
