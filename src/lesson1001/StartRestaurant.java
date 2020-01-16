package lesson1001;

public class StartRestaurant {

	public static void main(String[] args) {

		System.out.println("Welcome to our Restaurant");
		Guest tobi = new Guest("Tobi", true);
		Guest laura = new Guest("Laura", false);
		System.out.println(tobi + ": " + tobi.getCal());
		System.out.println(laura + ": " + laura.getCal());
		while (tobi.isHungry()) {
			tobi.eat(cook());
		}
		while (laura.isHungry()) {
			laura.eat(cook());
		}
	}

	/**
	 * Cook some food. 50% chance to get an apple or a burger
	 * 
	 * @return abstract food (which is just a pointer to the real food)
	 */
	public static Food cook() {
		// There is a 50% chance to return an Apple or a Burger
		if (Math.random() <= 0.5) {
			return new Apple();
		} else {
			return new Burger();
		}
	}
}
