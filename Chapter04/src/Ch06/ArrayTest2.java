package Ch06;


public class ArrayTest2 {

	public static void main(String[] args) {
		
		int[] score1 = {100, 90, 80, 70, 60};

		String[] name = {"김루아", "조성우", "김은경", "김다미", "전승민"};
		
				
			for (int i=0; i<score1.length; i++) {		// 변수이름.length = 배열길이
				System.out.print(score1[i]+"\t");
			}
			
			
			System.out.println();
			
			
			for (int i=0; i<5; i++ ) {
				System.out.print(name[i]+"\t");
			}
	}
	

}
