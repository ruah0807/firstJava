package Ch04;

public class SwitchCaseTest1 {

		public static void main(String[] args) {
			
			int score = 75;
			
			switch ( score/10 ) {		// 결과값이 9.3 등의 소수점일 경우 소수점은 없어진 결과 값이 나온다.
			
			case 10 :
				System.out.println("만점");
				break;                      // break를 걸지 않으면 아래로 넘어가버림.
				
			case 9:
				System.out.println("A");	//9 인경우 90~99의 범위
				break;
				
			case 8:
				System.out.println("B");
				break;
				
			case 7:
				System.out.println("C");
				break;
				
			case 6 :
				System.out.println("D");
				break;
				
			default : 							//default가 없다면 결과값이 출력되지 않는다.
				System.out.println("F");
				break;
				
				
				//
			}
		}
}
