package ch03;

public class TernaryOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 2;
		int num2 = 5;
		
		int min = (num1< num2) ? num1 : num2;
		System.out.println(min);
		
		int max = (num1>num2) ? num1 : num2;
		System.out.println(max);
		
		String result = (num1 % 2 == 0) ? "짝수" : "음수";
		System.out.println("num1은" +result);
		
		result = (num2 % 2 == 0) ? "짝수" : "음수";
		System.out.println("num2는" +result);
	}

}
