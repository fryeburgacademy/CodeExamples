import java.util.Scanner;

public class Fibonacci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("How many Fibonacci numbers? ");
        int fibs = input.nextInt();
        
        long term1 = 0;
        long term2 = 1;
        long thisFib = 0;
        
        // just a counter... run it fibs times
        for(int i = 0 ; i < fibs; i++){
            
            // base condition
            if(i > 0){
                thisFib = term1 + term2;
            }
            
            System.out.printf("%8d", thisFib);
            term1 = term2;
            term2 = thisFib;
            
        }
       
    }
    
}
