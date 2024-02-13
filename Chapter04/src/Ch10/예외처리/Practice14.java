package Ch10.예외처리;

public class Practice14 {

	static String  str ="";
	
	static void method(int i) {
		try {		
			if ( i == 10 ) throw new Exception();
			str += "A";
			
		}catch( Exception ex ) {
			str += "B";
			return;
			
		}finally {			
			str +="C";
			
		}
		str += "D";
		
	}
	
	public static void main(String[] args) {
		method (5);
		method (10);
		System.out.println(str);
	}
}
