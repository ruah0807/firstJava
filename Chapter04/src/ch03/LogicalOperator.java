package ch03;

import java.util.Scanner;

public class LogicalOperator {

	public static void main(String[] args) {

		Scanner	sc = new Scanner (System.in); 			//객체 생성 메모리에 저장해서 프로그램이 호출할 수 있는 조건을 만드는 것.
		
		int num1, num2;
		System.out.print("num1에 저장할 숫자를 입력하세요 >>");
		num1 = sc.nextInt();							 //메소드를 실행하면 Scanner에 의해서 저장될 수 있도록 실행된다.
		
		System.out.print("num2에 저장할 숫자를 입력하세요 >>");
		num2 = sc.nextInt();
		
	
	
		
		System.out.println(num1 > 10 && num1 < 50);
								// 두개의 결과가 모두 true가 되므로 결과는 true가 된다.

		System.out.println( num1 < 10 && num1 < 50 );
								// 앞의 비교연산에서 num1이 10보다 크기 때문에 false이고, 뒤의 비교 연산자는 true이다.
								// 2개의 연산 결과를 AND(&&) 논리연산을 하면 false가 된다.
		System.out.println( num1 > 10 || num2 > 10 );
								 				
								 
		System.out.println( num1 < 10 || num2 > 10 );

	}

}
