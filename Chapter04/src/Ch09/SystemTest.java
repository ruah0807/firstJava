package Ch09;

import java.util.Scanner;

public class SystemTest {
	
	public static void main(String[] args) {
		
		String str = "hello";
		String input = null;
		
		Scanner sc = new Scanner(System.in);		//in은System 안에 변수이름이다.
		
		try{
		
		
		while(true) {
			System.out.println("숫자를 입력해주세요. ");
			int num = sc.nextInt();
			System.out.println("입력한 숫자는 : " + num);
			System.out.println();
		
		}

		} catch (Exception e){
		
		System.err.println(e);
		}
		
		System.out.println("프로그램을 종료합니다.");
	}

}
