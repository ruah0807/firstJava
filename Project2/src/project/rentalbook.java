package project;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class rentalbook {

    stmt s = new stmt();

    void rentalbook() {
        try {
            Scanner in = new Scanner(System.in);
            System.out.println(" [   도 서   대 여   ]");
           System.out.println();
            String a = "rental";
            String searchtable = a;
            String viewStr1 = "SELECT rental.bookid, rental.rental, book001.bookname " +
                    "FROM rental " +
                    "JOIN book001 ON rental.bookid = book001.bookid";

            Statement statement = s.con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            ResultSet result1 = statement.executeQuery(viewStr1);

            System.out.println("======== 도서 대여 목록 조회 ========");
            System.out.println("도서ID\t도서명\t\t대여여부");

            System.out.println("---------------------------------");
            while (result1.next()) {
                System.out.print("  "+result1.getInt("bookid") + "\t" + result1.getString("bookname") + "\t\t" + result1.getString("rental")
                        + "\n");
                
            }
            System.out.println("=================================");
            System.out.println();
            System.out.print(" 대여할 도서 ID번호를 입력해주세요 : ");
            int wantnum = in.nextInt();

            result1.beforeFirst();

            boolean found = false;
            while (result1.next()) {
                if (result1.getInt("bookid") == wantnum && result1.getString("rental").equals("대여가능")) {
                    String changeStr = "UPDATE " + searchtable + " SET rental = '대여중' WHERE bookid = " + wantnum;
                    stmt.stmt.executeUpdate(changeStr);
                    String changeStr1 = "UPDATE " + searchtable + " SET rentaldate = now() WHERE Bookid =" + wantnum;
                    stmt.stmt.executeUpdate(changeStr1);
                    String changeStr2 = "UPDATE " + searchtable + " SET returndate = DATE_ADD(now(), INTERVAL 1 WEEK) WHERE Bookid =" + wantnum;
                    stmt.stmt.executeUpdate(changeStr2);
                    System.out.println();
                    System.out.println(" <<   책 대여 완료 !  >>");
                    found = true;
                    break;
                }
            }

            if (!found) {
               System.out.println();
                System.out.println("이미 다른 사람이 대여중인 책 입니다. 대여할 수 없습니다.");
            }

        } catch (Exception e) {
           System.out.println();
            System.out.println("데이터 변경 실패 이유 : " + e.toString());
        }
        System.out.println();
    }

    void returnbook() {
        try {
            Scanner in = new Scanner(System.in);
            System.out.println(" [   도 서   반 납   ]");
           System.out.println();
            String a = "rental";
            String searchtable = a;
            String viewStr1 = "SELECT rental.bookid, rental.rental, book001.bookname " +
                    "FROM rental " +
                    "JOIN book001 ON rental.bookid = book001.bookid";

            Statement statement = s.con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            ResultSet result1 = statement.executeQuery(viewStr1);
            
            System.out.println("======== 도서 대여 목록 조회 ========");
            System.out.println("도서ID\t도서명\t\t대여여부");
            System.out.println("---------------------------------");
            while (result1.next()) {
                System.out.print("  "+result1.getInt("bookid") + "\t" + result1.getString("bookname") + "\t\t" + result1.getString("rental")
                        + "\n");
            }

            System.out.println("=================================");
            System.out.println();
            System.out.print(" 반납할 도서 ID번호를 입력해주세요 : ");
            int wantnum = in.nextInt();

            result1.beforeFirst();

            boolean found = false;
            while (result1.next()) {
                if (result1.getInt("bookid") == wantnum && result1.getString("rental").equals("대여중")) {
                    String changeStr = "UPDATE " + searchtable + " SET rental = '대여가능' WHERE bookid = " + wantnum;
                    stmt.stmt.executeUpdate(changeStr);
                    String changeStr1 = "UPDATE " + searchtable + " SET returndate = NULL WHERE Bookid =" + wantnum;
                    stmt.stmt.executeUpdate(changeStr1);
                    String changeStr2 = "UPDATE " + searchtable + " SET rentaldate = NULL WHERE Bookid =" + wantnum;
                    stmt.stmt.executeUpdate(changeStr2);
                    System.out.println();
                    System.out.println(" <<   책 반납 완료 !  >>  ");
                    found = true;
                    break;
                }
            }

            if (!found) {
               System.out.println();
                System.out.println("이미 반납된 책이거나 존재하지 않는 책입니다. 반납할 수 없습니다.");
            }

        } catch (Exception e) {
           System.out.println();
            System.out.println("데이터 변경 실패 이유 : " + e.toString());
        }
        System.out.println();
    }
   
}