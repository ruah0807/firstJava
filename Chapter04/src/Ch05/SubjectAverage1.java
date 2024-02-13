package Ch05;

import java.util.Scanner;

public class SubjectAverage1 {

	int a; //Math
	int b; //English
	int c; //Science
	int d; //Psycology
	int e; //Other language
	
	public SubjectAverage1(int a, int b, int c, int d, int e) {
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
		this.e = e;
	
	}
		
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.print(" Put your Math score >>  ");
		int a = sc.nextInt();
		
		System.out.print(" Put your English score >>  ");
		int b = sc.nextInt();
		
		System.out.print(" Put your Science score >>  ");
		int c = sc.nextInt();
		
		System.out.print(" Put your Psycology score >>  ");
		int d = sc.nextInt();
		
		System.out.print(" Put your 2nd Language score >>  ");
		int e = sc.nextInt();
		
		
		
		
	SubjectAverage1 saa = new SubjectAverage1(a,b,c,d,e);

			int Total = saa.a + saa.b + saa.c + saa.d + saa.e;
			int Average = Total / 5;
				
			System.out.println(" Total >> " + Total );
			System.out.println(" Average >> " + Average);
		
		
		
	}

}
