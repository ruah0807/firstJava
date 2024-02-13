package ch03;

public class Byte {

	public static void main(String[] args) {
		byte a = 64;
		byte b = 64;
		
		byte c = (byte) (a + b);
		
		System.out.println(c);
	
		
		// byte 의 범위 -128 ~ 127
		// 0111 1111 + 1 = 1000 0000 => -128
		// 0000 0000 (-127)
		// 0111 1111 (0)
		// 1000 0000 (128) ??
	}

}
