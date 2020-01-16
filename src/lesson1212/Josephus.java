package lesson1212;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * Kreis und jedes dritte Element wird gelöscht
 */
public class Josephus {

	/**
	 * constructor
	 * 
	 * @param size
	 * @param steps
	 */
	public Josephus(int size, int steps) {
		LinkedList<Person> circle = new LinkedList<Person>();

		for (int i = 1; i <= size; i++) {
			circle.add(new Person("" + i));
		}

		Iterator<Person> iter = circle.iterator();

		while (circle.size() > 1) {
			for (int j = 1; j < steps; j++) { // auch mit while möglich
				iter.next();
				iter = getNewIterator(iter, circle);
			}

			Person person = iter.next();
			System.out.println("circle: " + circle);
			System.out.println("leaving: " + person.getName());
			iter.remove();
			iter = getNewIterator(iter, circle);
		}
		System.out.println(circle.getFirst().getName());
	}

	private Iterator<Person> getNewIterator(Iterator<Person> iter, LinkedList<Person> circle) {
		if (!iter.hasNext()) {
			return iter = circle.iterator();
		}
		return iter;
	}

}
