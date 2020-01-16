package lesson1312;

public class Node {

	private String content;

	private Node left;
	private Node right;

	/**
	 * constructor
	 * 
	 * @param left
	 * @param right
	 * @param content
	 */
	public Node(Node left, Node right, String content) {
		this.content = content;
		this.left = left;
		this.right = right;
	}

	/**
	 * print out content
	 * 
	 * @return
	 */
	public String getCotent() {
		return this.content;
	}

	/**
	 * print out left side
	 * 
	 * @return
	 */
	public Node getLeft() {
		return this.left;
	}

	/**
	 * print out right side
	 * 
	 * @return
	 */
	public Node getRight() {
		return this.right;
	}

}
