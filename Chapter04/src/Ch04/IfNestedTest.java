package Ch04;

public class IfNestedTest {

	public static void main(String[] args) {

		int num = -1;
		
		if(num>0) {
			System.out.println("num은 양의 정수 입니다.");
	
		} else {
		
			if(num<0) {
				System.out.println("num은 음의 정수입니다.");
	
			} else {
				System.out.println("num은 0입니다.");
			}
			
		}

	}

}
