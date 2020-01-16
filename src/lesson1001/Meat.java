package lesson1001;

public abstract class Meat extends Food {

	/**
	 * appropriate constructor
	 * 
	 * @param calories
	 */
	public Meat(int calories) {
		super(calories);
	}

	public boolean isVegetarian() {
		return false;
	}
}
