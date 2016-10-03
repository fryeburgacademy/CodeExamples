import java.util.Scanner;

public class Grader{
	
	// ONLY ONCE
	public static void main(String[] args){		
		// setup our program
		Scanner input = new Scanner(System.in);
		
		// ask user for name and age
		System.out.print("What is your name and age? ");
		
		String name = input.next();
		int age = input.nextInt();
		
		// ask for how many
		System.out.print("How many grades?");
		int numberOfGrades = input.nextInt();
		Person student = new Person(numberOfGrades);
		
		int[] grades = new int[numberOfGrades];
		System.out.print("Enter " + numberOfGrades + " grades:");
		
		for(int i = 0; i < numberOfGrades; i++){
			grades[i] = input.nextInt();
		}
		student.setName(name);
		student.setAge(age);
		student.setGrades(grades);
		student.displayInfo();
		
		
	}


}