package Ch09;

public class PersonEquals {

	public static void main(String[] args) {

		Person person1 = new Person("LEE", "20001010-1000000");
		Person person2 = new Person("Lee", "20001010-1000000");
		
		System.out.println("참조변수의 비교");
		System.out.println("person1 == person2 =>" + (person1==person2));
							// 주소가 다르기 때문? 혹은 소문자와 대문자의 차이.
		
		
		System.out.println();
		System.out.println("인스턴스의 equals() 메소드로 비교");
		System.out.println("person1.equals(person2) => " + person1.equals(person2));
	}

}


class Person {
	
	String name;
	String juminNo;
	
	public Person(String name, String juminNo) {
		this.juminNo = juminNo;
	}
	
	@Override
	public boolean equals(Object obj) {			//obj가  person 타입
		
		Person p = null;
		
		if(obj instanceof Person) {				//object타입인지 물어보는 것임.
			System.out.println("1"+ (obj instanceof Person));
			p = (Person) obj;		//강제변환
		}
			//참

		if (p != null && this.juminNo.equals(p.juminNo)) {
			System.out.println("2"+ (obj instanceof Person));
			return true;
		}
		
	
			return false;
		
	}
}










