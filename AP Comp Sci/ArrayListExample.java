import java.util.List;
import java.util.ArrayList;
/**
* Basic ArrayList example
**/
public class ArrayListExample{
	
	public static void main(String[] args){
		
		// List is an interface, a set of rules for how different kinds of Lists should all behave.
		// ArrayList is an implementation -- MORE specific than an interface, so we create an ArrayList
		// and store it in a List
		List<String> people = new ArrayList<String>();
		
		people.add("Dave");
		people.add("Ken");
		people.add("Bob");
		people.add("Greg");
		
		people.remove("Jill");
		people.add(1,"Curtis");
		people.set(2,"Andy");
		
		// print each String using an enhanced for loop
		for(String s : people){
			System.out.println(s);
		}
		
		// print each String using a regular for loop and index
		for(int i = 0 ; i < people.size(); i++){
			System.out.println(people.get(i));
		}
			
	}

	
	

}
