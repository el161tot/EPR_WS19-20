package tutorial4;

/**
 * a array as a time series
 * 
 * @author etotz
 *
 */

public class Number2 {
	/**
	 * define timeArray
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		int[] timeArray = { -4, -5, 10, 9, 8, 12 };
		for (int i = 0; i < timeArray.length; i++) {
			System.out.print(timeArray[i] + ",");
		}
		System.out.println();
		max(timeArray);

	}

	/**
	 * define the maximal Differenz
	 * 
	 * @param values
	 */
	public static void max(int[] values) {
		int timeArray = 0;
		for (int i = 0; i < values.length; i++) {
			for (int j = i + 1; j < values.length; j++) {
				if (values[i] - values[j] > timeArray) {
					timeArray = values[i] - values[j];
				}
			}

		}
		System.out.println(timeArray);
	}

}
