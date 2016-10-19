
/**
 * This program utilizes the RandomPeople class, which is able to generate a
 * list of randomized people, with no repeats, by calling its getRandomName()
 * method repeatedly.  RandomPerson should return the word "None" if all the
 * people in the list have been pulled already.  It should return the name of
 * the random person otherwise.
 * YOU SHOULD NOT CHANGE ANY OF THIS CODE.  ALL WORK SHOULD BE DONE IN
 * RandomPeople.java  so that this program runs with the expected results
 * Expected example output:
 *      Freddy
 *      Abby
 *      Daniel
 *      Carol
 *      Gary
 *      Bruno
 *      Edward
 *      None
 *      None
 *      None
 */
public class RandomPeopleRunner {
    
    public static void main(String[] args){
        
        // DO NOT CHANGE THIS METHOD CODE!
        // ALL YOUR WORK SHOULD BE IN THE OTHER METHODS
        
        // create a short array of names
        String[] names = {"Abby","Bruno","Carol","Daniel","Edward","Freddy","Gary"};
        
        RandomPeople people = new RandomPeople(names);
        
        // run 10 times: (yes, this is more than our array has)
        // The method should return a random name from the list, with no repeating
        // names, and once there are no names left, it should return "None" instead
        for(int i = 0; i < 10; i++){
            System.out.println(people.getRandomName());
        }
        
    }
}
