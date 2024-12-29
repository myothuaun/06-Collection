package myy03.list_interface;

import java.util.ArrayList;

import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> animals = new ArrayList<>();
		animals.add("tiger");
		animals.add("bird");
		animals.add("snake");
		
		System.out.println(animals.size());
		System.out.println(animals.get(1));
		animals.add(1,"elephant");
		System.out.println(animals.get(1));
		System.out.println("-----------");
		for(String name:animals){
			System.out.println(name);
		}
		
		System.out.println("after sorting");
		Collections.sort(animals);
		for(String sor:animals){
			System.out.println(sor);
		}
		System.out.println("after removing");
	
		animals.remove(1);
		System.out.println("-------------");
		for(String rem:animals){
			System.out.println(rem);
		}
		

	}

}
