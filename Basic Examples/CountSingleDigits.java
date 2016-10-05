
public class CountSingleDigits {
    
    public static void main(String[] args){
        
        // create a 10 int array to store the counts of occurrences of 0-9
        int[] counts = new int[10];
        
        // do a loop 100 times
        
        for(int i = 0; i < 100; i++){
            
            // generate a random number between 0-9
            int randomNum = (int) (Math.random() * 10);
            
            // use that random number to locate the index you're going to increment, and do it
            counts[randomNum]++;
            
        }
        
        // output the counters
        for(int i = 0; i < 10; i++){
            System.out.println(i + " occurred " + counts[i] + " times");
        }
        
        
    }
}
