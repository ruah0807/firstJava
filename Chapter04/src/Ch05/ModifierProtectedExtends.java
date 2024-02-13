package Ch05;

public class ModifierProtectedExtends extends ModifierProtected {
//										- MP를 상속받겠다는 뜻.
//										- extends가 없으면 에러난다.
	
	
	public static void main(String[] args) {

		ModifierProtectedExtends mpe = new ModifierProtectedExtends();
		
		mpe.name = "손흥민"; 	//접근제어자가 protected이지만 상속을 받았기 때문에 가능하다.
		mpe.age = 29 ;		
		mpe.tell();

	}

}
