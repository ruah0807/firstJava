package Ch11.제네릭;

public class ShowString {

	String name;
	public ShowString(String name) {
		this.name=name;
	}
	@Override
	public String toString() {
		return name;
	}
}
