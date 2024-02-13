package Ch04;

public class DowhileLoop {

	public static void main(String[] args) {
		
		int num = 0;
		
		do {
			System.out.println(num);  	// 프로그램 순서에 의해 실행되어 화면에 출력된다.
			num++;	//증감연산자, 후입 연산
			} while (num<5); // 조건이 참이면 반복, 거짓이면 중단.
	}

}
