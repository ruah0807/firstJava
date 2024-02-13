package Ch11.제네릭;

import java.util.ArrayList;

public class WrapperArrayList {

	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		
		numbers.add(10);		//래퍼클래스 인스턴스 변수에 기본타입의 정수를 입력해도 자동으로 Boxing된다. 
		numbers.add(30);
		numbers.add(40);
		numbers.add(20);
		numbers.add(50);
		
		displayList(numbers); 		// Boxing되어있는 데이터를 다시 Unboxing하여 출력
		
		

	}

	static <E> void displayList(ArrayList<E> list) {
		for (E player : list) {
			System.out.println(player);
		}
		                                        
	}

}
