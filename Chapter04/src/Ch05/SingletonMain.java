package Ch05;

public class SingletonMain {

	public static void main(String[] args) {
		
		Singleton s = Singleton.getInstance();
//			 
//		Singleton s = new Singleton //Error

		System.out.println(Singleton.getInstance());
//							-본래 싱글톤 클래스에 new 를 이용하여 주소를 만들어놨기때문에

		System.out.println(s);
	
	
	}
	
}
