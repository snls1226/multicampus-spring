package di01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new GenericXmlApplicationContext("di01/applicationContext.xml");
		
		Car car = context.getBean("car", Car.class);
		Tire tire = context.getBean("tire", Tire.class);
		car.setTire(tire);
		car.drive();
	}
}
