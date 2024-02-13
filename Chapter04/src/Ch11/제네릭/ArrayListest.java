package Ch11.제네릭;

import java.util.ArrayList;

public class ArrayListest {

	public static void main(String[] args) {
		ArrayList<String> players = new ArrayList<String>();
		
		players.add("손흥민");
		players.add(new String("박지성"));
		players.add(new String("차범근"));
		
		System.out.println("index-1 위치의 데이터 : " + players.get(0));
		System.out.println("index-1 위치의 데이터 : " + players.get(1));
		
		players.add(1, new String("안정환"));
		System.out.println("index-1 위치에 새로운 데이터 입력");
		System.out.println("index-1 위치의 데이터 : " + players.get(1));
		System.out.println("index-1 위치의 데이터 : " + players.get(2));
		System.out.println("index-1 위치의 데이터 : " + players.get(3));
		System.out.println("지금까지의 플레이어 인원수는 " + players.size());
		
		players.add(players.size(), "차두리");
		
		int lastIndex = players.size()-1;
		String lastPlayer = players.get(lastIndex);
		
		System.out.println("last-index 위치의 데이터 : " + lastPlayer);
		
		System.out.println("for 반복문을 이용해서 전체 요소를 축력합니다.");
		
		for(int i=0; i<players.size(); i++) {
			System.out.println("index=("+i+")"+players.get(i));
		}

	}

}
