
public class SimpleArray {

	public static void main(String[] args){
		
		int[] grades = new int[6];

		grades[0] = 90;
		grades[1] = 80;
		grades[2] = 70;
		grades[3] = 99;
		grades[4] = 77;
		grades[5] = 100;
		
		// enhanced for loop
		for(int x : grades){	
			System.out.println(x);
		}
		
	}

}