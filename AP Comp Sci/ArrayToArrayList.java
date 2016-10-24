import java.util.List;
import java.util.ArrayList;
/**
* Basic ArrayList example
**/
public class ArrayToArrayList{
	
	public static void main(String[] args){
		
		// given an array of Strings
		String[] originalPeople = {"Janet","Francesca","Julian","Mort","Alvin","Catherine"};
		
		// create the ArrayList to hold the names
		List<String> people = new ArrayList<String>();
		
		// use enhanced/foreach loop to copy that array into an ArrayList of strings
		for(String nameToCopy : originalPeople){
			people.add(nameToCopy);
		}
		
		// output to prove it
		for(String s : people){
			System.out.println(s);
		}
			
	}

}