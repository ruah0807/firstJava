package Ch05;

public class SmartPhoneMain {

	public static void main(String[] args) {
		
		SmartPhone sp = new SmartPhone();    // 객체생성 (인스턴스 생성)
										//반드시 *클래스 이름과 생성자 이름이 같아야 끌어쓸수 있음.
										//sp가 저장하는 데이터는 SmartPhone class가 저장된 메모리 주소가 저장된다.
		
		
		System.out.println(sp.color);
		System.out.println(sp.size);
		System.out.println(sp.volume);
		
		
		
		sp.call();
		
		
		
		sp.volumeUp();
		System.out.println(sp.volume);
		
		
		
		sp.volumeDown();
		System.out.println(sp.volume);
	}

}
