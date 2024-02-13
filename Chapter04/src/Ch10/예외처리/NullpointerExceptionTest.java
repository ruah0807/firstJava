package Ch10.예외처리;

import java.util.Scanner;

public class NullpointerExceptionTest {

	public static void main(String[] args) {
		Scanner sc = null;
		
		try {
			System.out.println("나누는 수를 입력해주세요");
			int num = sc.nextInt();
			int result = 10 / num;
			
			System.out.println("10 / " + num + "= " + result );
		}catch(NullPointerException e) {
			System.out.println("참조변수가 Null을 참조하고 있습니다.");
			e.printStackTrace();
		}

	}

}
