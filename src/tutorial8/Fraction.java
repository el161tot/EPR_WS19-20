package tutorial8;

/**
 * print out Fraction multiply two Fractions divide add
 * 
 * @author etotz
 *
 */
public class Fraction {
	private int numerator;
	private int denominator;

	/**
	 * constructor for two fractions
	 * 
	 * @param numerator
	 * @param denominator
	 */
	public Fraction(int numerator, int denominator) {
		this.numerator = numerator;
		this.denominator = denominator;
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
	 * setting denominator denominator not be 0
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
	 * multiply two different fractions
	 * 
	 * @param z
	 * @return
	 */
	public Fraction multiply(Fraction z) {
		Fraction m = new Fraction(numerator, denominator);
		m.numerator = z.numerator * this.numerator;
		m.denominator = this.denominator * z.denominator;
		return m;
	}

	/**
	 * divide two different fractions
	 * 
	 * @param z
	 * @return
	 */
	public Fraction divide(Fraction z) {
		Fraction d = new Fraction(numerator, denominator);
		d.numerator = z.denominator * this.numerator;
		d.denominator = z.numerator * this.denominator;
		return d;
	}

	/**
	 * add two fractions together
	 * 
	 * @param z
	 * @return
	 */
	public Fraction add(Fraction z) {
		Fraction add = new Fraction(numerator, denominator);
		int temp = z.denominator * this.denominator;
		add.numerator = ((temp / this.denominator) * this.numerator) + ((temp / z.denominator) * z.numerator);
		add.denominator = temp;
		return add;
	}
}
