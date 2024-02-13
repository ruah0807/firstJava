package Ch07;

public class ClassTypeChange4 {

	public static void main(String[] args) {
		
		AndroidPhone ap = new AndroidPhone("010-0000-0000");
		
		IPhone ip = new IPhone ("010-9999-9999");		// 힙 영역에 저장 (참조형)
		
//		int a = 1; 											 // 스택 영역에 저장 (자료형

		
		
		
		
		System.out.println(ip.toString());
		System.out.println(ap.toString());
		
		System.out.println(ip.getClass().getName());
		System.out.println(ap.getClass().getName());
		
		callByPhone(ip);
		callByPhone(ap);		//메소드의 매개값 타입이 동일하므로 사용할 수 있다.
		
	}
		
//		public static void callByPhone(IPhone phone) {	//매개 변수의 타입이 자식 클래스
//			phone.call();
//		}
//		
//		public static void callByPhone(AndroidPhone phone) {
//			phone.call();
//		}
	
		public static void callByPhone(Phone phone) {   //두번 출력하지 않고 한번에 불러오기.
			phone.call();
		}
		
	
}
