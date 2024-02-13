package Ch05;

public class SmartPhone {

	String color = "white";		//
	float size = 5.7f;			//필드
	int volume = 0;				//
	
	
	void call() {
		System.out.println("전화걸기"); 	//메소드
	}
	
	void volumeUp() {
		volume +=1;
	}
	
	void volumeDown() {
		volume -= 1;
	}
	
	
}


// 객체 생성을 해야 클래스를 사용할 수 있다.
// new 연산자라는 도구를 사용한다. 클래스가 저장된 주소를 알려준다.
// 인스턴스 변수에 new 연산자가 알려준 주소를 저장한다.


//				참조형(클래스이름) 변수(소문자 사용) = new 클래스생성자();
// 실제사용 예)
//				SmartPhone smartphone = new SmartPhone(); 
		//
