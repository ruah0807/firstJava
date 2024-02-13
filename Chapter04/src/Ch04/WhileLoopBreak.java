package Ch04;

public class WhileLoopBreak {

	public static void main(String[] args) {
		
		int num = 0;
		
		while ( true ) {
			
			if(num==10) {
				break;			//반복문을 탈출한다.
			}	
				System.out.println(num);

				num++;		//탈출을 위한 증가식
		}
		}
	

}
