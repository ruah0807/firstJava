package Ch10.예외처리;

import java.util.Scanner;

public class ExceptionTryCatchFinally {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수 두개를 입력하시오");
		System.out.println("정수 1 > ");
		int num1 = sc.nextInt();
				
		System.out.println("정수 1 > ");
		int num2 = sc.nextInt();
		
	try {
		
		System.out.println("num1/num2 = " + (num1/num2));
		
	}catch(ArithmeticException e){
		System.out.println("0으로는 나누기 불가능합니다");
		System.out.println(e.getMessage());
//		return; 
		 // 리턴시에도 finally구문은 동작한다.
		
	} finally {
		System.out.println("프로그램을종료합니다.");
	}
	}

}
