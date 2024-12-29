package myy01.collection_intro;

import java.util.ArrayList;
import java.util.Collection;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Collection<Student> student = getData();
		 for(Student sd:student)
		System.out.println(sd.getName()+":"+sd.getAge());

	}

	public static Collection<Student> getData(){
		Student sd1  = new Student("myo",1);
		Student sd2  = new Student("thu",2);
		Student sd3  = new Student("aung",3);
		Collection<Student> collection = new ArrayList<>();
		collection.add(sd1);
		collection.add(sd2);
		collection.add(sd3);
		return collection;
	}

}
