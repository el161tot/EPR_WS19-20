package lesson1001;

public abstract class Food {

	private int calories;

	/**
	 * every food has some calories
	 * 
	 * @param calories
	 */
	public Food(int calories) {
		this.calories = calories;
	}

	// TODO: implement the getter
	/**
	 * get the calories of the food
	 * 
	 * @return
	 */
	public int getCalories() {
		return this.calories;
	}

	/**
	 * Check, whether the food is vegetarian.
	 * 
	 * @return true, if vegetarian food
	 */
	public abstract boolean isVegetarian();
}
