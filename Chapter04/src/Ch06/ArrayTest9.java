package Ch06;

public class ArrayTest9 {

	public static void main(String[] args) {

		Member[] members = new Member[5];
//											-배열 선언 및 객체 생성
		
		members[0] = new Member(1,"cool","시원한");			
		members[1] = new Member(2,"hot","뜨거운");
		members[2] = new Member(3,"son","손흥민");		// 배열변수에 클래스 객체 생성 및 
		members[3] = new Member(4,"park","박지성");		// 생성자의 매개변수를 이용하여 
		members[4] = new Member(5,"cha","차두리");		// 필드 데이터 입력


		for(int i=0; i<members.length; i++) {		
		
			
			
//				출력은 서식문자(printf)를 이용하여 각 필드의 데이터를 출력
//				필드의 데이터 3개를 동시에 출력하기 위해 printf를 사용함.
			System.out.printf("%d, %s, %s \n",	 	
									members[i].memberNo, 
									members[i].memberId, 
									members[i].memberName);
		}
		
		
	}
}


