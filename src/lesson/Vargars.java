package lesson;

public class Vargars {
	public VarArgs()
	{
		System.out.println("--Var Args--");
		
		int[]array = new int[5];
		//simpleArray(array);
			//simpleArray(1,2,3);
		System.out.println("-----");
		simpleVarArg(array);
		//simpleVarArg(1,2,3,4);
		simpleVarArg(5,6);
		System.out.println("-----");
			//simpleVarArg("A","B","C");
			//simpleVarArg("D");
	}

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("--Var Args--");

		int[] array = new int[5];
	}

	public void simpleArray(int[] values) {
		for (int i = 0; i < values.length; i++) {
			System.out.println("Index:" + i + "Content:" + values[i]);
		}
	}

	/**
	 * exlain var args
	 * 
	 * @param values
	 */
	private void simpleVarArg(int... values) {
		for (int i = 0; i < values.length; i++) {
			System.out.println("Index:" + i + "Content:" + values[i]);

		}
	}

	/**
	 * @param values
	 */

}
