
import java.util.Scanner;

public class MathQuizExpanded {
	
	public static void main(String[] args){
		
		// declare some constants to clean up our code below
		final String QUESTION = "What type of problem would you like to solve (1 for Addition or 2 for Subtraction)? ";
		final String CORRECT = "CORRECT! Nice job!";
		final String INCORRECT = "Sorry!  You got the answer wrong.  The correct answer is ";
		final String BAD_INPUT = "You must choose either 1 or 2.  Please try again.";
		
		Scanner input = new Scanner(System.in);
		
		int num1 = (int) (Math.random() * 9);
		int num2 = (int) (Math.random() * 9);
		
		int correctAnswer = 0;	// this is a placeholder
		char operator = '+';
		
		// ask which type of problem to solve
		System.out.print(QUESTION);
		
		// get the value from the console
		int userChoice = input.nextInt();
		
		// if the user chose 1 (addition), do this block
		if(userChoice == 1){
			
			correctAnswer = num1 + num2;
			
		} else if (userChoice == 2) {
			
			operator = '-';
			
			// else if they chose 2, do subtraction
			// swap if needed (only in subtraction, per requirements)
			if (num1 < num2){
				int temp = num1;
				num1 = num2;
				num2 = temp;
			}
			
			correctAnswer = num1 - num2;

		} else {
			// else they chose something they shouldn't have... let them know
			System.out.println(BAD_INPUT);
		}
		
		
		// print the question, get the answer
		System.out.print("What is " + num1 + " " + operator + " " + num2 + "? ");
		int answer = input.nextInt();
		
		if(answer == correctAnswer){
			System.out.println(CORRECT);
		} else {
			System.out.println(INCORRECT + correctAnswer);
		}
		
		
		
	}
	
}