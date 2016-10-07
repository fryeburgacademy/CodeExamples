public class TwoDimArray {

	public static void main(String[] args){
		
		// set up a simple 2D array
		// For this practice, we make it NOT square to help us identify any index issues
		
		int[][] grades = new int[3][4];
		
		// loop thru rows, on the OUTSIDE loop
		for(int row = 0; row < grades.length; row++){
			
			// loop thru cols on the INSIDE loop
			for(int col = 0; col < grades[row].length; col++){
				
				// this block represents EACH CELL of our grid
				// code in here happens once for each location in our 2D array
				
				// assign a random grade to the location
				grades[row][col] = (int)(Math.random() * 100) + 1;
				
				// print out that grade, using a formatter
				// that makes each number take 5 spaces (to keep visual alignment)
				System.out.printf("%5d",grades[row][col]);
				
			}
			// this is in the ROW loop, not the COL loop, so it runs
			// once after EACH row is complete.  This allows our output to 
			// "look like" a grid even if number lengths are varied
			System.out.println();
		}
		
	}

}