package tutorial4;

/**
 * a reserve of an array
 * 
 * @author etotz
 *
 */

public class Number1 {
	/**
	 * turns around the array
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		int[] array1 = { 1, 2, 3, 4 };

		for (int i = 1; i <= array1.length; i++) {
			System.out.print(array1[array1.length - i]);

		}

	}

}
