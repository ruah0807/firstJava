package Ch05;

public class Person {	// 필드 구성이면서 전역변수.

	private String name;
	private int age;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) { 		
//						- 지역변수이면서 매개변수이다.
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
//	  		- void:반환값이 없음 (return불가)
		this.age = age;
	}
	
	public void tell() {
		System.out.println("안녕하세요. "+age+"살 "+ name + "입니다.");
		
	}
	
	
}
