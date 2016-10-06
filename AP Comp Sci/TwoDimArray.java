public class TwoDimArray {

	public static void main(String[] args){
		
		int[][] grades = new int[3][4];
		
		// loop thru rows
		for(int row = 0; row < grades.length; row++){
			
			for(int col = 0; col < grades[row].length; col++){
				
				grades[row][col] = (int)(Math.random() * 100) + 1;
				
				// this is EVERY cell
				System.out.printf("%15d",grades[row][col]);
				
			}
			// this is in the ROW loop, not the COL loop
			System.out.println();
		}
		
	}

}