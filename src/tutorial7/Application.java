package tutorial7;

public class Application {
	public static void main(String[] args) {
		// Initialize 3 sets
		MySet set1 = new MySet(1, 2, 3, 2.3, 2.05 - 0.05, 6); // using double values
		MySet set2 = new MySet(new double[] { 1, 2, 3, 4, 4, 5 }); // using an array
		MySet set3 = new MySet(); // empty

		/*
		 * Basic operations check, whether sets are empty
		 */
		System.out.println("Set1 is empty: " + set1.isEmpty());
		System.out.println("Set2 is empty: " + set2.isEmpty());
		System.out.println("Set3 is empty: " + set3.isEmpty());

		// add elements to set3
		set3.addElement(30.3);
		set3.addElement(30.1);
		set3.addElement(30);

		// remove elements from sets
		set1.removeElement(100);
		set1.removeElement(1000);
		set3.removeElement(30);

		// print the size of the sets
		System.out.println("Set1 size: " + set1.getSetSize());
		System.out.println("Set2 size: " + set2.getSetSize());
		System.out.println("Set3 size: " + set3.getSetSize());
		// print the sets
		set1.printSet();

		// Advanced operation
		System.out.println("Given the two sets:");
		System.out.print("Set1: ");
		set1.printSet();
		System.out.print("Set2: ");
		set2.printSet();

		// print union
		System.out.println("Union");
		set1.printUnion(set2);
		set1.printSet();
		set2.printSet();
	}

}
