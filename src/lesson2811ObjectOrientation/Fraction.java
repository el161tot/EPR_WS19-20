package lesson2811ObjectOrientation;


public class Fraction {
	public int numerator;
	public int denominator;
	
	/**
	 * zahlen wie viele Brüche da sind
	 */
	public static int count;
	

	/**
	 * Bruch ausgeben
	 */
	public void printFraction(int numerator, int denominator) {
		System.out.println(numerator + "/" + denominator);
		System.out.println(Fraction.count);
	}
	
	public void reduce() {
		int z, n, r;
		z = numerator;
		n = denominator;
		r = z % n;
		while (r > 0) {
			z = n;
			n = r;
			r = z % n;
		}
		numerator = numerator / n;
		denominator = denominator / n;
	}

	public void setNumerator(int a) {
		this.numerator = a;
	}

	public void setDenominator(int a) {
		this.denominator = a;

	}

	public int getNumerator() {

		return this.numerator;
	}

	public int getDenominator() {

		return this.denominator;
	}
	
		
	public static boolean compare(Fraction a, Fraction b) {
		a.reduce();
		b.reduce();
		
		return true;
	}
	

}

