package tutorial10;
/**
 * Groups class with the price of the groups and the number 
 * @author etotz
 *
 */

public class Groups extends Visitor {

	private int numberOfVisitor;

	/**
	 * price and number of the group members
	 * @param numberOfVisitor
	 */
	public Groups(int numberOfVisitor) {
		super(50, numberOfVisitor);
	}

}
