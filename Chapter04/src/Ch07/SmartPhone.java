package Ch07;

public class SmartPhone extends Phone {
	
	String model;
	
	public SmartPhone(String num,String phoneNumber, String model) {
		
		super(num,phoneNumber);	
		// 부모클래스의 생성자와 형식이 동일
		this.model = model;
		
		
	}
	
//	 	필드변수에 데이터 저장방법은 2가지
//	   	1. 생성자의 매개 변수를 이용하는 방법
//		2. setter 메소드를 이용하는 방법
	
	void game() {
			System.out.println(model + "게임을합니다.");
	}
	
	
}
