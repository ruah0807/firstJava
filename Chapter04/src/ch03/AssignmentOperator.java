package ch03;

public class AssignmentOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 10;
		
		num += 5; 	//num=10+5
		System.out.println( num );
		
		num -= 5; 	//num=15-5
		System.out.println( num );
		
		num *= 2; 	// 10*2
		System.out.println( num );
		
		num /= 2; 	//  20/2
		System.out.println( num );
		
		num %= 3; 	//	20%2
		System.out.println( num );
		
		short snum1 = 20;
		short snum2 = 30;
		snum1 += snum2;
		System.out.println(snum1);
		
		num = snum1 = snum2 ;
		
		System.out.println( "num = " +num);
		System.out.println( "snum1 = " +snum1 );
		System.out.println( "snum2 = " +snum2 );
		
	}

}
