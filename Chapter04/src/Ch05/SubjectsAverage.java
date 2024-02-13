package Ch05;

public class SubjectsAverage {

	int a; //국어;
	int b; //영어;
	int c; //수학;
	int d; //과학;
	int e; //기술;
	
	public SubjectsAverage (int a, int b, int c, int d, int e) {
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
		this.e = e;
	}

		
	
	public static void main(String[] args) {
	
		SubjectsAverage sa = new SubjectsAverage(80,91,92,99,76) ;
		
		System.out.println("국어 : " + sa.a);
		System.out.println("영어 : " + sa.b);
		System.out.println("수학 : " + sa.c);
		System.out.println("과학 : " + sa.d);
		System.out.println("기술 : " + sa.e);
		
		System.out.println("합계평균 : " + (sa.a+sa.b+sa.c+sa.d+sa.e)/5 );
			
	

		}
}
