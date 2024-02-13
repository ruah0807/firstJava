package Ch09;

public class SystemNanoTime {

	public static void main(String[] args) {
		
		long startTime = System.nanoTime();
		
		for(int i=0; i<100000000; i++) {
			int n1 = 1;
			int n2 = 10;
			int sum = n1+n2;
		}
		
		long endTime = System.nanoTime();
		
		long estimatedTime = endTime - startTime;
		System.out.println("해당 기능의 실행 시간 : " + estimatedTime);

	}

}
