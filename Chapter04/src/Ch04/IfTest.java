package Ch04;

import java.util.Scanner;

public class IfTest {

	public static void main(String[] args) {
		
		
		
		int score = 90 ; 						//저장소 정의 (자료형과 변수이름 지정)
												// 초기화는 91로 했습니다.
		
		if (score >= 60) {  					// 조건식은 score가 60과 같거나 true이고 작으면 false가 된다.
		
			System.out.println("PASS");			// 조건의 반환 값이 true이기 때문에 PASS가 화면에 출력된다.
		}
	}

}
