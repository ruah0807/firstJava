package Ch05.other;

import Ch05.ModifierProtected;

public class ModifierProtectedExtends extends ModifierProtected {
//										- MP를 상속받겠다는 뜻.
//										- extends가 없으면 에러난다.
	
	
	public static void main(String[] args) {

		ModifierProtectedExtends mpe = new ModifierProtectedExtends();
		
		mpe.name = "손흥민"; 	//접근제어자가 protected이지만 상속을 받았기 때문에 가능하다.
		mpe.age = 29 ;	
//				 패키지가 서로 다를 경우에 접근이 거부된다.
		mpe.tell();

	}

}
