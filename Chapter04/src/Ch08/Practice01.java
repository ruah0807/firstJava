package Ch08;

abstract class parent{
		
	abstract int getNumber();
	
}

public class Child extends Parent{
	
	private int number = 100;
	

	private int getNumber() { 
		return number;
	}
}
