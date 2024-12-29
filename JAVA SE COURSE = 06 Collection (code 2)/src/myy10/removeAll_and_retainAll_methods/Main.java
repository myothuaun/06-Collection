package myy10.removeAll_and_retainAll_methods;

import java.util.LinkedHashSet;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> set1 = new LinkedHashSet<>();
		set1.add("A");
		set1.add("B");
		set1.add("X");
		set1.add("Y");
		Set<String> set2 = new LinkedHashSet<>();
		set2.add("A");
		set2.add("B");
		set2.add("D");
		set2.add("E");
		set1.retainAll(set2);
//		removeAll
		for(String s:set1) {
		System.out.println(s);
		}
	}

}
