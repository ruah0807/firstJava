package project;

import java.util.Scanner;

public class insertData {
	
	stmt s = new stmt();
	
	void insertData() {
	    try {
	    	
	    	System.out.println(" [   관 리 목 록   추 가   ]");
			System.out.println();
	        Scanner in = new Scanner(System.in);

	        System.out.print("   데이터를 추가할 테이블을 입력해주세요 : ");
	        String tableName = in.nextLine();
	        if(tableName.equals("book001")) {
	        	System.out.println();
	        	System.out.println(" -  도 서 목 록 추 가  -");
	        	System.out.println();
	            System.out.print("   책의 번호를 입력하세요 : ");
	            int bookid = in.nextInt();

	            in.nextLine();

	            System.out.print("   책의 이름을 입력하세요 : ");
	            String bookname = in.nextLine();
	            System.out.print("   책의 저자를 입력하세요 (null값 가능) : ");
	            String author = in.nextLine();
	            System.out.print("   출판사를 입력하세요 (null값 가능) : ");
	            String publisher = in.nextLine();
	         

	            String insertStr = "INSERT INTO " + tableName + " VALUES('" + bookid + "', '" + bookname + "', '" + author + "', '" + publisher + "')";
	            stmt.stmt.executeUpdate(insertStr);
	            System.out.println();
	            System.out.println(" <<   데이터 추가 성공!   >> ");
	            
	        } else if(tableName.equals("rental")) {
	        	System.out.println();
	        	System.out.println(" -  고 객 대 여  목 록 추 가  -");
	        	System.out.println();
	            System.out.print("   책의 번호를 입력하세요 : ");
	            int bookid = in.nextInt();

	            in.nextLine();

	            System.out.print("   책의 대여 여부 : ");
	            String rental = in.nextLine();
	            System.out.print("   고객 아이디를 입력하세요 : ");
	            int custid = in.nextInt();
	            in.nextLine();

	            System.out.print("   고객 이름을 입력하세요 : ");
	            String custname = in.nextLine();
	            System.out.print("   핸드폰 번호를 입력하세요 : ");
	            String phone = in.nextLine();
	            System.out.print("   주소를 입력하세요 : ");
	            String address = in.nextLine();
	            System.out.print("   대여일를 입력하세요 : ");
	            String rentaldate = in.nextLine();
	            System.out.print("   반납일을 입력하세요 : ");
	            String returndate = in.nextLine();

	            String insertStr = "INSERT INTO " + tableName + " VALUES('" + bookid + "', '" + rental + "', '" + custid + "', '" + custname + "', '"
	                    + phone + "', '" + address + "', '" + rentaldate + "', '" + returndate + "')";
	            stmt.stmt.executeUpdate(insertStr);
	            System.out.println();
	            System.out.println(" <<   데이터 추가 성공!   >>");
	        }

	    } catch(Exception e) {
	        System.out.println(" 데이터 추가 실패 이유 : " + e.toString());
	    }
	    System.out.println();
	}

}
