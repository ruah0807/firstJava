package project;

import java.util.Scanner;

public class changeData {
	
	stmt s = new stmt();
	
	void changeData() {
		
		System.out.println(" [   관 리  세 부 내 용  변 경   ]");
		System.out.println();
		try {
			Scanner in = new Scanner(System.in);			
			System.out.print("   수정할 데이터가 속한 테이블을 입력하시오 : ");
			s.tableName = in.nextLine();
			System.out.print("   어느 목록을 수정할 것인지 입력하시오 : ");
			String field = in.nextLine();
			System.out.print("   수정 할 데이터를 입력하시오 : ");
			String updatedata = in.nextLine();
			System.out.print("   도서목록 변경은 'bookid', 대여목록은 변경 'custid'를 입력하시오 : ");
			String field2 = in.nextLine();
			System.out.print("   변경하고자하는 ID의 번호를 입력하시오 : ");
			int num = in.nextInt();
			String changeStr = "UPDATE " + s.tableName + " SET " + field + "='" + updatedata + "' WHERE " + field2 + "=" + num;
			stmt.stmt.executeUpdate(changeStr);
			System.out.println();
			System.out.println(" <<   데이터 변경 성공!   >> ");
		
		
		} catch(Exception e) {
			System.out.println();
			System.out.println(" 데이터 변경 실패 이유 : " + e.toString());
		}
		System.out.println();
	}


}
