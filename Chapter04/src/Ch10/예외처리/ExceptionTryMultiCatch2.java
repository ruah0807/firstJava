package Ch10.예외처리;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionTryMultiCatch2 {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		
		
	
		try {
			System.out.println("정수 두 개를 입력해 주세요");
			System.out.print("정수 1 > ");
			int num1 = sc.nextInt();
		
			System.out.print("정수 1 > ");
			int num2 = sc.nextInt();
			
			System.out.println("num1/num2 = "+(num1/num2));
			
		}catch(Exception e){
			System.out.println("오류가 발생했습니다.");
		
		}catch(ArithmeticException e){
			System.out.println("0으로 나누기는 불가능합니다.");	//예외가 발생하면 출력
			System.out.println("프로그램을 종료합니다.");
			
			System.out.println(e.getMessage());
			e.printStackTrace();
		}catch(InputMismatchException e) {
			System.out.println("올바른 숫자를 입력하지 않았습니다.");
		
	
		}
		

	}

}
