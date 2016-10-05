import java.util.List;
import java.util.ArrayList;

public class EnhancedLoopObjects {

	public static void main(String[] args){
		
		List<Person> people = new ArrayList<Person>();
		
		people.add(new Person("Billy", 18));
		people.add(new Person("Fred", 20));
		people.add(new Person("Janet", 18));
		people.add(new Person("Francisco", 109));
		people.add(new Person("Bob", 18));
		
		// Enhanced For loop
		for(Person p : people){	
			System.out.println(p.getName() + " " + p.getAge());
		}
	
	}
	




}