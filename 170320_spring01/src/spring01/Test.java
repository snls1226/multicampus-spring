package spring01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new GenericXmlApplicationContext("spring01/applicationContext.xml");
		System.out.println("?????");
		
		// 컨테이너로 부터 빈 객체 받아오기
		Greeting gr = context.getBean("gr", Greeting.class);
		gr.greeting();
		
		Greeting gr2 = context.getBean("gr", Greeting.class);
		gr2.greeting();
		
		System.out.println(gr);
		System.out.println(gr2);
		
		// Greeting gr = (Greeting) context.getBean("gr");      // 명시적 형변환
		// Greeting gr = context.getBean("gr", Greeting.class); // 자동 형변환
		
		((GenericXmlApplicationContext) context).close();
	}
}
