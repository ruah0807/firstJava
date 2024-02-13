package Ch05;

public class InstanceVariable {

	static String name = "King";
	static int age = 12;
	
	static void tellName() {
		
		System.out.println("My name is "+ name +".");
	}
	
	static void tellAge() {
		System.out.println("I'm "+ age + " years old.");
	}
	
	public static void main(String[] args) {
		
		InstanceVariable iv = new InstanceVariable();
		InstanceVariable.tellName();
		InstanceVariable.tellAge();
		
	}
}
