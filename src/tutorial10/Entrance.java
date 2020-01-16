package tutorial10;
/**
 * Entrance class with  maximum size and the counter how much visistors are in the zoo and what's the income of is
 * @author etotz
 *
 */

public class Entrance {

	public int MAX_SIZE;
	private int income;
	private int counter;
	
	/**
	 * constructor
	 * @param MAX_SIZE
	 */
	public Entrance(int MAX_SIZE) {
		this.MAX_SIZE = MAX_SIZE;
	}
	
	/**
	 * visitor in the zoo and the price
	 * @param visitor
	 */
	public void addVisitor(Visitor visitor) {
		this.counter += visitor.numberOfVisitor;
		this.income += visitor.price;
	}
	
	/**
	 * print the number of visitors
	 * @return
	 */
	public int computeVisitor() {
		return counter;
	}
	
	/**
	 * print the total income
	 * @return
	 */
	public int computeIncome() {
		return income;
	}
	

}
