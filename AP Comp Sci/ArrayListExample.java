import java.util.List;
import java.util.ArrayList;
/**
* Basic ArrayList example
**/
public class ArrayListExample{
	
	public static void main(String[] args){
		
		List<String> people = new ArrayList<String>();
		
		people.add("Dave");
		people.add("Ken");
		people.add("Bob");
		people.add("Greg");
		
		people.remove("Jill");
		people.add(1,"Curtis");
		people.set(2,"Andy");
		
		for(String s : people){
			System.out.println(s);
		}
			
	}

	
	

}