package Ch05;

public class TestMain {

	public static void main(String[] args) {
		
//		int a,b;
		Test t = new Test(10,20); 	//Test(int a=10, int b=20); 
	
//			a = t.getA();
//			b = t.getB();
			
//		System.out.println(a + b);
//				or		
		System.out.println(t.getA());
				// t 변수에 저장되는 데이터는 class가 저장되어있는 메모리주소이다.
		System.out.println(t.getB());
		System.out.println("a + b =" + (t.getA()+t.getB()));
	
		
		
	}

}
