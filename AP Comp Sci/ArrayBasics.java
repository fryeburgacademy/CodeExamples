
public class ArrayBasics {
    
    public static void main(String[] args){
        
		// some basic instantiations
		int[] example = new int[4];
		String[] sExample = new String[7];
		boolean[] bExample = new boolean[3];
		Object[] oExample = new Object[2];
		
		
		// create a new array of int values with 5 elements, no assigned values
		int[] simpleArray = new int[5];
		// values must then be filled in manually
		simpleArray[0] = 14;
		simpleArray[1] = 34;
		simpleArray[2] = 756;
		simpleArray[3] = 5;
		simpleArray[4] = 149908;
		
		// create a new array of int values with 6 elements AND assign values
		// use shorthand instantiation
		int[] shorthandArray = { 32, 4545, 422234, 4, 678, 99};
		
		// display them using a method that loops through all values and prints
		printArray(simpleArray);
		printArray(shorthandArray);
    }
	
	/**
	* Print each value in the given array to the console
	*/
	public static void printArray(int[] anyArray){
		for(int i = 0; i < anyArray.length; i++){
			System.out.print(anyArray[i] + "   ");  // print the value and some whitespace
		}
		// print a line break
		System.out.println();
	}
}
