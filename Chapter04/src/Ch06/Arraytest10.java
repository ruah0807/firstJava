package Ch06;

import java.util.Scanner;

public class Arraytest10 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
//		int[] num = new int[5];
//		
//			
//		
//		for (int i=0; i<5; i++) {
//				System.out.print(i+1 +"번째 데이터를 입력하세요 >> ");
//			
//			num[i] = sc.nextInt();
//		}
//	}
		
		String [][] num1 = new String [3][3];
		
		int i;
		int  j;
		
	
		
		for ( i=0; i<num1.length; i++) {
			
			for ( j=0; j<num1[i].length; j++) {
				
			
				System.out.print("메세지를 입력하세요 >>>");
				
				num1[i][j] = sc.nextLine();
				

				
				
				
//				
				
//				System.out.println(" 이름 | 국어 | 수학 | 영어 | 과학 | 기술 ");
//				System.out.println("----------------------------------");
				}	
			
			}
		}	
		
		
	}

