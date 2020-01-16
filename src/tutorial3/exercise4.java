package tutorial3;

public class exercise4 {
	public static void main(String[] args) {
		primfactor(256); // Methode mit Dezimalzahl
	}
/**
 * 
 * @param number
 */
	public static void primfactor(int number)
	{
		int divisionnumber = 2;

		while (divisionnumber <= (int) Math.sqrt(number) && number > 1) {
			if (number % divisionnumber == 0) {
				number = number / divisionnumber;
				System.out.print(divisionnumber + "*");
			} else {
				divisionnumber++; // Nummer vergrößern

			}
		}
		if (number != 1) {
			System.out.print(number);
		}
	}
}
