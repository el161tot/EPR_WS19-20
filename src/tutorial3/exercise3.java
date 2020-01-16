package tutorial3;

public class exercise3 {

	public static void main(String[] args) 
	{
		int number = 1;
		System.out.println(" is " + number + " a prime number?:" + isPrimenumber(number));
	}
	/**
	 * 
	 * @param number
	 * @return
	 */

	public static boolean isPrimenumber(int number) {
		boolean primenumber = false;
		int divisionnumber = 0;

		if (number > 0) {
			for (int i = 1; i <= number; i++) {
				if (number % i == 0) { // no remain
					divisionnumber++;
				}
			}
		}
		if (divisionnumber == 2) { // division two times without remain
			primenumber = true;
		}
		return primenumber;
	}
}
