package Ch11.제네릭;

public class GenericMethodMain {

	public static void main(String[] args) {
	
		ShowInteger showInteger = new ShowInteger(100);
		ShowString showString = new ShowString("김루아");
		
		GenericMethodByType byType = new GenericMethodByType();
		
		byType.<ShowInteger>introduce(showInteger);
		byType.introduce(showString);

	}

}
