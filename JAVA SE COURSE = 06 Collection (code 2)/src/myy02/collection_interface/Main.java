package myy02.collection_interface;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collection <Integer> collection = new ArrayList<>();
		
		collection.add(10);
		collection.add(20);
		collection.add(30);
//		System.out.println("befor removing : " +collection.size());
//		collection.remove(20);
//		System.out.println("after removing : " +collection.size());
//		
//		for(Integer coll:collection) {
//			System.out.println(coll);
//		}
//		
		
		Iterator <Integer> i = collection.iterator();
		System.out.println(i.next());
		System.out.println(i.next());
		
		while(i.hasNext()) {
			System.out.println(i.next());
		}

	}

}
