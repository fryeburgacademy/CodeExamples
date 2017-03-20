package example;

public class Overloading {
    
    public static void main(String[] args) {    
        
        Student s1 = new Student();
        Student s2 = new Student("Sartory","Dave");
        Student s3 = new Student("Dave","Sartory");
        Student s4 = new BoardingStudent("Bob","Jones",18,2);
        
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
        
        
    }  
}
