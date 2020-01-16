package tutorial10;
/**
 * Visitor class with the price of the visitor and how much are in the zoo
 * @author etotz
 *
 */

public class Visitor {

	public double price;
	public int numberOfVisitor;
	
	/**
	 * constructor
	 * new Visitor higher number of Visitors
	 * @param price
	 */
	public Visitor (double price) {
		this.price = price;
		this.numberOfVisitor ++;
	}
	
	/**
	 * constructor
	 * get the price and the number of visitors
	 * @param price
	 * @param numberOfVisitor
	 */
	public Visitor(double price, int numberOfVisitor) {
		this.price = price;
		this.numberOfVisitor = numberOfVisitor;
	}
	
	
	

}
