package Ch05;

public class Singleton {


	 private  Singleton(){}
//			- 생성자
//					 = 대입연산자
		private static Singleton s = new Singleton();
//		     		- add static

//		Singleton.s = null;

		 public static Singleton getInstance() {		//자료형이 아니라 참조형을 넣으면 에러
//			 		- static을 사용하는 이유 : 외부에서 객체를 사용가능하도록 하기 위해
			 
			 if(s==null) {
				 s = new Singleton();
			 }
			 
			 return s;				// 때문에 return을 넣어야 한다.
			 
}
}
