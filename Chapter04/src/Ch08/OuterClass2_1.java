package Ch08;

public class OuterClass2_1 {

	
	private String name;
	
	OuterClass2_1(String name){
		this.name = name;
	}
	
	public BasicClass createLocalClassInstance(final int age) {
		
		class LocalClass extends BasicClass{
			@Override
			public void tell() {
				System.out.println("안녕하세요. " +age+" 살"+name+"입니다.");
			}
		}
		
		return new LocalClass();
		
	}
	public static void main(String[] args) {
		
		OuterClass2_1 out = new OuterClass2_1("KING");
		BasicClass localInst1 = out.createLocalClassInstance(12);
		localInst1.tell();

	}

}

abstract class BasicClass{
	public abstract void tell();
}
