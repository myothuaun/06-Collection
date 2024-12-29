package myy05.comparator_interface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
class numberComparator implements Comparator<Integer>{

	@Override
	public int compare(Integer num1, Integer num2) {
		// TODO Auto-generated method stub
		if(num1>num2) {
			return 1;    //10>20
		}
		return -1;
	}
	
}

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> numbers = new ArrayList<>();
		numbers.add(10);
		numbers.add(30);
		numbers.add(20);
		numbers.add(40);
		Comparator<Integer> num = new numberComparator();
		Collections.sort(numbers,num);
		for(Integer nums:numbers) {
			System.out.println(nums);
		}
	}

}
