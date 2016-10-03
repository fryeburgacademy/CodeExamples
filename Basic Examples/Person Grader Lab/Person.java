
public class Person {
	
	// ANY person, has these fields
	private String name;
	private int age;
	private int[] grades;
	
	// no-argument constructor
	public Person(){
		// set defaults, protect against bad data
		name = "";
		age = 0;
		grades = new int[1];
	}
	
	public Person(int numOfGrades){
		// set defaults, protect against bad data
		name = "";
		age = 0;
		grades = new int[numOfGrades];
	}
	
	// print everything
	public void displayInfo(){
		// recall name, age, average, letter grade
		System.out.println(name + ", "
			+ age + " has an average of "
			+ getAverage()
			+ " (" + getLetterGrade() + ")");
	}
	
	// average method
	private int getAverage(){
		int total = 0;
		for(int i = 0; i < grades.length; i++){
			total += grades[i];
		}
		
		return total/grades.length;
	}
	
	private String getLetterGrade(){
		
		int avg = getAverage();
		
		if(avg >= 90){
			return "A";
		} else if (avg >= 80){
			return "B";
		} else if (avg >= 70){
			return "C";
		} else if (avg >= 60){
			return "D";
		} else {
			return "F";
		}
		
	}
	
	
	public void setGrades(int[] g){
		for(int i = 0; i < g.length; i++){
			grades[i] = g[i];
		}
	}
	
	
	// basic setter
	public void setName(String n){
		name = n;
	}
	
	// basic getter
	public String getName(){
		return name;
	}
	
	public void setAge(int a){
		age = a;
	}
	
	public int getAge(){
		return age;
	}

}