package Ch05;

public class Test1 {
	
	static String name = "name";
	int a;
	int b;
	
	
	Test1(int a){
		this.a = a;		// main과 연결하기 위해 this 는 꼭! 필요하다.
	}
	
	
	
	Test1(int a, int b){
		this.a = a;
		this.b = b;
	}
	
	
	Test1(String name){
		this.name = name;
		
	}
	
//	Test1() {};
	
	
	
	
	
	
	public static String getName() {
		return name;
	}
	public static void setName(String name) {
		Test1.name = name;
	}
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	

}
