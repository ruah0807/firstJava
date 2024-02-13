package project;

import java.util.Scanner;

public class removeData {
	
	stmt s = new stmt();

	void removeData() {
		System.out.println(" [   관 리 목 록   삭 제   ]");
		System.out.println();
		try {
			Scanner in = new Scanner(System.in);
			System.out.print("   삭제를 원하는 목록의 테이블을 입력하세요 : ");
			s.tableName = in.nextLine();
			
			System.out.print("   도서목록 삭제는 'bookid', 고객목록 삭제는 'custid'를 입력하세요 : ");
			String field = in.nextLine();
			System.out.print("   삭제를 원하시는 ID의 번호를 입력하세요 : ");
			int num = in.nextInt();
			
			String removeStr = "DELETE FROM " + s.tableName + " WHERE " + field + "='"+ num + "'";
			stmt.stmt.executeUpdate(removeStr);
			System.out.println();
			System.out.println(" <<   데이터 삭제 성공!   >> ");
			
		} catch(Exception e) {
			System.out.println();
			System.out.println("데이터 삭제 실패 이유 : " + e.toString());
			
		}
		System.out.println();
	}
	
}
