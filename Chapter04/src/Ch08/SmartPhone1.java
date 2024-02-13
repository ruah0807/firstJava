package Ch08;

public class SmartPhone1 extends Phone1 {
	
	
	String model;										///메모리 할당
	
	
	public SmartPhone1(String phoneNumber, String model) {
		super(phoneNumber);
		this.model = model;								//메모리 저장			
	}
	
	void game() {
		System.out.println(model+"게임을 합니다.");			// 출력				
	}	
	

	@Override
	void turnOn() {
		System.out.println(model + "모델에 맞게 전원을 켰습니다.");		//출력
	}

}
