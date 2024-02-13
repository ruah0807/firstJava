package Ch09;

public class SystemCurrentTimMillis {

	public static void main(String[] args) {
		
		long startTime = System.currentTimeMillis();
		
		for (int i=0; i<1000000000; i++) {
			int n1 = 1;
			int n2 = 10;
			int sum = n1+n2;
			
		}
		
		long endTime = System.currentTimeMillis();
		
		long estimatedTime = endTime - startTime;
		System.out.println("해당 기능의 실행시간 : " + estimatedTime);
	}

}
