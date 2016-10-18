import java.util.Scanner;

public class WhileLoopsWithInput {

	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		int currentValue = 0;
		int previousValue = -1; 
		// offset by 1 to satisfy starting condition
		
		while(currentValue - previousValue == 1){
			
			// ask for input
			currentValue = input.nextInt();
			
			previousValue++;
			
		}
		
		
	}
	
}