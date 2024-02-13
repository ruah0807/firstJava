package Ch07;

public class ClassTypeChange2 {

	public static void main(String[] args) {
	
		AndroidPhone androidPhone = new AndroidPhone("000-0000-0000");
		
		IPhone iPhone = new IPhone ("010-9999-9999");
		
		Phone phone1 = androidPhone;
		Phone phone2 = iPhone;				// iphone이 자동 형변환하여 Phone으로 변환된다.
		
//		IPhone iPhone = phone2;		
//								-- phone2는 부모크래스이기 때문에 자식 클래스형식으로 자동 변환이 안된다.
		IPhone iPhone1 = (IPhone) phone2;	//형변환
//						강제변환을 통해서 참조타입으로이 변화된다.

		//		Iphone iPhone2 = (Iphone) phone1;  //오류

	}
	

}
