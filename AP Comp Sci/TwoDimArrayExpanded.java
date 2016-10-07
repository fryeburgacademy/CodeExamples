public class TwoDimArrayExpanded {

	public static void main(String[] args){
		
		// we can improve on the readability and ease by making a couple of helper methods
		// When our main method is simple, following the program is much easier
		
		// create it
		int[][] grades = new int[3][4];
		
		// fill it
		randomFillArray(grades);
		
		// print it
		print2dArray(grades);
		
	}
	
	/**
	* Fills array with random numbers
	*/
	public static void randomFillArray(int[][] twoD){
	
		for(int row = 0; row < twoD.length; row++){
			for(int col = 0; col < twoD[row].length; col++){
				twoD[row][col] = (int)(Math.random() * 100) + 1;	
			}
		}
	}
	
	
	/**
	* Prints the contents of a given 2d int array
	*/
	public static void print2dArray(int[][] twoD){
	
		for(int row = 0; row < twoD.length; row++){
			for(int col = 0; col < twoD[row].length; col++){
				System.out.printf("%5d",twoD[row][col]);
			}
			System.out.println();
		}
	}

}