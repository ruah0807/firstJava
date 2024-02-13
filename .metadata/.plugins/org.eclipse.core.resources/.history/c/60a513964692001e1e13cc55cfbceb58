package project;

import java.sql.ResultSet;
import java.util.Scanner;

public class viewData {
	
	stmt s = new stmt();
	
	void viewData() {
	    try {            
	        Scanner in = new Scanner(System.in);
	        System.out.println(" [  관 리  목 록   조 회   ]");
	       System.out.println();
	        System.out.print("   조회할 테이블을 입력하시오 : ");
	        String searchtable = in.nextLine();
	        System.out.println();
	        if(searchtable.equals("book001")) {
	            String viewStr1 = "SELECT * FROM " + searchtable;
	            ResultSet result1 = stmt.stmt.executeQuery(viewStr1);
	            
	            
	            System.out.println("================ 도 서 목 록 조 회 ================");
	            System.out.println(" 책ID\t제 목\t\t저 자\t\t출판사");
	            System.out.println("------------------------------------------------");
	            while(result1.next()) {
	                System.out.print(" "+result1.getInt("bookid") + "\t" + result1.getString("bookname")
	                                 + "\t\t" + result1.getString("author") + "\t\t" + result1.getString("publisher") +"\n");
	            }
	            System.out.println("================================================");
	            System.out.println("");
	            System.out.println(" <<   데이터 조회 성공!   >> ");
	        } else if(searchtable.equals("rental")) {
	            String viewStr1 = "SELECT * FROM " + searchtable;
	            ResultSet result1 = stmt.stmt.executeQuery(viewStr1);
	            System.out.println("============================= 고 객 대 여   목 록 조 회 =============================");
	            System.out.println("책 ID\t대여여부\t고객ID\t고객이름\t연락처\t\t주 소\t\t대여일\t반납일");
	            System.out.println("---------------------------------------------------------------------------------");
	            while(result1.next()) {
	                System.out.print(" "+result1.getInt("bookid") + "\t" + result1.getString("rental")
	                                 + "\t" + result1.getInt("custid") + "\t" + result1.getString("custname") + "\t" + result1.getString("phone")
	                                 + "\t"+ result1.getString("address") + "\t" + result1.getString("rentaldate") + "\t"+ result1.getString("returndate") +"\n");
	            }
	            System.out.println("=================================================================================");
	            System.out.println("");
	            System.out.println(" <<   데이터 조회 성공!   >> ");
	        }
	    } catch(Exception e) {
	    	System.out.println();
	        System.out.println("데이터 조회 실패 이유 : " + e.toString());
	    }
	    System.out.println();
	}

}
