package ch03;

public class CharTypeOperator {

	public static void main(String[] args) {

		char c1 = 'A';  // 저장공간은 유니코드까지 표현하기 위해서 2byte
		int n1 = c1;	// int는 4byte 저장공간을 사용한다.
		
		
		int n2 = c1 + 1;
		
		System.out.println(c1);
		System.out.println(n1);
		System.out.println(n2);
		

	}

}
