package Ch05;

public class ModifierPrivateMain {

	public static void main(String[] args) {
		
		ModifierPrivate mp = new ModifierPrivate();
		
		mp.name; //접근제어자가 private, 접근이 거부됨
		mp.tell(); // 접근 가능. 접근제어자가 default이기 때
		
		
	}

}
