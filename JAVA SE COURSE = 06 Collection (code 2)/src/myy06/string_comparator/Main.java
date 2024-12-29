package myy06.string_comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
class StringComparator implements Comparator<String>{

	@Override
	public int compare(String s1, String s2) {
		// TODO Auto-generated method stub
		return -s1.compareTo(s2);
	}
	
}

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> animals = new ArrayList<>();
		animals.add("Bird");
		animals.add("Dog");
		animals.add("Ant");
		animals.add("Cat");
		animals.add("Elephants");
		Comparator<String>  name= new StringComparator();
		
		Collections.sort(animals,name);
		for(String animal:animals) {
			System.out.println(animal);
		}

	}

}
