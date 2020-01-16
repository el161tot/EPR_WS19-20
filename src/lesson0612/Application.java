package lesson0612;

public class Application {
	public static void main(String[] args) {
		Contact lisa = new Contact("Lisa", "Rheingutstrasse 1"); // Aufruf des Contacts
		Contact peter = new Contact("Peter");

		AddressBook konstanz = new AddressBook(100);

		System.out.println(konstanz.getSize());
		System.out.println(konstanz.addContact(lisa));
		System.out.println(konstanz.addContact(peter));
		System.out.println(konstanz.getSize());
		System.out.println(konstanz.getAddress("Lisa"));
		Contact tmp = konstanz.getContact("Peter", "unknown");
		System.out.println(tmp.getName());

		konstanz.removeContact(lisa);
		System.out.println(konstanz.getSize());

		/*
		 * String name = lisa.getName(); // Variable wird neu abgespeichert
		 * System.out.println(name);
		 */
	}

}
