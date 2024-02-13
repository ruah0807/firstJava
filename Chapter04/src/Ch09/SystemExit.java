package Ch09;

import java.util.Scanner;

public class SystemExit {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		while(true) {
			
			int num = sc.nextInt();
			if(num ==0) {
				System.out.println("콘솔에 텍스트를 출력합니다.");
			} else if (num == 1) {
				break;									//브레이크 걸릴경우 중괄호 밖으로 가서 "반복문이 종료되었습니다" 가 출력
			} else if( num ==2 ) {
				System.out.println("프로그램을 종료합니다.");
				System.exit(0);					// 정상적으로 종료하기 위해 0을 넣는다.
			}
		}
		System.out.println("반복문이 종료되었습니다.");

	}

}
