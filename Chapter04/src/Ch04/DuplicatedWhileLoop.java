package Ch04;

public class DuplicatedWhileLoop {

	public static void main(String[] args) {
		
		int i=1;
		
		while (i<10 ){ 		//i=1이기 때문에 10보다 작으므로 참이된다.
		
		int j = 2;
		
		while(j<10) { 			// 첫번째 while 조건에서 참이므로 두번째 while문이 실행된다. 여기서 j=2 이므로 10보다 작기 때문에
		
			System.out.print(j+" x "+i+" = "+ j*i + "\t");
			j++;
		}

		System.out.println();
	    i++;
	}

}
}
 
