package tutorial6;

/**
 * print fraction, reduce fraction, print reduced fraction, multiply two
 * fractions, divide two fraction, add two fractions together, compare two
 * fractions, denominator mustn't be 0
 * 
 * @author etotz
 *
 */

public class Number1Fraction {
	private int numerator;
	private int denominator;

	/**
	 * constructor for only one faction with no denomiantor
	 * 
	 * @param numerator
	 * @param denominator
	 */
	public Number1Fraction(int denominator) {
		this(1, denominator);
	}

	/**
	 * constructor for two fractions
	 * 
	 * @param numerator
	 * @param denominator
	 */
	public Number1Fraction(int numerator, int denominator) {
		this.numerator = numerator;

		if (denominator == 0) {
			System.out.println("Denominator mustn't 0!");
		} else {
			this.denominator = denominator;
		}
	}

	/**
	 * setting numerator
	 * 
	 * @param numerator
	 */
	public void setNumerator(int numerator) {
		this.numerator = numerator;
	}

	/**
	 * setting denomiantor denominator not be 0
	 * 
	 * @param denominator
	 */
	public void setDominator(int denominator) {
		if (denominator == 0) {
			System.out.println("Denominator must not be 0");
		} else {
			this.denominator = denominator;
		}
	}

	/**
	 * get the numerator
	 */
	public int getNumerator() {
		return this.numerator;
	}

	/**
	 * get the denominator
	 */
	public int getDenominator() {
		return this.denominator;
	}

	/**
	 * print out fraction
	 */
	public void printFraction() {
		System.out.println(getNumerator() + "/" + getDenominator());
	}

	/**
	 * reduce of the fraction
	 */
	private void reduce() {
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
	 * print out the reduce fraction
	 */
	public void printFractionReduced() {
		reduce();
		printFraction();
	}

	/**
	 * multiply two different fractions
	 * 
	 * @param z
	 * @return
	 */
	public void multiply(Number1Fraction z) {
		this.numerator = z.numerator * this.numerator;
		this.denominator = this.denominator * z.denominator;
	}

	/**
	 * divide two different fractions
	 * 
	 * @param z
	 * @return
	 */
	public void divide(Number1Fraction z) {
		this.numerator = z.denominator * this.numerator;
		this.denominator = z.numerator * this.denominator;
	}

	/**
	 * add two fractions together
	 * 
	 * @param z
	 * @return
	 */
	public void add(Number1Fraction z) {
		int temp = z.denominator * this.denominator;
		this.numerator = ((temp / this.denominator) * this.numerator) + ((temp / z.denominator) * z.numerator);
		this.denominator = temp;
	}

	/**
	 * compare two fractions
	 * 
	 * @param z
	 * @return
	 */
	public void compare(Number1Fraction z) {
		this.reduce();
		z.reduce();
		if (this.numerator == z.numerator) {
			if (this.denominator == z.denominator) {
				System.out.println(" true");
			} else {
				System.out.println(" false");
			}
		}
	}
}
