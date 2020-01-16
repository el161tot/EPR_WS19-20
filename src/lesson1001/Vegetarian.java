package lesson1001;

public abstract class Vegetarian extends Food {

	/**
	 * appropriate constructor
	 * 
	 * @param calories
	 */

	public Vegetarian(int calories) {
		super(calories);
	}

	public boolean isVegetarian() {
		return true;
	}
}
