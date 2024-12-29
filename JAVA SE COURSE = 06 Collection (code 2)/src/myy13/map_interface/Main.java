package myy13.map_interface;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,String> keyValue = new TreeMap<>();
		keyValue.put(1, "myo");
		keyValue.put(3, "thu");
		keyValue.put(2, "aung");
		
		System.out.println(keyValue.get(2));
		
		Set<Integer> result = keyValue.keySet();
		
		for(Integer output : result) {
			System.out.println(output+":"+keyValue.get(output));
			
		}

	}

}
