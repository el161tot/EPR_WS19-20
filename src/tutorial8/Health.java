package tutorial8;

/**
 * calculation of bmi and categorized
 * 
 * @author etotz
 *
 */

public class Health {

	/**
	 * calculation of bmi
	 * 
	 * @param weight
	 * @param height
	 * @return
	 */
	public static double bmi(int weight, double height) {
		return weight / (height * height);
	}

	/**
	 * categorized the different bmi types
	 * 
	 * @param bmi
	 * @return
	 */
	public static String category(double bmi) {
		if (bmi < 18.5) {
			return "underweight";
		} else if (bmi >= 18.5 && bmi < 25) {
			return "normal weight";
		} else if (bmi >= 25 && bmi < 30) {
			return "overweight";
		} else if (bmi >= 30) {
			return "obsese";
		}
		return null;
	}
}
