package Ch07;

public class ClassTypeChange {

	public static void main(String[] args) {
		AndroidPhone androidp = new AndroidPhone ("010-0000-0000");
		
		Phone phone1 = (Phone) androidp;
//							-형 변환 연산자를 이용하여 강제로 형 변환
		phone1.call();
		
		Phone phone2 = androidp; // 형변환 없이 자동변환된다.
		phone2.call();
		
		
		
				

	}

}
