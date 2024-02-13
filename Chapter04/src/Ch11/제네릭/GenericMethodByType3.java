package Ch11.제네릭;

import Ch08.SmartPhoneImpl;

public class GenericMethodByType3 {
	
	public void introduce(MyClass<? super SmartPhoneImpl> t) {
		System.out.println("안녕하세요. "+t.toString()+"입니다.");
	}
}
