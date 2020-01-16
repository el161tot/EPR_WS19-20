package tutorial8;

/**
 * give out a point
 * 
 * @author etotz
 *
 */

public class Point {

	public double x;
	public double y;

	/**
	 * constructor
	 * 
	 * @param x
	 * @param y
	 */
	public Point(double x, double y) {
		this.x = x;
		this.y = y;
	}

	/**
	 * toString - method
	 * 
	 * @param x
	 * @param y
	 * @return
	 */
	public String toString() {
		return "(" + this.x + "," + this.y + ")";
	}

	/**
	 * setter & getter
	 * 
	 * @return
	 */
	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

}
