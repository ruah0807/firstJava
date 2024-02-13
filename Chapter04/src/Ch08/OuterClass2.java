package Ch08;

public class OuterClass2 {


		private String name;
		
		OuterClass2(String name){
			this.name = name;
		}
		
		
		
		public BasicClass createLocalClassInstance() {
			
			class LocalClass extends BasicClass{
				
				@Override
				public void tell() {
					System.out.println("안녕하세요. "+name+"입니다.");
				}
			}
					
			
			return new LocalClass();			//*** 특이점.
	}
		
		
		
		public static void main(String[] args) {
			
			OuterClass2 out = new OuterClass2("KING");
			BasicClass localInst1 = out.createLocalClassInstance();
			localInst1.tell();
		}
}


//
//abstract class BasicClass{
//	public abstract void tell(); 
//}
