package Ch06;
import java.util.Scanner;
public class 과목 {

	public static void main(String[] args) {

		String[] 과목 = new String[5];
	
		Scanner sc = new Scanner(System.in);
			System.out.println("과목을 입력하세요.");
		
			
			
			
		
//		과목[0] = "국어";
//		과목[1] = "수학";
//		과목[2] = "영어";
//		과목[3] = "과학";
//		과목[4] = "기술";

		for (int i=0; i<=4; i++) {
			과목[i] = sc.nextLine();
		}
		
		for (int i=0; i<=4; i++) {
		System.out.print(과목[i]+"\t");
		}
	}
}
