package myy11.queue_interface;

import java.util.LinkedList;
import java.util.Queue;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Integer> data = new LinkedList<>();
		data.add(1);
		data.add(2);
		data.add(3);
		
		System.out.println(data.element());
		System.out.println(data.remove());
		System.out.println("-------------");
		for(Integer result:data) {
			System.out.println(result);
		}
		

	}

}
