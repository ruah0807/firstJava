package Ch11.제네릭;

import java.util.LinkedList;

public class LinkedListTest {

	public static void main(String[] args) {
		LinkedList<Integer> numbers = new LinkedList<Integer>();
		
		numbers.add(10);
		numbers.add(30);
		numbers.add(40);
		numbers.add(20);
		numbers.add(50);
		
		displayList(numbers);
	}
	
	static<E> void displayList (LinkedList<E> list) {
		for (E player : list) {
			System.out.println(player);
		}
	}

}
