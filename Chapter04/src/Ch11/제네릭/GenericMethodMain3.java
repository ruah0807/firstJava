package Ch11.제네릭;

import Ch08.Phone;
import Ch08.SmartPhoneImpl;


public class GenericMethodMain3 {

	public static void main(String[] args) {
		
		ShowInteger showInteger = new ShowInteger(100);
		MyClass<Phone> my = new MyClass<Phone>();
		my.val = new SmartPhoneImpl();
		
		GenericMethodByType3 byType = new GenericMethodByType3();
		byType.introduce(my);
		
	}
}
