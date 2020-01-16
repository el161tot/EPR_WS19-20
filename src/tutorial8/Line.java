package tutorial8;

/**
 * give out a length of line represent the two points
 * 
 * @author etotz
 *
 */

public class Line {

	private Point q;
	private Point p;

	/**
	 * constructor
	 * 
	 * @param x
	 * @param y
	 */
	public Line(Point p, Point q) {
		this.q = q;
		this.p = p;
	}

	/**
	 * get length of two points
	 * 
	 * @param x
	 * @param y
	 * @return
	 */
	public double getLenght(double p, double q) {
		return Math.sqrt(Math.pow(((this.q).getX()) - ((this.p).getX()), 2)
				+ Math.pow(((this.q).getY()) - ((this.p).getY()), 2));
	}

	/**
	 * represent the two points
	 */
	public String toString() {
		return this.q + "_" + this.p;
	}

}
