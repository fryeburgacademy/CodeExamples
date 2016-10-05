public class NestedForLoops {

	public static void main(String[] args){
		
		// regular for loop
		for (int i = 0; i < 50; i += 2 ) {
			System.out.println("Counter is " + i);
		}
		
		// nested for loops
		System.out.println("======================\nMultiplication Table");
		for (int i = 1; i <= 10; i++) {
			System.out.print(i + " | ");
			for(int j = 1; j <= 10; j++){	
				System.out.printf("%4d",i * j);		
			}
			System.out.println();
		}
	}
}