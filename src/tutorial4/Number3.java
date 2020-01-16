package tutorial4;

/**
 * programming a seat reservation for a cinema
 * 
 * @author etotz
 *
 */

public class Number3 {
	public static void main(String[] args) {
		char[][][] array = new char[3][4][10];
		hall(array);
		char[][][] cinema = hall(array);

		reservation(cinema, 'A', 2, 4, 7);
		reservation(cinema, 'A', 2, 7, 9);

	}

	public static char[][][] hall(char[][][] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				for (int k = 0; k < array[i][j].length; k++) {
					array[i][j][k] = '-';
					System.out.print(array[i][j][k]);
				}
			}
			System.out.println();
		}
		return array;
	}

	public static void reservation(char[][][] array, char a, int row, int from, int to) {
		switch (a) {
		case 'A':
			checkIfFree(array, 0, row, from, to);
			break;
		case 'B':
			checkIfFree(array, 1, row, from, to);
			break;
		case 'C':
			checkIfFree(array, 2, row, from, to);
			break;
		}
	}

	public static void checkIfFree(char[][][] array, int block, int row, int from, int to) {
		boolean status = true;
		for (int i = from; i <= to; i++) {
			if (array[block][row - 1][i - 1] == '-') {

			} else {
				status = false;
			}
		}
		if (status == true) {
			for (int i = from; i <= to; i++) {
				array[block][row - 1][i - 1] = '#';
			}
			System.out.println("Reserved");
			return;
		}
		System.out.println("Unfortunatley not free");
	}

}
