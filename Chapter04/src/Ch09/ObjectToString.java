package Ch09;

public class ObjectToString {

	public static void main(String[] args) {


		Car c1 = new Car();
		Car c2 = new Car();
		
		System.out.println(c1);
		System.out.println(c2);			// new Car 가 실행되는 것임.

	}

}
	class Car{
		
		@Override
		public String toString() {
			return "Car Class 기반의 인스턴스 입니다.";
		}
	}