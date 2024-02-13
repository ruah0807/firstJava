package Ch05;

public class SmartPhone3 {

	String color;
	float size;
	int volume;
	
	
	
	public SmartPhone3(String color, float size, int volume) {
						// (매개변수 3개)
		this.color = color;
		this.size = size;
		this.volume = volume;
	}
	
	public SmartPhone3(String color, float size) {
//						(매개변수2개)
		this(color, size, 0);
//		this.color = color;
//		this.size = size;
//		this.volume = 0;
	}
	
	public SmartPhone3(String color) {
		this(color, 5.7f, 0);
	}
	
	public SmartPhone3(float size) {
		this("Purple", size, 0);
	}
	
	
	
	void call() {
		System.out.println("Call");
	}
	void volumeUp() {
		volume += 1; 		// volume = volume + 1
	}
	void volumeDown() {
		volume -= 1;		// volume = volume - 1
	}
	
	
	
	void printSpec() {
		System.out.println("스마트폰의 색상 : "+ color);
		System.out.println("스마트폰의 사이즈 : " + size);
		System.out.println("스마트폰의 볼륨크기 : " + volume);
	}
	
	
	
	
	public static void main(String[] args) {
		
		SmartPhone3 sp = new SmartPhone3("Red",10.5f,0);
				sp.printSpec();
				System.out.println();
		SmartPhone3 sp1 = new SmartPhone3("Gold", 4.1f);
				sp1.printSpec();
				System.out.println();
		SmartPhone3 sp2 = new SmartPhone3("Blue");
				sp2.printSpec();
				System.out.println();
		SmartPhone3 sp3 = new SmartPhone3(5.0f);
				sp3.printSpec();
				System.out.println();
	
	
	
	}

}
