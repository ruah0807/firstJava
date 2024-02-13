package Ch05;

public class MultiInstance {

	public static void main(String[] args) {
		
		SmartPhone sp1 = new SmartPhone();
		SmartPhone sp2 = new SmartPhone();
		
		sp1.color = "Gold";
		sp1.size = 5.7f;
		sp1.volume = 5;
		
		System.out.println("> color : " + sp1.color);
		System.out.println("> size : " + sp1.size);
		System.out.println("> volume : " + sp1.volume);
		
		
		sp2.color = "Black";
		sp2.size = 5.7f;
		sp2.volume = 3;
		
		System.out.println("> color : " + sp2.color);
		System.out.println("> size : " + sp2.size);
		System.out.println("> volume : " + sp2.volume);

		
		
		sp1.volumeUp();
		
		System.out.println("SmartPhone 1 객체의 volumeup() 메소드를 호출했습니다");
		System.out.println(">volume : "+ sp1.volume);
		
		
		sp2.volumeDown();
		
		System.out.println("SmartPhone 2 객체의 volumeDown() 메소드를 호출했습니다.");
		System.out.println(">volume : "+ sp2.volume);
		
		
		
	}

}
