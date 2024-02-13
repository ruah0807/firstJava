package Ch05;

public class Test {

	int a;	//전역변수 (마음대로 갈 수 있음.)
	int b;
	
	Test(int a, int b) {	 //  ()는 매개변수이자 지역변수		//생성자 생성
		this.a = a;				//매개 변수에 전달 받은 10 데이터를 지정한다.
		this.b = b;
		
		//Test (int x, int y){
		// a = x;
		// b = y;	//필드의 변수 이름과 매개 변수 이름이 다르면 this키워드를 사용할 필요가 없다.
		//  }
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
	};
	
	

}
