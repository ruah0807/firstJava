package Ch10.예외처리;

import java.util.Scanner;

public class ArithmaticExceptionTest {

	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		try {
			
			System.out.println("나누는 수를 입력하세요");
			int num = sc.nextInt();
			
			int result = 10 / num;
			System.out.println("10/"+num+" = "+ result);
		}catch(ArithmeticException e) {
			System.out.println("0으로 나눌 수 없습니다.");
			e.printStackTrace();
		
			
		}
	}
}
