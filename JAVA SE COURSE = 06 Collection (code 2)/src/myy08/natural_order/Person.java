package myy08.natural_order;

public class Person implements Comparable<Person> {
	private int id;
	private String name;
	public Person(int id, String name) {
		super();
		this.id = id;
		this.name = name;
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public int compareTo(Person p) {
//		if(this.id>p.getId()) {
//			return 1;
//		}
//		
//		return -1;
		return this.name.compareTo(p.getName());
	}

}
