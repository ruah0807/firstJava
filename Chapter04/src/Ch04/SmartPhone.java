package Ch04;

public class SmartPhone extends Phone {

	
	SmartPhone(){}
	
	SmartPhone(String color){
		super(color);
	}
	
	SmartPhone(String color, String model){
		super(color, model);
	}
	
	SmartPhone(String color, String model, int price){
		super(color, model, price);
	}
}	
