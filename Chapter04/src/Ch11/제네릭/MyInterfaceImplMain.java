package Ch11.제네릭;

public class MyInterfaceImplMain {

	public static void main(String[] args) {
		
		MyInterfaceImpl<String, Integer> my = new MyInterfaceImpl<String, Integer> ();
		
		System.out.println(my.method1("ten"));
		System.out.println(my.method2(10));
	}

}
