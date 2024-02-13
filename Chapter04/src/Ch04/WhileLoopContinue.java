package Ch04;

public class WhileLoopContinue {

	public static void main(String[] args) {

		int num = 0;
		
		while (++num <10) {		
			
			if (num % 2 == 1) {		//홀수인지를 판별하는 조건문
				continue; 			// 조건식으로 이동
				
			}
			System.out.println(num);
			
		}

	}

}
