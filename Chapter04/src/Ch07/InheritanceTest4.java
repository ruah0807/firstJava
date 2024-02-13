package Ch07;

public class InheritanceTest4 {

	public static void main(String[] args) {
		
		SmartPhone sp = new SmartPhone("02","222-2222","IOS");

//					인스턴스변수는 sp사용
		
		
		sp.call();  	//상위클래스 메소드 실행
		
		sp.game();		// 하위 클래스 메소드 실행
	}

}
