package Ch11.제네릭;

public class ShowInteger {

	int number;
	public ShowInteger(int number) {
		this.number = number;
	}
	@Override
	public String toString() {
		return String.valueOf(number);
	}
}
