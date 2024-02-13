package Ch07;

public class Phone {

	String phoneNumber;
				// 데이터를 저장하기위해서 사용 
	
	
	public Phone(String phoneNumber) {		//생성자
		this.phoneNumber = phoneNumber;
		
	}
	
	// 변수 num에 지역번호
//		phoneNumber 옛날번호 222-2222
	
	void call() {
		System.out.println(phoneNumber+" 에서 전화를 걸어 통화를 합니다.");
	}
	


	public String toString() {
		return "반환값 ["+phoneNumber+"]는 저의 전화번호 입니다.";
		
	}
}