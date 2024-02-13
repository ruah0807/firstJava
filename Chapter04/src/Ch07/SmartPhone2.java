package Ch07;

public class SmartPhone2 extends Phone {

	String model;
	
	void game() {
		
		super.call();
		
		System.out.println(model + "게임을 합니다.");
	}
	
}
