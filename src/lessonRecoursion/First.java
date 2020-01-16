package lessonRecoursion;

public class First {
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// descend(10);
		System.out.println("Recursion");
		// int n = 5;
		// System.out.println("Recursive call:" + faculty(n));
		// System.out.println("Interative call:" + itFaculty(n));
		System.out.println(fac(4));
		// int a = 30;
		// int b = 10;
		// System.out.println(" ");
		// System.out.println(" ");
	}

	/**
	 * 1
	 * 
	 * @param n
	 */

	public static void descend(int n) {
		System.out.println(n);
		descend(n - 1);
	}

	/**
	 * 2
	 * 
	 * @param n
	 * @return
	 */

	public static int fac(int n) {
		if (n == 0) {
			return 1;
		} else {
			return n * fac(n - 1);
		}
	}

	/**
	 * 3
	 * 
	 * @param n
	 * @return
	 */

	public static int itFaculty(int n) {
		int result = 1;
		for (int i = 1; i <= n; i++) {
			result = result * i;
		}
		return result;
	}

	/**
	 * 4
	 * 
	 * @param array
	 * @param index
	 * @return
	 */
	public static boolean palindromRecursive(char[] array, int index) {
		if (index == 0 || index == 1) {
			return true;
		} else if (array[index - 1] == array[array.length - index]) {
			index--;
			return palindromRecursive(array, index);
		} else {
			return false;
		}
	}
}
