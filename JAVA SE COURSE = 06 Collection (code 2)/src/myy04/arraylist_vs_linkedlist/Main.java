package myy04.arraylist_vs_linkedlist;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> number1 = new ArrayList<>();
		List<Integer> number2 = new LinkedList<>();
		testList(number1);
		testList(number2);
		
	}
	public static void testList(List<Integer> list) {
		for(int i=0;i<10000;i++) {
			list.add(i);
		}
		long start = System.currentTimeMillis();
		for(int i=0;i<10000;i++) {
			list.add(0,i);
		}
		long end = System.currentTimeMillis();
		System.out.println("time performance test : "+(end-start));
		
	}

}
