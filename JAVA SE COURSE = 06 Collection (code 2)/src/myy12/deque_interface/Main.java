package myy12.deque_interface;

import java.util.Deque;
import java.util.LinkedList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Deque <Integer> numbers = new LinkedList<>();
		numbers.addFirst(10);
		numbers.addFirst(20);
		numbers.addFirst(30);
		numbers.addLast(40);
		numbers.addFirst(50);
		
		System.out.println(numbers.getFirst());
		System.out.println(numbers.getLast());
		
		System.out.println(numbers.removeFirst());
		System.out.println(numbers.removeLast());
		

	}

}
