package lessonRecoursion;

public class Second {
	public static void main(String[] args) {
		int n = 6;
		System.out.println("Fibonacci=" + fib(n));

		int[] array = new int[fib(n) + 1];
		System.out.println("Fibonacci-Zahl Speed-up von " + n + ":" + fibSpeed(n, array));
	}

	/**
	 * finonacci zahlen deklarieren
	 * 
	 * @param n
	 * @return
	 */

	public static int fib(int n) {
		if (n == 0) {
			return 0;
		}
		if (n == 1) {
			return 1;
		} else {

			return fib(n - 1) + fib(n - 2);
		}
	}

	/**
	 * speed-up with array
	 * 
	 * @param array
	 * @return
	 */

	public static int fibSpeed(int n, int[] array) {
		if (n == 0) {
			return 0;
		} else if (n == 1) {
			return 1;
		} else {
			if (array[n] != 0) {
				return array[3];
			} else {
				array[n] = fib(n - 1) + fib(n - 2);
			}
			return array[n];
		}
	}
}