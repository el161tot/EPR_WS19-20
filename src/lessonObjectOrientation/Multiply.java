package lessonObjectOrientation;

public class Multiply {
	public static void main(String[] args) {
		Fraction a = new Fraction();
		a.numerator = 3;
		a.denominator = 5;

		Fraction b = new Fraction();
		b.numerator = 2;
		b.denominator = 6;

		Fraction d = a.multiply(b);
		d.printFraction();

	}

}
