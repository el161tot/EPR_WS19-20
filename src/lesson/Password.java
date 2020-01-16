package lesson;

public class Password {
	private char[] password;
	private final int key;

	public Password(char[] password, int key) {
		this.password = new char[password.length];
		this.key = key;
		for (int i = 0; i < password.length; i++) {
			this.password[i] = (char) (password[i] + key);
		}

	}

	public void printPassword(int key) {
		for (int i = 0; i < this.password.length; i++) {
			System.out.println((char) (this.password[i] - key));
		}
		System.out.println();
	}

	public boolean changePassword(char[] oldPassword, char[] newPassword) {
		for (int i = 0; i < oldPassword.length; i++) {
			if ((this.password[i] - this.key) != oldPassword[i]) {
				return false;
			}

		}
		return false;
	}

	public boolean strongPassword(char[] oldPassword) {
		for (int i = 0; i < oldPassword.length; i++) {
			if (password.length > 8) {
				return false;
			}
			if (password[i] < 48 && password[i] > 57) { // Beispielhaft
				password = true;
			}
			return false;
		}

	}

}
// Sarah fragen!
