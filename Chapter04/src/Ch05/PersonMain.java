package Ch05;

public class PersonMain {

	
	public static void main(String[] args) {
		
		Person ps = new Person();
		
		
		ps.setName("손흥민"); // setter 메소드를 통하여 간접적으로 접근가능.
//								name 제어자가 private 이기 때문에
		ps.setAge(28);
		ps.tell();
	}
}
