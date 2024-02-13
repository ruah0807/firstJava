package Ch04;

public class ForLoop {

	public static void main(String[] args) {
		
		for (int i=0; i<5; i++) {		// 조건식이 거짓일 때까지 반복한다
				// 첫번째로 동작하는 것은 int i =0; 이고
				// 두번째로 동작하는 것은 조건식 i < 5 이다.
				// 세번째로 중괄호 안에 있는 내용이 동작하려면 조건식에서 참이 반환되어야 한다.
				// 네번째로 동작하는 것은 증감연산자가 동작한다.
			
			System.out.println(i);
			
		}
			
	}
}
