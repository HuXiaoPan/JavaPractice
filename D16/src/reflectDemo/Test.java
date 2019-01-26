package reflectDemo;

import java.io.InputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Properties;

public class Test {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		InputStream in = Test.class.getClassLoader().getResourceAsStream("config.properties");
		Properties config = new Properties();
		config.load(in);
		Class c = Class.forName(config.getProperty("className"));
		Constructor con = c.getConstructor();
		Person person = (Person) con.newInstance();
		person.say();

		Field f = c.getField(config.getProperty("fidldName"));
		Object value = f.get(person);
		System.out.println(value);

		Method m = c.getMethod(config.getProperty("methodName"));
		Object obj = m.invoke(person);
		System.out.println(obj);
	}

}
