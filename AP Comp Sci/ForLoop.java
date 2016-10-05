
public class ForLoop {
	
	public static void main(String[] args){
		
		// basic loop
		for (int i = 1; i <= 10 ; i++){
			System.out.printf("%2d", i);
		}
		
		System.out.println();
		
		// this will run 10 times
		for (int i = 1; i <= 10 ; i++){
			
			// for each i, we print a new line
			System.out.printf("%2d", i);
		    System.out.print(" | ");
			
			// nested loop using i in conditional
			for(int j = 1; j <= i ; j++){			
				System.out.printf("%4d", i * j);
			}
			
			System.out.println();
		}
		
		
		
	}
	
}