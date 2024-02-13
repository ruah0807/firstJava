package Ch04;

import java.util.Scanner;

public class IfelseIfTestIndividual {

	public static void main(String[] args) {
		
			Scanner in = new Scanner(System.in);
			
				System.out.print("점수를 입력하세요 >> ");
				
				int score = in.nextInt();
				
			
			if (score >= 90) {
				System.out.println("A");
				
			} else if (score >= 80) {
				System.out.println("B");
			
			} else if (score >= 70) {
				System.out.println("C");
			
			} else if (score >= 60) {
				System.out.println("D");
			
			} else {
				System.out.println("F");
			
			}
					
	}

}




/// Scanner를 이용해서 데이터를 입력받도록 하세요
//90점 이상이면 A, 80점 이상이면 B, 70점 이상이면 C, 60점 이상이면 D, 60 이하이면 F.   