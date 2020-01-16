package tutorial3;

public class exercise2 {
	public static void main(String[] args) {
		calculateDecimalNumber();
	}

	/**
	 * calculate decimalnumber base: 0 < base < 10
	 */
	public static void calculateDecimalNumber() {
		int number = 121;
		int base = 4;
		int remain = 0;
		int commaShift = 0;
		int decimalnumber = 0;

		switch (base) {
		case 1: {
			while (number != 0) {
				remain = number % 10;
				decimalnumber = decimalnumber + (int) (remain * (Math.pow(1, commaShift)));
				number = number / 10;
				commaShift = commaShift + 1;
			}
			System.out.println("decimalnumber:" + decimalnumber);
			break;
		}
		case 2: {
			while (number != 0) {
				remain = number % 10;
				decimalnumber = decimalnumber + (int) (remain * (Math.pow(2, commaShift)));
				number = number / 10;
				commaShift = commaShift + 1;
			}
			System.out.println("decimalnumber:" + decimalnumber);
			break;
		}
		case 3: {
			while (number != 0) {
				remain = number % 10;
				decimalnumber = decimalnumber + (int) (remain * (Math.pow(3, commaShift)));
				number = number / 10;
				commaShift = commaShift + 1;
			}
			System.out.println("decimalnumber:" + decimalnumber);
			break;
		}
		case 4: {
			while (number != 0) {
				remain = number % 10;
				decimalnumber = decimalnumber + (int) (remain * (Math.pow(4, commaShift)));
				number = number / 10;
				commaShift = commaShift + 1;
			}
			System.out.println("decimalnumber:" + decimalnumber);
			break;
		}
		case 5: {
			while (number != 0) {
				remain = number % 10;
				decimalnumber = decimalnumber + (int) (remain * (Math.pow(5, commaShift)));
				number = number / 10;
				commaShift = commaShift + 1;
			}
			System.out.println("decimalnumber:" + decimalnumber);
			break;
		}
		case 6: {
			while (number != 0) {
				remain = number % 10;
				decimalnumber = decimalnumber + (int) (remain * (Math.pow(6, commaShift)));
				number = number / 10;
				commaShift = commaShift + 1;
			}
			System.out.println("decimalnumber:" + decimalnumber);
			break;
		}
		case 7: {
			while (number != 0) {
				remain = number % 10;
				decimalnumber = decimalnumber + (int) (remain * (Math.pow(7, commaShift)));
				number = number / 10;
				commaShift = commaShift + 1;
			}
			System.out.println("decimalnumber:" + decimalnumber);
			break;
		}
		case 8: {
			while (number != 0) {
				remain = number % 10;
				decimalnumber = decimalnumber + (int) (remain * (Math.pow(8, commaShift)));
				number = number / 10;
				commaShift = commaShift + 1;
			}
			System.out.println("decimalnumber:" + decimalnumber);
			break;
		}
		case 9:
			while (number != 0) {
				remain = number % 10;
				decimalnumber = decimalnumber + (int) (remain * (Math.pow(9, commaShift)));
				number = number / 10;
				commaShift = commaShift + 1;
			}
			System.out.println("decimalnumber:" + decimalnumber);
			break;
		}

	}
}
