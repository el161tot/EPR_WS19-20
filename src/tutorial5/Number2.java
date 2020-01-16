package tutorial5;

public class Number2 {
	/**
	 * declare numbers for array
	 * 
	 * @param arg
	 * @return
	 */
	public static void main(String[] args) {
		int array[] = { 7, 10, 7, 5 };
		int commaShift = array.length - 1;
		printArray(array);
		addition(array, commaShift);

	}

	/**
	 * to print the array between the steps
	 * 
	 * @param array
	 */

	public static void printArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}

	/**
	 * addition of the numbers print out the final solution
	 * 
	 * @param array
	 * @return
	 */
	public static int addition(int[] array, int i) {
		if (i == 0) {
			System.out.println("solution:" + array[0]);
			return array[0];
		} else {
			array = loop(array, 0, i);
			// printArray(array);
			System.out.println(i);
			--i;
			addition(array, i);
			return i;
		}
	}

	/**
	 * main method for the addition of the numbers
	 * 
	 * @param array
	 * @param a
	 * @param i
	 * @return
	 */

	public static int[] loop(int array[], int a, int i) {
		if (a >= array.length) {
			return array;
		} else {
			if (i <= a) {
				array[a] = 0; // no number anymore = print out 0
			} else {
				array[a] = array[a] + array[a + 1]; // addition between numbers next to each other
			}
			a++; // next array index
			array = loop(array, a, i);
			return array;
		}
	}

}
