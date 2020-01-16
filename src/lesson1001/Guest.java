package lesson1001;

public class Guest {

	private String name;
	private boolean isVegetarian;
	private int cal;

	/**
	 * Only constructor. It must be specified whether our guest is a vegetarian and
	 * his/her name. Additionally, each guest has a random amount of calories he/she
	 * needs to consume.
	 * 
	 * @param name
	 * @param isVegetarian
	 */

	public Guest(String name, boolean isVegetarian) {
		this.name = name;
		this.isVegetarian = isVegetarian;
		this.cal = (int) (Math.random() * 10000);
	}

	public String getName() {
		return this.name;
	}

	public boolean getIsVegetarian() {
		return this.isVegetarian;
	}

	public int getCal() {
		return this.cal;
	}

	// TODO: implement the method eat
	/**
	 * Our guest eats some food
	 * 
	 * @param food
	 */
	public void eat(Food food) {

		if (!food.isVegetarian() && isVegetarian == true) { // Check, whether our guest eats the food, if a burger is
															// offered and the guest
															// is vegetarian, he/she will not eat the burger
			System.out.println(this.name + " does not eat " + food);
		} else {
			System.out.println(this.name + " likes and eats " + food + " with " + food.getCalories() + "cal");
			this.cal = this.cal - food.getCalories();
		}
	}

	/**
	 * Check, whether our guest needs to consume more calories
	 * 
	 * @return true, if the guest needs to eat more
	 */

	public boolean isHungry() {
		if (this.cal > 0) {
			System.out.println(this.name + " is still hungry and needs " + this.cal + "more cal");
			return true;
		} else {
			System.out.println(this.name + " isn´t hungry");
			return false;
		}
	}

	public String toString() {
		return this.name;
	}

}
