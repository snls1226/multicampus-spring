package di02;

import org.springframework.stereotype.Component;

@Component
public class KoreaTire implements Tire {
	
	public String getTire() {
		return "국산 타이어";
	}
	
}