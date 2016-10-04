import java.util.Scanner;

public class ScannerBasics {
    
    public static void main(String[] args){
        
		Scanner input = new Scanner(System.in);

		System.out.println("What's your name?");
		String userName = input.next();

		System.out.println("What's your age?");
		int userAge = input.nextInt();

		System.out.println("Hello, " + userName 
				+ ". Next year you will be " + (userAge + 1) + ".");

        
    }
}