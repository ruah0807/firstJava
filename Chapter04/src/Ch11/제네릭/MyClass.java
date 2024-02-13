package Ch11.제네릭;

public class MyClass<T> {
	
	T val;				//인스턴스변수
	T getVal() {		//생성자
		return val;
	}

	void  setVal(T val) {		//변수의 데이터를 저장하는 용도 // (static)이 없기 때문
		this.val = val;
	}

	public static void main(String[] args) {

		MyClass<String> myclass = new MyClass<String>();	
											//static이 없기 때문에 생성자를 만들어야 한다.
		myclass.setVal("King");
		System.out.println(myclass.getVal());
		
		
	}

}
