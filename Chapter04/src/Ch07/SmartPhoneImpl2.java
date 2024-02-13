package Ch07;

public class SmartPhoneImpl2 extends Phone {

	String model;
	
	public SmartPhoneImpl2(String phoneNumber, String model) {
		super(phoneNumber);
		this.model = model;
	}
	
	@Override
	void call() {
		super.call();
		System.out.println("이어팟을 사용해서 통화를 합니다.");
		
	}
	
	void playMusic() {
		System.out.println("다이너마이트가 플레이 됩니다.");
		
	}

}
