package ch03;

public class PrefixOperator {

	public static void main(String[] args) {
		int num1 = 5;
		int num2 = ++num1 ;  // num1 = 1 + num1
		
		System.out.println("num1 의 값 : " + num1);
		System.out.println("num2 의 값 : " + num2);
		System.out.println("++num1 의 값 : " + ++num1); // 7 = 6 + 1

	}

}
