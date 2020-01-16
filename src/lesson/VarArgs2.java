package lesson;

public class VarArgs2 {
	char [] input;	
	char [] [] inputArray ={ '1', '1','1','0','1'};
		private char [] [] mirror(char[][] input)
		{
			
		char [] [] mirrorArray = new char[input.length][input[0].length];
		
		public static void print2DArray(char[ ][ ] array) {
				for (int i=0; i<array.length; i++) {
					for (int j=0; j<array[i].length; j++){
						System.out.print(array[ i ][ j ] + " ");
						}
						
					}
					System.out.println( );
				}
			
		public static void mirrorArray (char [] [] array){
				for (int i=0; i<array.length;i++){
					for (int j=0; j<array[i].length; j++){
						mirrorArray[ i ][ j ] = array [ ((array.length) - 1) - i ][ j ];
						}
					}
					System.out.println();
				}
			}
}