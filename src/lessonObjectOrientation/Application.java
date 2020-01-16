package lessonObjectOrientation;

public class Application {
	public static void main(String[] args) {
		Fraction b = new Fraction();
		b.numerator = 4;
		b.denominator = 2;
		// System.out.println("Fraction b = " + b.denominator +"/" + b.numerator);
		b.printFraction();
		// b.reduce();
		b.printFractionReduced();
	}

}
