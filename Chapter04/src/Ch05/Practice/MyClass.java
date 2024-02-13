package Ch05.Practice;


public class MyClass {
	
	protected String name;
	
	public MyClass(){
		System.out.println("생성자 실행");
		this.name = "이름 없음";
		
	}
	

//		private void name(String string) {
//	}

		public void MyClass(String name) {
			this.name = name;
			
		}
	
	public static void main (String[] args) {
		MyClass my = new MyClass();

;
		
	}
}
