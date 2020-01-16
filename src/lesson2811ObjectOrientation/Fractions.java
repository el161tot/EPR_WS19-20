package lesson2811ObjectOrientation;

public class Fractions {
	
	public static void extend(Fraction a, int value) {
		a.setNumerator(a.getDenominator()*value);
		a.setDenominator(a.getDenominator() * value);
		
	}
	public static Fraction extend2(Fraction a, int value) {
		Fraction b = new Fraction();
		a.numerator = a.numerator * value;
		a.denominator = a.denominator * value;
		return b;
	}

}
