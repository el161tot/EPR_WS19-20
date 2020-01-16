package lesson1312;

public class Application {

	public static void main(String[] agrs) {

		// Node n = new Node(null, null, "hallo");
		// System.out.println(n.getCotent());

		BinaryTree empty = new BinaryTree();
		BinaryTree a = new BinaryTree("Tree a");
		BinaryTree b = new BinaryTree("Tree b");
		BinaryTree c = new BinaryTree(a, b, "Tree c");
		BinaryTree d = new BinaryTree(c, empty, "Tree d"); // Wurzel des Baums

		//printTree(d);

		// System.out.println(d.getLeft().getRoot().getCotent());
		// System.out.println(d.getRight().getRoot().getCotent());
	}

	/**
	 * print out tree rekursiv pre order
	 * 
	 * @param z
	 */
	/*public static void printTree(BinaryTree z) {
		if (z.getRoot() == null) {
			return;
		}
		System.out.println(z.getRoot().getCotent());
		printTree(z.getLeft());
		printTree(z.getRight());
	} 

	/**
	 * print out tree rekursiv post order
	 * 
	 * @param z
	 */
	/*
	 * public static void printTree(BinaryTree z) { if (z.getRoot() == null) {
	 * return; }
	 * 
	 * printTree(z.getLeft()); printTree(z.getRight());
	 * System.out.println(z.getRoot().getCotent()); }
	 * 
	 * /** print out tree rekursiv in order
	 * 
	 * @param z
	 */
	/*
	 * public static void printTree(BinaryTree z) { if (z.getRoot() == null) {
	 * return; }
	 * 
	 * printTree(z.getLeft()); System.out.println(z.getRoot().getCotent());
	 * printTree(z.getRight()); }
	 */ 
	

}
