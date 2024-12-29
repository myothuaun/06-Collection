package myy08.natural_order;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Person> myList = new ArrayList<>();
		myList.add(new Person(1,"ayeaye"));
		myList.add(new Person(3,"zaw zaw"));
		myList.add(new Person(4,"bobo"));
		myList.add(new Person(2,"susu"));
		
		Collections.sort(myList);
		for(Person p:myList) {
			System.out.println(p.getId()+":"+p.getName());
		}
	}

}
