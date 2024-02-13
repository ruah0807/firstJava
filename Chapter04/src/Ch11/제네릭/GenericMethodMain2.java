package Ch11.제네릭;

public class GenericMethodMain2 {

	public static void main(String[] args) {
		
		ShowInteger showInteger = new ShowInteger(100);
		ShowString showString = new ShowString("김루아");
		
		GenericMethodByType2 byType = new GenericMethodByType2();
		byType.<ShowInteger>introduce(showInteger);
	}

}
