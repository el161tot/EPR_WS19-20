package lesson1001;

public class Burger extends Meat {

	/**
	 * a Burger has a random amount of calories (> apples)
	 * 
	 * @param calories
	 */

	public Burger() {
		super((int) (Math.random() * 1000));
	}

	/**
	 * overwrite the method toString
	 */
	
	public String toString() {
		return "Burger";
	}
}
