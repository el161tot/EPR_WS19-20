package tutorial7;

/**
 * united the elements; add elements when they are not in the element; remove
 * elements when they are duplicates; print out the sets; sorted the elements;
 * give out the size of the element; setter and getter;
 * 
 * @author etotz
 *
 */

public class MySet {
	private double[] element;

	// private double delta;

	/**
	 * constructor
	 * 
	 * @param pElement
	 */
	public MySet(double... pElement) {
		this.element = new double[0];
		for (double i : pElement) {
			addElement(Math.round((i * 10.0) / 10.0));
		}
	}

	/**
	 * empty constructor
	 */
	public MySet() {
		this.element = new double[0];
	}

	/**
	 * united these elements
	 * 
	 * @param pSet
	 */
	public void printUnion(MySet pSet) {
		double temp2[] = element;
		double temp[] = pSet.getElement();
		for (int i = 0; i < temp.length; i++) {
			addElement(temp[i]);
		}
		printSet();
		element = temp2;
	}

	/**
	 * add an element when it's not in the array and sort it
	 * 
	 * @param pElement
	 */
	public void addElement(double pElement) {
		double temp[];

		if (!this.isEmpty()) {
			for (int i = 0; i < (element.length); i++) {
				if (element[i] == pElement) {
					return;
				} // same number
			}
			if (this.isEmpty()) {
				temp = new double[1];
				temp[0] = pElement;
			} else {
				temp = new double[element.length + 1];

				for (int i = 0; i < element.length; i++) {
					temp[i] = element[i];
				}
				temp[temp.length - 1] = pElement;
			}
			element = new double[temp.length];
			element = selectionsort(temp);
			element = selectionsort(element);
		}
	}

	/**
	 * sorted the first half of the array
	 * 
	 * @param array
	 * @return
	 */

	private double[] selectionsort(double[] pElement) {
		for (int i = 1; i < pElement.length - 1; i++) {
			for (int j = i + 1; j < pElement.length; j++) {
				if (pElement[i] > pElement[j]) {
					double tmp = pElement[i];
					pElement[i] = pElement[j];
					pElement[j] = tmp;
				}
			}
		}
		return pElement;
	}

	/**
	 * remove elements if they are in the array
	 * 
	 * @param pElement
	 */
	public void removeElement(double pElement) {
		boolean isInElement = false;
		for (int i = 0; i < element.length; i++) {
			if (element[i] == pElement) {
				element[i] = element[element.length - 1];
				isInElement = true;
			}
		}
		if (!isInElement) {
			System.out.println("number " + pElement + " is not in the set");
			return;
		}
		double temp[] = element;
		element = null;
		element = new double[temp.length - 1];
		for (int i = 0; i < element.length; i++) {
			element[i] = temp[i];
		}
		element = selectionsort(element);
	}

	/**
	 * print out the sets
	 */
	public void printSet() {
		System.out.print("{ ");
		for (int i = 0; i < element.length - 1; i++) {
			System.out.print(element[i] + ",");
		}
		System.out.print(element[element.length - 1]);
		System.out.print(" }");
	}

	/**
	 * give out the size of the element
	 * 
	 * @return
	 */
	public int getSetSize() {
		return element.length;

	}

	/**
	 * show if the element is empty or not
	 * 
	 * @return
	 */
	public boolean isEmpty() {
		if (element == null) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * setter
	 * 
	 * @param element
	 */
	public void setElement(double[] element) {
		this.element = element;
	}

	/**
	 * getter
	 * 
	 * @return
	 */
	public double[] getElement() {
		return this.element;

	}

}
