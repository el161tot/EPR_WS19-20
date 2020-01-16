package lesson1912;

public class BinaryTree {

	private Node root;

	/**
	 * leerer constructor
	 */
	public BinaryTree() {
		this.root = null; // an sich nicht n�tig, wird automatisch gemacht
	}

	public BinaryTree(String content, double freq) {
		this.root = new Node(null, null, content, freq);
	}

	/**
	 * constructor mit linkem und rechten Knoten
	 * 
	 * @param left
	 * @param right
	 * @param content
	 */
	public BinaryTree(BinaryTree left, BinaryTree right, String content, double freq) {
		this.root = new Node(left.getRoot(), right.getRoot(), content, freq);
	}

	/**
	 * ausgabe des linken Knoten
	 * 
	 * @return
	 */
	public BinaryTree getLeft() {
		BinaryTree tmp = new BinaryTree();
		tmp.root = this.root.getLeft();
		return tmp;
	}

	public BinaryTree getRight() {
		BinaryTree temp = new BinaryTree();
		temp.root = this.root.getRight();
		return temp;
	}

	/**
	 * verkn�fung zu node
	 * 
	 * @return
	 */
	public Node getRoot() {
		return this.root;
	}

	public boolean isEmpty() {
		return this.root == null;
	}

}
