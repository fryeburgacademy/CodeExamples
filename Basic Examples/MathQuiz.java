import java.util.Scanner;

public class MathQuiz {
    
    public static void main(String[] args){
        
		// setup our scanner to read user input
		Scanner input = new Scanner(System.in);
		
		// generate two random numbers between 1 and 10 inclusive
		int x = (int)(Math.random() * 10) + 1;
		int y = (int)(Math.random() * 10) + 1;
		
		// save the correct answer
		int correct = x + y;
		
		// ask the question
		System.out.println("What is " + x + "+" + y + " ?");
		
		// get user input
		int guess = input.nextInt();
	
		// if correct, say so, else print correction
		if(guess == correct){
			System.out.println("Correct!");
		} else {
			System.out.println("Sorry, the correct answer was " + correct);
		}
        
    }
}