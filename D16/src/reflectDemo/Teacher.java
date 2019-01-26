package reflectDemo;

public class Teacher extends Person {
	public String type = "老师";

	public void say() {
		System.out.println("我是老师，我会教学生");
	}

	@Override
	public String work() {
		// TODO Auto-generated method stub
		System.out.println("叫家长叫家长叫家长叫家长叫家长");
		return type + "啦啦啦";
	}
}
