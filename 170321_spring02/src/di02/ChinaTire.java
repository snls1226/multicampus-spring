package di02;

import org.springframework.stereotype.Component;

@Component
public class ChinaTire implements Tire {
	
	public String getTire() {
		return "대륙 타이어";
	}
	
}
