package tutorial5;

/**
 * recursiv
 * 
 * @author etotz
 *
 */

public class Number1 {
	/**
	 * Random number
	 * 
	 * @param arg
	 */
	public static void main(String[] args) {
		int size = 5;
		int[] array = new int[size];
		getRandomArray(size, array);
		System.out.println("sorted Array: ");
		bubbleSort(array, array.length);
		printArray(array);

	}

	/**
	 * random Array numbers
	 * 
	 * @param size
	 * @param array
	 * @return
	 */

	public static int[] getRandomArray(int size, int[] array) {
		for (int i = 0; i < array.length; i++) {
			int random = (int) (Math.random() * size);
			array[i] = random;
		}
		return array;
	}

	public static void printArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}

	/**
	 * bubblesort
	 * 
	 * @param array
	 * @param a
	 * @return
	 */
	public static int[] bubbleSort(int[] array, int a) {
		if (a == 1) {
			return array;
		}
		swap(array, 0);
		bubbleSort(array, a - 1);
		return array;
	}

	/**
	 * swap array
	 * 
	 * @param array
	 * @param b
	 * @return
	 */
	public static int[] swap(int[] array, int i) {
		if (i >= array.length - 1) { // break condition
			return array;
		} else {
			if (array[i] > array[i + 1]) {
				int temp = array[i]; // swap
				array[i] = array[i + 1];
				array[i + 1] = temp;
				printArray(array); // print the intermediate step
			} else {
				array[i] = array[i];
				array[i + 1] = array[i + 1];
			}
			i++; // every index of the array
			array = swap(array, i);
			return array;
		}
	}
}
