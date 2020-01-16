package lesson0612;

import java.util.LinkedList; //muss nicht in Klausur notiert werden

public class AddressBook {

	private final int size; // Maximalegrösse nicht änderbar
	private LinkedList<Contact> contacts = new LinkedList<Contact>(); // Initialisierung

	/**
	 * constructor für Maximalgröße
	 * 
	 * @param size
	 */
	public AddressBook(int size) {
		this.size = size;
	}

	/**
	 * Fähigkeit Kontakt hinzufügen hat es funktioniert oder nicht? True, false?
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
	 * Fähigkeit Kontakt löschen
	 * 
	 * @param contact
	 */
	public void removeContact(Contact contact) {
		contacts.remove(contact);

	}

	/**
	 * Fähigkeit ausgabe der Adresse mit vorhandenem Kontakt
	 * 
	 * @param contact
	 * @return
	 */
	public String getAddress(String name) {

		/*
		 * bei (Contact name) als Übergabeparameter contacts.contains(name);
		 */

		for (int i = 0; i < contacts.size(); i++) { // geht durch ganzes AddressBook
			Contact tmp = contacts.get(i); // gibt Kontakt zurück
			if (tmp.getName().equals(name)) {
				return tmp.getAdress();
			}
		}
		return "Name not found";
	}

	/**
	 * Fähigkeit Ausgabe von Kontakt mit name und Adresse
	 * 
	 * @param name
	 * @param address
	 * @return
	 */
	public Contact getContact(String name, String address) {
		for (int i = 0; i < contacts.size(); i++) { // geht durch ganzes AddressBook
			Contact tmp = contacts.get(i); // gibt Kontakt zurück
			if (tmp.getName().equals(name) && tmp.getAdress().equals(address)) {
				return tmp; // gibt Kontakt zurück
			}
		}
		return null;
	}

	/**
	 * Fähigkeit Ausgabe der aktuellen grösse der AddressBook Anzahl Einträge
	 * 
	 * @return
	 */
	public int getSize() {
		return contacts.size();
	}

}
