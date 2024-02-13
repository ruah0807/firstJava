package Ch09;

public class StringConstructor {

	public static void main(String[] args) {

		byte [] bytes = {74, 97, 118, 97};		//[] 배열
		
		String str01 = new String(bytes); 		//문자배열 자동 문자화 (변환) , ASCII Code 변환
		System.out.println(str01);		
		
		String str02 = new String(bytes, 2, 2);		//int offset, int length // 2번 부터 2개 출력
		System.out.println(str02);

	}

}
