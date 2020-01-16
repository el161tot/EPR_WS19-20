package lesson1001;

public class Apple extends Vegetarian {
	/**
	 * an Apple has a random amount of calories (< apples).
	 */
	public Apple() {
		super((int) (Math.random() * 100));
	}

	/**
	 * overwrite the method toString
	 */
	public String toString() {
		return "Apple";
	}

}
