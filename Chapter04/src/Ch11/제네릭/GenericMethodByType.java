package Ch11.제네릭;

public class GenericMethodByType {
	public<T> void introduce(T t) {
		System.out.println("안녕하세요. "+t.toString()+"입니다.");
	}
}
