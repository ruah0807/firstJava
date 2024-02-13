package ch03;

public class CastingOperator {

	public static void main(String[] args) {

		byte num1 = 126;
		byte num2 = 20;
		
		//byte num3 = num1 + num2; //오류발생 
		//num1 변수와 num2 변수가 int 타입으로 변경됨
		//덧셈으 결과도 int 타입이 됨.
		
		//byte num3 = (byte) (num1 + num2); 
		//오류발생 이유는 byte형에 두 변수의 합이 자동으로 타입 변환이 이루어져 int로 변환된다.
		
		int num3 = num1 + num2;
		System.out.println(num3);
		
		byte num4 = (byte) (num1 + num2);
		System.out.println(num4);
		
		// 1001 0011 = -110 (128-18=110)
		// byte 강제변환하면 4byte가 1byte로 변환된다. 1001 0010 => 1001 0010 = -110   // 128-18 =>110
	}

}
