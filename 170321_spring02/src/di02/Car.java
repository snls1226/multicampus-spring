package di02;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Lazy(value = false)
@Scope(value = "prototype")
public class Car {

	@Autowired
	@Qualifier("koreaTire")
	private Tire tire;	
	
	public Car() {
		System.out.println("생성자 호출됨");
	}
	
	public void drive() {
		
		if(tire != null) {
			System.out.println(tire.getTire() + "로 주행합니다.");			
		} else {
			System.out.println("Tire is NULL");
		}
	}
	
}
