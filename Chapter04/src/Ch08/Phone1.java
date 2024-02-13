package Ch08;

public abstract class Phone1 {
	
	
	String phoneNumber;							//필드
	
	
	public Phone1(String phoneNumnber) {			//생성자
		this.phoneNumber = phoneNumber;
	}
	
	
	void call() {
		System.out.println(phoneNumber + "에서 전화를 걸어 통화를 합니다.");
	}

	abstract void turnOn();	//추상 메소드
}
