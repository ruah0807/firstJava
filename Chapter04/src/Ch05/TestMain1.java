package Ch05;

public class TestMain1 {

	public static void main(String[] args) {

		
		
		Test1 t = new Test1(10);
				
		System.out.println(t.a);
	
		
		
		
		Test1 t1 = new Test1(11, 20); 	//이미 t가 있기 때문에 t1으로 쓴다.
		
		System.out.println(t1.a);
		System.out.println(t1.b);
		System.out.println("a + b = " + (t1.a + t1.b));
		
		
		
		Test1 t2 = new Test1("Ruah");
		System.out.println(t.getName());
	}
	}

