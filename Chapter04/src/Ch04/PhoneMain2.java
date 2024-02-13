package Ch04;

public class PhoneMain2 {

	public static void main(String[] args) {
		
		SmartPhone sp = new SmartPhone();
		
		sp = new SmartPhone("Green");
		sp.getPhone();
		
		sp = new SmartPhone("Pink-Gold","갤럭시-S22");
		sp.getPhone();
		
		sp = new SmartPhone("Cream","갤럭시-S22",2000000);
		sp.getPhone();
		
		
		SmartPhone2 sp4 = new SmartPhone2();
		
		sp4.setPhone("그라파이트");
		sp4.getPhone();
		
		sp4.setPhone("바이올렛", "갤럭시-S22");
		sp4.getPhone();
		
		sp4.setPhone("스카이 블루", "갤럭시-S22 울트라", 3000000);
		sp4.getPhone();		

	}

}
