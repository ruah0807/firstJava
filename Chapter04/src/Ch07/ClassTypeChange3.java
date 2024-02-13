package Ch07;

public class ClassTypeChange3 {

	public static void main(String[] args) {
		
	AndroidPhone androidPhone = new AndroidPhone("000-0000-0000");
		
		IPhone iPhone = new IPhone ("010-9999-9999");
		
		
		
		Phone phone1 = androidPhone;		// 여기서는 자식타입에서 부모 타입으로 가는 것은 자동타입 변경가능 하다.
		Phone phone2 = iPhone;				// iphone이 자동 형변환하여 Phone으로 변환된다.
		
		
		System.out.println(phone1.getClass().getName());	//자료타입확인
		System.out.println(phone2.getClass().getName());	//자료타입확인
		
		
		IPhone iPhone1 = null;
		
		
		if(phone2 instanceof IPhone) {		//True
			iPhone1 = (IPhone) phone2;		//변수 phone2의 타입은 phone(부모)
			iPhone1.call();					//iPhone1 변수 타입은 IPhone(자식)
											// 부모타입의 변수를 자식타입 변수로 변환하려면 강제변환을 해야한다.
		}else {
			System.out.println("자료형 변환이 불가합니다.");
		}
		
		
		
		IPhone iPhone2 = null;
		
		
		if(phone1 instanceof IPhone) {		//False
			iPhone2 = (IPhone) phone1;
			iPhone2.call();
		}else {
			System.out.println("자료형 변환이 불가합니다.");
	}
		
		
		System.out.println(phone2 instanceof IPhone);
		System.out.println(phone1 instanceof IPhone);

	}

}
