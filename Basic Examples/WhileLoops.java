
public class WhileLoops {

	public static void main(String[] args){
		
		int counter = 0;
		boolean keepRunning = true;
		
		while (keepRunning){
			
			System.out.println("The count is " + counter);
			
			if( counter == 1000){
				keepRunning = false;
			}		
			counter += 5;
		}
		
		System.out.println("Done");
	}
	
}