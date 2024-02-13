package Ch08;

public class SmartPhoneMain1 {

	public static void main(String[] args) {
		
//		Phone phone = new Phone();			/생성불가 부모클래스라서
		
//		SmartPhone smartPhone = new SmartPhone("010-0000-0000", "IOS");

		Phone1 smartPhone = new SmartPhone1("010-0000-0000", "IOS");
		
		smartPhone.turnOn();

		

	}

}
