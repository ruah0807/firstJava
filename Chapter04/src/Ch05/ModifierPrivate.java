package Ch05;

public class ModifierPrivate {

		private String name="ruah";		//필드군
		private int age=34;
									// 생성자는 생략되어있다.(default생성자)
		void tell() {				//default 제어자 사용, 메소드
			System.out.println("안녕하세요. " +age+ "살 "+name+"입니다." );
		}
}
