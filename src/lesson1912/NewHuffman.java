package lesson1912;

import java.util.ArrayList;

public class NewHuffman {
	private ArrayList<Character> chars;
	private ArrayList<Double> charsProbs;
	private ArrayList<BinaryTree> trees;

	private ArrayList<Character> characters = new ArrayList<Character>();
	private ArrayList<String> encoding = new ArrayList<String>();

	public NewHuffman() {
		String input = "Merry Christmas";

		// ********************************
		// **********STEP 1 & 2************
		// ********************************
		// Calculate the probability of each character in the String
		// Sort the characters according to their probability.
		calculateProbs(input);

		double sum = 0;
		for (int i = 0; i < chars.size(); i++) {
			System.out.println(chars.get(i));
			System.out.println(charsProbs.get(i));
			sum = sum + charsProbs.get(i);
		}
		System.out.println("Sum: " + sum);

		// ********************************
		// ************STEP 3**************
		// ********************************
		// Initialize the leaves of the tree
		// Each character is represented as a node in the tree
		// together with its probability
		initTree();

		// ********************************
		// ************STEP 4**************
		// ********************************
		// Construct the tree
		// Always merge the two subtrees having the lowest probability
		// Encode the leaves according the their path to the root
		buildTree(trees);

		// ********************************
		// ************STEP 5**************
		// ********************************
		// Do the encoding
		System.out.println("Input:");
		System.out.println(input);

		String encoded = "";
		for (int i = 0; i < input.length(); i++) {
			// Replace the chars in the String with the encoding
			encoded = encoded + encoding.get(characters.indexOf(input.charAt(i)));
		}

		System.out.println("Encoded:");
		System.out.println(encoded);

		// ********************************
		// ************STEP 6**************
		// ********************************
		// Decode the encoded String
		System.out.println("Decoded:");
		// ***********DECODE************
		// decode the input using the tree.
		decode(encoded);
		// ***********DECODE************
	}

	/**
	 * Get the probability of each character in the input String
	 * 
	 * @param input - String
	 */
	private void calculateProbs(String input) {
		chars = new ArrayList<Character>(input.length());
		charsProbs = new ArrayList<Double>(input.length());

		// get the count of all character
		for (int i = 0; i < input.length(); i++) {
			char tmp = input.charAt(i);

			if (chars.contains(tmp)) {
				int index = chars.indexOf(tmp);
				charsProbs.set(index, charsProbs.get(index) + 1);
			} else {
				chars.add(tmp);
				charsProbs.add(1.0);
			}
		}
		// Calculate the probability
		for (int i = 0; i < charsProbs.size(); i++) {
			charsProbs.set(i, charsProbs.get(i) / input.length());
		}

		sortLists();
	}

	/**
	 * sort the lists according to the probability of the respective character.
	 */
	private void sortLists() {
		for (int i = 1; i < charsProbs.size(); i++) {
			for (int j = 0; j < charsProbs.size() - i; j++) {
				// Performing the swap of neighboring elements
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

	/**
	 * init tree according to the probability of the character. Each character is
	 * represented as a binary tree not having any children.
	 */
	private void initTree() {
		trees = new ArrayList<BinaryTree>(chars.size());

		for (int i = 0; i < chars.size(); i++) {
			trees.add(new BinaryTree(chars.get(i) + "", charsProbs.get(i)));
		}
	}

	/**
	 * recursively build the tree by combining the two nodes with the lowest
	 * probability value Repeat until there is only one single root node.
	 */

	private void buildTree(ArrayList<BinaryTree> trees) {
		// Check whether the combined binary tree has been added to the list of trees.
		boolean wasAdded = false;
		// combine the nodes with the lowest probability
		// until there is only one tree left

		if (trees.size() > 1) // check, whether there is more than one tree in the list
		{
			// Get the left and the right BinaryTree, have the index 0 and 1
			BinaryTree left = trees.get(0);
			BinaryTree right = trees.get(1);

			// combine both trees having a common root
			BinaryTree root = new BinaryTree(left, right, "", left.getRoot().getFreq() + right.getRoot().getFreq());

			// Remove the two trees from the list
			trees.remove(0);
			trees.remove(0);

			// add the root at the correct position in the list (ordered according to
			// frequency)
			for (int i = 0; i < trees.size(); i++) {
				if (trees.get(i).getRoot().getFreq() > root.getRoot().getFreq()) {
					trees.add(i, root);
					wasAdded = true;
					break;
				}
			}
			// If it was still not added to the list
			if (wasAdded == false) {
				trees.add(trees.size(), root);
			}

			// Recursion:
			// Call the method again
			buildTree(trees);
		}

		// There is only 1 tree left, which is the resulting binary tree
		else {
			// call the method with the last tree in the list
			// AND an empty String
			// uncomment the next line and enter the input parameters:
			createHuffmanTable(trees.get(0), "");
		}
	}

	/**
	 * Traverse the tree in preorder and construct the encoding table
	 */

	private void createHuffmanTable(BinaryTree root, String direction) {
		if (root == null) {
			return;
		} else {
			if (!root.isEmpty()) {
				// If it is a leaf node, then build the coding table
				if (root.getLeft().isEmpty() && root.getRight().isEmpty()) {
					encoding.add(direction);
					characters.add(root.getRoot().getCotent().charAt(0)); // give out the letter
				}

				// Recursion:

				// Call the method again with the left child and add '0' to the direction String
				createHuffmanTable(root.getLeft(), direction + "0");
				// Call the method again with the right child and add '1' to the direction
				// String
				createHuffmanTable(root.getRight(), direction + "1");
			}
		}
	}

	/**
	 * Decode the input String using the huffman table
	 * 
	 * @param encoded
	 */

	private void decode(String encoded) {
		// Start from the beginning of the input
		for (int i = 0; i < encoded.length(); i++) {
			// Stop if we are able to match a substring from the input with our decoding
			// table
			if (encoding.contains(encoded.substring(0, i))) {
				// Print the result to the console
				System.out.print(characters.get(encoding.indexOf(encoded.substring(0, i))));

				// Cut the already decoded part from the input String
				encoded = encoded.substring(i + 1, encoded.length() - 1);

				break;
			}
		}

		// If the input is 0 then there is nothing more to decode
		if (encoded.length() > 0)
			decode(encoded);
	}
}
