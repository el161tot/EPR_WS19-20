package lesson1912;

import java.util.ArrayList;

public class Huffman {

	private ArrayList<Character> chars;
	private ArrayList<Double> charsProbs;

	public Huffman() {

		String input = "hallo zusammen";

		calculateProbs(input);
	}

	public void calculateProbs(String input) {

		ArrayList<Character> chars = new ArrayList<Character>(input.length()); // Buchstaben
		ArrayList<Double> charsProbs = new ArrayList<Double>(input.length()); // Counter

		for (int i = 0; i < input.length(); i++) {
			char tmp = input.charAt(i);

			if (chars.contains(tmp)) {
				int index = chars.indexOf(tmp); // index vom jeweiligen Buchstabe wird abgespeichert
				charsProbs.set(index, charsProbs.get(index) + 1);
			} else {
				chars.add(tmp); // initialisiere das Element
				charsProbs.add(1.0); // erhöhe counter
			}
		}
		for (int i = 0; i < charsProbs.size(); i++) {
			charsProbs.set(i, charsProbs.get(i) / input.length());
		}
		sortLists();
		System.out.println(chars.get(chars.size() - 1));
		System.out.println(charsProbs.get(0));
	}

	public void sortLists() {

		for (int i = 1; i < charsProbs.size(); i++) {
			for (int j = 0; j < charsProbs.size() - i; j++) {
				if (charsProbs.get(j) > charsProbs.get(j + 1)) {

					Double tmp = charsProbs.get(j);
					charsProbs.set(j, charsProbs.get(j + 1));
					charsProbs.set(j + 1, tmp);

					Character tmp2 = chars.get(j);
					chars.set(j, chars.get(j + 1));
					chars.set(j + 1, tmp2);
				}
			}
		}
	}
}
