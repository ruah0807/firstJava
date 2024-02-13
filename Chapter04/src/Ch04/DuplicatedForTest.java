package Ch04;

public class DuplicatedForTest {			 //중첩 For 문

	public static void main(String[] args) {
		
		for (int i=1; i<10; i++) {
			
			for (int j=2; j<10; j++) {
				
				System.out.print(j+"x"+i+"="+j*i+"\t");
			}
			System.out.println();
	}
	}
}
