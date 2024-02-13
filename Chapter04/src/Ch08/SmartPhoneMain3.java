package Ch08;

public class SmartPhoneMain3 {

	public static void main(String[] args) {
		
		SmartPhoneImpl4 phone = new SmartPhoneImpl4();
		
		SmartDevice s = phone;  		
		s.turnOn();						// *** s의 변수의 참조형은 SmartDevice 이다.
		
		Phone p = phone;
		p.call();
		
		Application a = phone;
		a.appRun();

	}

}
