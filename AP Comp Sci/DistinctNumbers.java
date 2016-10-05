import java.util.Scanner;

public class DistinctNumbers {
    
    public static void main(String[] args){
        
        // ask the user for 10 numbers
        Scanner input = new Scanner(System.in);
        
        // setup an array to store distinct numbers
        // there won't be more than 10, no matter what
        int[] distinctNumbers = new int[10];
        
        // setup a counter so we can use it later to NOT print out
        // "empty" indices in the array
        
        int totalDistinctFound = 0;
        
        System.out.println("Enter 10 integers:");
        
        // loop 10 times
        for(int i = 0; i < 10; i++){
       
            // keep a record of whether we find the number
            boolean isFoundInArray = false;
            
            // get the next number
            int enteredNumber = input.nextInt();
            
            // check the distinct numbers list by looping
            for(int j = 0; j < totalDistinctFound; j++){
                // if the entered number is FOUND in the array
                if(enteredNumber == distinctNumbers[j]){
                    // we found it!  
                    isFoundInArray = true;
                }       
            }
            
            // did we find it?
            // if we didn't, add it to our list
            if(!isFoundInArray){
                // we know where to put it... at the index of totalDistinctFound
                distinctNumbers[totalDistinctFound] = enteredNumber;
                // now we have another, so we increment
                totalDistinctFound++;
                
            }
                      
        }
        
        // by here, we've run through all the input numbers, and compared them all and
        // stored a list of distinct numbers.  Now we just need to output them
        System.out.print("Distinct found: ");
        
        for(int i = 0; i < totalDistinctFound; i++){
            System.out.print(distinctNumbers[i] + " ");
        }
    }
    
}
