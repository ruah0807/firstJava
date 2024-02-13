package Ch09;

public class ObjectEquals {

	public static void main(String[] args) {

		Car c1 = new Car();
		Car c2 = new Car();				// 객체 생성을 한다는 것은 실행시킨다는 의미.

		System.out.println("두 객체를 equals() 비교 : " + c1.equals(c2));
		
		c1 = c2;				// c2의 주소를 c1참조변수에 저장
		
		System.out.println("두 참조변수의 참조 값을 동일하게 변경");
		System.out.println("두 객체를 equals() 비교 : " + c1.equals(c2));

				// c1 == c2 와 if를 사용하면 같은 값이 나온다.
	}

}
