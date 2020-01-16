package lesson0612;

public class Contact {

	private String name; // Eigenschaft
	private String address;

	/**
	 * constructor nur mit Name, ohne Adresse
	 * 
	 * @param name
	 */
	public Contact(String name) {
		this(name, "unknown"); // leitet in unteren constructor weiter
	}

	/**
	 * constructor mit Name und Adresse
	 * 
	 * @param name
	 * @param address
	 */
	public Contact(String name, String address) {
		this.name = name;
		this.address = address;
	}

	/**
	 * getter name
	 * 
	 * @return
	 */
	public String getName() {
		return this.name;
	}

	/**
	 * getter address
	 * 
	 * @return
	 */
	public String getAdress() {
		return this.address;
	}

}
