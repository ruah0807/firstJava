package Ch06;

import java.util.Scanner;

public class ArrayTest1 {
	
	public static void main(String[] args) {
		
		int[] korScores = new int[10];
		
	 Scanner sc = new Scanner(System.in);
	 
	 for(int i=0; i<10; i++ ) {
			korScores[i] = sc.nextInt();
	 }
	 
			
			
//		korScores[0] = 100;
//		korScores[1] = 99;
//		korScores[2] = 91;
//		korScores[3] = 99;
//		korScores[4] = 90;
//		korScores[5] = 99;
//		korScores[6] = 98;
//		korScores[7] = 99;
//		korScores[8] = 97;
//		korScores[9] = 99;
		
		int 합계 =0; //초기값 설정 0
		float 평균 = 0f;

//		
		for(int i=0; i<10; i++ ) {
		
			합계 += korScores[i];
		}
//									합계 = 합계 + korscores
//									for문 쓰는 이유는 한번에 계산하기 위해
			평균 = 합계 / 10 ;
			
			System.out.println(합계);
			System.out.println(평균);
		
		}
			
	
	}


