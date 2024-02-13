package ch03;

public class PostfixOperator {

	public static void main(String[] args) {
		int num1 = 5;
		int num2 = num1++;  // num1 = num1 + 1 // 숫자뒤에 ++가 나오면 나중 계산. //결국 num1은 6, num2는 5
							// ++는 후입 연산자 이기 때문에 num1데이터가 그대로 num2에 저장된다.
							// 이 후에 num1d의 값은 +1이 되어 num1에 저장된다. 
				
		System.out.println("num1 의 값 : " + num1);
		// num1++에서 6이 된다. 후입 연산자이기 때문에 저장되는 데이터는 나중에 연산된 결과가 된다.
		System.out.println("num2 의 값 : " + num2);
		System.out.println("num1++ 의 값 : " + num1++);
		
		System.out.println("num1 의 값 :" + num1);

	}

}
