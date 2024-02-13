package Ch05;

public class Adder {	//기본생성자가 숨어있다.

	int n1;
	int n2;
	
	adder(){
		int n1; //지역변수  사라지지 않으려면 앞에 static을 붙여라.
	}
	
	
	
	int add(int n1, int n2) {
		this.n1 = n1;
	}
	
	public int getN1() {
		return n1;
	}

	public void setN1(int n1) {
		this.n1 = n1;
	}

	public int getN2() {
		return n2;
	}

	public void setN2(int n2) {
		this.n2 = n2;
	}

	public float getN3() {
		return n3;
	}

	public void setN3(float n3) {
		this.n3 = n3;
	}

	public float getN4() {
		return n4;
	}

	public void setN4(float n4) {
		this.n4 = n4;
	}

	float add(float n1, float n2) {
		this.n3 = n3;
	}	
	
	}

