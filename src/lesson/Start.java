package lesson;

public class Start {
	public static void main(String[] args) {

		char test = 'a';
		System.out.println(test);
		test = (char) (test + 1);
		System.out.println(test);

		char[] testPassword = "1Test!super".toCharArray();
		Password pwd = new Password("Passwort123".toCharArray(), 1);
		Password pwd2 = new Password("!$Hallo$".toCharArray(), 200);
		// System.out.println("The password is:");

		pwd.printPassword(1);
		pwd2.printPassword(1);

		/*
		 * System.out.println("*****************");
		 * System.out.println("Password is strong -" +
		 * pwd.changePassword("Passwort123".toCharArray(),
		 * "Passwort1234".toCharArray())); System.out.println("*****************");
		 */

	}

}
