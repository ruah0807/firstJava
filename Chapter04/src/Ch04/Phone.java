package Ch04;

public class Phone {

	
	String color;
	String model;
	int price;
	
	Phone(){};
	
	Phone(String color){
		this.color = color;
		this.model = "갤럭시-S22";
		this.price = 1000000;
	}

	Phone(String color, String model){
		this.color = color;
		this.model = model;
		this.price = 2000000;
		}
		
	Phone(String color, String model, int price){
		this.color = color;
		this.model = model;
		this.price = price;	
	}
			
	void setPhone(String color) {
			this.color = color;
			this.model = "갤럭시-S22";
			this.price = 1230000;
	}
	
	void setPhone(String color, String model) {
		this.color = color;
		this.model = model;
		this.price = 2340000;
	}
	
	
	void setPhone(String color, String model, int price) {
		this.color = color;
		this.model = model;
		this.price = price;
	}
	
	void getPhone() {
		System.out.println(color+" "+model+" "+price);
	}
}
