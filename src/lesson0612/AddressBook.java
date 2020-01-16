package lesson0612;

import java.util.LinkedList; //muss nicht in Klausur notiert werden

public class AddressBook {

	private final int size; // Maximalegr�sse nicht �nderbar
	private LinkedList<Contact> contacts = new LinkedList<Contact>(); // Initialisierung

	/**
	 * constructor f�r Maximalgr��e
	 * 
	 * @param size
	 */
	public AddressBook(int size) {
		this.size = size;
	}

	/**
	 * F�higkeit Kontakt hinzuf�gen hat es funktioniert oder nicht? True, false?
	 * 
	 * @param contact
	 */
	public boolean addContact(Contact contact) {
		if (getSize() < size) {
			contacts.add(contact);
			return true;
		}
		return false;

	}

	/**
	 * F�higkeit Kontakt l�schen
	 * 
	 * @param contact
	 */
	public void removeContact(Contact contact) {
		contacts.remove(contact);

	}

	/**
	 * F�higkeit ausgabe der Adresse mit vorhandenem Kontakt
	 * 
	 * @param contact
	 * @return
	 */
	public String getAddress(String name) {

		/*
		 * bei (Contact name) als �bergabeparameter contacts.contains(name);
		 */

		for (int i = 0; i < contacts.size(); i++) { // geht durch ganzes AddressBook
			Contact tmp = contacts.get(i); // gibt Kontakt zur�ck
			if (tmp.getName().equals(name)) {
				return tmp.getAdress();
			}
		}
		return "Name not found";
	}

	/**
	 * F�higkeit Ausgabe von Kontakt mit name und Adresse
	 * 
	 * @param name
	 * @param address
	 * @return
	 */
	public Contact getContact(String name, String address) {
		for (int i = 0; i < contacts.size(); i++) { // geht durch ganzes AddressBook
			Contact tmp = contacts.get(i); // gibt Kontakt zur�ck
			if (tmp.getName().equals(name) && tmp.getAdress().equals(address)) {
				return tmp; // gibt Kontakt zur�ck
			}
		}
		return null;
	}

	/**
	 * F�higkeit Ausgabe der aktuellen gr�sse der AddressBook Anzahl Eintr�ge
	 * 
	 * @return
	 */
	public int getSize() {
		return contacts.size();
	}

}
