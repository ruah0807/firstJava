package Ch06;

public class ArrayTest5 {

	public static void main(String[] args) {

		int[][] arr = {
						{100,90,80},
						{98,76,90},
						{85,84,77},
						{89,100,69}};
		
//		System.out.println(arr.length);		// 중괄호 수 : 행
//		System.out.println(arr[0].length); 	// 중괄호 안의 숫자 갯수 : 열
		
		
//		System.out.println("arr[i][j] =>" + arr[i][j]);
//		System.out.println("arr[0][0] =>" + arr[0][0]);
//		System.out.println("arr[1][1] =>" + arr[1][1]);
//		System.out.println("arr[2][2] =>" + arr[2][2]);
//		System.out.println("arr[3][2] =>" + arr[3][2]);

		int i;
		int j;
		
		for (i=0; i<4; i++) {
//					- arr.length 대체가능 //행
			
				for (j=0; j<arr[i].length; j++) {
//							- arr[i].length 대체가능 //열
					
					System.out.print("arr["+i+"]["+j+"] =>" + arr[i][j] +"\t\t");
				}
		
		System.out.println();

		}
	}
	

}
