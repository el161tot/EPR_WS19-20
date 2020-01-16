package lesson1912;

public class Node {

	private String content;

	private Node left;
	private Node right;
	private double freq;

	/**
	 * constructor
	 * 
	 * @param left
	 * @param right
	 * @param content
	 */
	public Node(Node left, Node right, String content, double freq) {
		this.content = content;
		this.left = left;
		this.right = right;
		this.freq = freq;
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

	public double getFreq() {
		return freq;
	}

	public void setFreq(double freq) {
		this.freq = freq;
	}

}
