package tutorial8;

public class Application {
	public static void main(String[] args) {
		System.out.println("number 1:");
		Fraction a = new Fraction(1, 2);
		Fraction b = new Fraction(3, 6);

		a.printFraction();
		b.printFraction();

		Fraction m;
		m = a.multiply(b);
		m.printFraction();

		Fraction d;
		d = a.divide(b);
		d.printFraction();

		Fraction add;
		add = a.add(b);
		add.printFraction();

		System.out.println("number 2:");
		Point p = new Point(3.2, 4.9);
		Point q = new Point(1.4, 6.2);

		System.out.println(p.toString());
		System.out.println(q.toString());

		Line one = new Line(p, q);
		System.out.println(one);

		System.out.println("number 3:");
		int weight = 82;
		double height = 1.94;
		double bmi;
		String category;
		bmi = Health.bmi(weight, height);
		category = Health.category(bmi);
		System.out.println("Given your BMI value of: " + bmi + " you are categorized as: " + category);

	}

}
