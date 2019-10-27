package di01;

import java.util.List;

public class Car {

	private Tire tire;
	private List list;
	
	
	public Car() {
		
	}
	
	// 생성자 주입
	public Car(Tire tire) {
		this.tire = tire;
		System.out.println("생성자를 통한 주입");
	}
	
	// 설정자 주입
	public void setTire(Tire tire) {
		this.tire = tire;
		System.out.println("설정자를 통합 주입");
	}
	
	public void drive() {
		System.out.println(tire.getTire() + "로 주행합니다.");
	}
	
	// List 주입
	public void setList(List list) {
		this.list = list;
	}
	
	public void printList() {
		String listStr = "";
		for(int i=0; i<list.size(); i++) {
			listStr += list.get(i) + "\n";
		}
		System.out.println(listStr);
	}
	
}
