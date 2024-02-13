package Ch08;

public abstract class AbstractClass {

	int num;
	String name;
	
	abstract void abstractMethod();		//추상메소드는 중괄호가 없다
	
	void instanceMethod() {
		abstractMethod();
	}
	
	void printData() {
		System.out.println(name);
		
	}
	
	
}
