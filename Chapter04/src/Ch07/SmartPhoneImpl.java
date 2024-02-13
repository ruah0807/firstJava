package Ch07;

public class SmartPhoneImpl extends Phone {
	
	String model;
	
	public SmartPhoneImpl (String phoneNumber, String model) { 
							// (매개변수)
		super(phoneNumber); 		//부모클래스 생성자의 매개값을 전달.
		this.model = model;
	}
	
	
		@Override
		void call() {
			super.call();
			System.out.println("이어팟을 사용해서 통화를 합니다.");
		}
		
		

		public static void main(String[] args) {
			SmartPhoneImpl phone = new SmartPhoneImpl("010-9999-0000","IOS");
//									- 객체생성
			phone.call();		
//						자식클래스의 부모클래스 '매소드 오버라이딩'을 한 매소드 호출

	}

}
