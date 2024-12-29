package myy09.set_interface;

import java.util.Set;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Integer> set = new TreeSet<>();
		set.add(10);
		set.add(30);
		set.add(20);
		set.add(40);
		
		set.remove(40);
		System.out.println(set.contains(10));
		
		for(Integer result:set) {
			System.out.println(result);
		}

	}

}
