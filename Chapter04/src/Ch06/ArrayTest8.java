package Ch06;

public class ArrayTest8 {

	public static void main(String[] args) {

		int [][] scores = {
							{100,90,80},
							{98,76,90}		 };
		for( int[] a : scores) {   						//행
//						행에서 사용한 변수 a를 열의 변수에 대입해야 한다.
		
			for ( int b : a ) {								//열
//					행에서 열의 데이터가 있으면 출력한다. b 변수는 열의 데이터를 저장한다.
				
				System.out.print(b + "\t");
			}
		}

	}

}

