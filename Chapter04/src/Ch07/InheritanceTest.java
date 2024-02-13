package Ch07;

public class InheritanceTest {

	public static void main(String[] args) {
		
		SmartPhone sp = new SmartPhone();
//									객체생성(인스턴스 생성)		
		sp.phoneNumber = "010-8786-3313";
//									멤버 호출 후 데이터 저장
		sp.model = "IPhone";
		
		sp.call();
		
		sp.game();
	

	}

}
