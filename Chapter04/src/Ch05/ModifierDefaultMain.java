package Ch05;

public class ModifierDefaultMain {

	public static void main(String[] args) {

		ModifierDefault md = new ModifierDefault();
//			참조형 타입
		
//		Default 접근제어자가 접근하려면 위와 같이 인스턴스를 생성하면 된다.
		
		
//		System.out.println(md);        // 입력하면 주소가 나온다.
		
		md.name="손흥민";
		
		md.age = 29;
		
		md.tell();
				
	}

}
