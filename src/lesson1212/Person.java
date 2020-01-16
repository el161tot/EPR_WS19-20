package lesson1212;

public class Person {

	private String name; // Objekteigenschaft, Person hat Namen

	/**
	 * constructor
	 * 
	 * @param name
	 */
	public Person(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public String toString() {
		return this.getName();
	}
}
