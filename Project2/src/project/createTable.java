package project;

import java.util.Scanner;

public class createTable {
	
	stmt s = new stmt();

	void createTable() {
		try {
			System.out.println(" [   테 이 블   생 성   ]");
			System.out.println();
			Scanner in = new Scanner(System.in);
			System.out.print("   테이블 이름을 입력하세요 : ");
			s.tableName = in.nextLine();
		System.out.println();
		
			if(s.tableName.equals("book001")) {
				String createStr = "CREATE TABLE " + s.tableName + " (bookid int not null, bookname varchar(40) not null, "
	                    + "author varchar(40), publisher varchar(40), PRIMARY KEY (bookid))";
						stmt.execute(createStr);
						System.out.println(" <<   테이블 생성 성공!   >> ");					
			} else if(s.tableName.equals("rental")) {
				String createStr = "CREATE TABLE" + " "+ s.tableName + "(bookid int not null , rental varchar(20) not null, custid int not null, custname varchar(30), "
						+ "phone varchar(40) not null, address varchar(40) not null, rentaldate date, returndate date)";
						stmt.execute(createStr);
						System.out.println(" <<   테이블 생성 성공!   >> ");
			}
			
		} catch(Exception e) {
			
			System.out.println(" 테이블 생성 실패 이유 : " + e.toString());
		}
		System.out.println();
	}
	
}
