package Ch07;

public class Child extends Parents {

	int num = 100;
	String name = "조성우";
	
	void call() {
		System.out.println(name + "은(는) 아주 멋진 사람입니다.");
		super.call();	//*******
	}

	
	
	void ShowData() {
		
		System.out.println("부모 클래스의 변수 num = " + super.num);
//													super를 사용하면 부모클래스의 멤버를 호출한다.
		System.out.println("자식 클래스의 변수 num = " + this.num);
//													this를 사용하면 자신의 클래스에서 호출한다.
	
	}
}
