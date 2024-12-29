package myy07.comparator_with_custom_type;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
class StringComparator implements Comparator<Person>{

	@Override
	public int compare(Person p1, Person p2) {
		// TODO Auto-generated method stub
//		if(p1.getId()>p2.getId()) {
//			return 1;
//		}
//		return -1;
		return p1.getName().compareTo(p2.getName());
	}
	
}

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Person> person = new ArrayList<>();                                                                                                
		person.add(new Person(1,"mgmg"));
		person.add(new Person(3,"bobo"));
		person.add(new Person(2,"ayeaye"));
		person.add(new Person(4,"sisi"));
		Comparator<Person> com = new StringComparator();
		Collections.sort(person,com);
		for(Person p:person) {
			System.out.println(p.getId()+":"+p.getName());
		}
	}

}
