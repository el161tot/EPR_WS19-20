package lessonObjectOrientation;

public class Fraction {
	public int numerator;
	public int denominator;

	/**
	 * Bruch ausgeben
	 */
	public void printFraction() {
		System.out.println(numerator + "/" + denominator);
	}

	/**
	 * Kürzen des Bruchs
	 */
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

	/**
	 * ausgeben des gekürzten Bruchs
	 */
	public void printFractionReduced() {
		reduce();
		printFraction();
	}

	/**
	 * muliplikation von Brüchen
	 * 
	 * @param value
	 */
	public Fraction multiply(Fraction z) {
		Fraction c = new Fraction(); // neuer Speicher für Ergebnis
		c.numerator = z.numerator * this.numerator;
		c.denominator = this.denominator * z.denominator;

		return c;
	}

	public void setNumerator(int a) {
		this.numerator = a;
	}

	public void setDenominator(int a) {
		this.denominator = a;
		// noch abbruchbedingung, da denominator nicht 0 sein darf

	}

	public int getNumerator() {

		return this.numerator;
	}

	public int getDenominator() {

		return this.denominator;
	}

}
