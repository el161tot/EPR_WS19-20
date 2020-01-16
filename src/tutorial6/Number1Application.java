package tutorial6;
/**
 * test the Number1Fraction
 * @author etotz
 *
 */

public class Number1Application {
	public static void main(String[] args) {
		Number1Fraction a = new Number1Fraction(1, 2);
		Number1Fraction b = new Number1Fraction(3, 6);

		a.printFraction();
		b.printFraction();
		
		a.compare(b);

		a.multiply(b);
		System.out.println("Mutiply a and b:");
		a.printFraction();
		System.out.print("=");
		a.printFractionReduced();

		a.divide(b);
		System.out.println("Divide a and b:");
		a.printFraction();
		System.out.print("=");
		a.printFractionReduced();

		a.add(b);
		System.out.println("Add a and b:");
		a.printFraction();
		System.out.print("=");
		a.printFractionReduced();

	}

}
