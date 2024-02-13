package Ch08;

public class OuterClass {

	private String name;			//필드 지역변수
	private int num;
	
	OuterClass(String name){		//(전역변수)
		this.name = name;		//this를 사용하는 이유는 필드에서 사용하는 변수의 이름과 생성자에서 
//									사용하는 매개변수의 이름을 같은 이름으로 사용하기 위해.
		num = 0;
	}
	
	public void introduce() {
		num++;
		System.out.println(name + "OuterClass" + num );
	}
	
	
	class InnerClass{
		InnerClass(){
			introduce();
		}
	}
	
	public static void main(String[] args) {
		
		OuterClass out1 = new OuterClass("KING");
		OuterClass out2 = new OuterClass("SCOTT");
		
		
		out1.introduce();	//변수선언 
		out2.introduce();	//직접호출
		
		OuterClass.InnerClass inn1 = out1.new InnerClass();	//4번에걸쳐 호출
		OuterClass.InnerClass inn2 = out2.new InnerClass();
		OuterClass.InnerClass inn3 = out1.new InnerClass();
		OuterClass.InnerClass inn4 = out1.new InnerClass();
		OuterClass.InnerClass inn5 = out2.new InnerClass();
	}

}
