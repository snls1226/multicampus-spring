package di02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new GenericXmlApplicationContext("di02/applicationContext.xml");
		System.out.println("?????");
		Car car = context.getBean("car", Car.class);
		Car car2 = context.getBean("car", Car.class);
		System.out.println(car);
		System.out.println(car2);
		car.drive();
	}
}
