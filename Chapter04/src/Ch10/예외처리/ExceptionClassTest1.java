package Ch10.예외처리;

public class ExceptionClassTest1 {

	public static void main(String[] args) {
		
		try {
			
			Class.forName("Example");
			
		}catch(ClassNotFoundException e){
			
			e.printStackTrace();
			
		}

	}

}
