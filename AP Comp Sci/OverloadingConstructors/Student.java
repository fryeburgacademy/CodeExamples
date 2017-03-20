package example;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author dsartory
 */
public class Student {
    
    private String firstName;
    private String lastName;
    private int age;
    private double gpa;
    private List<Integer> testScores;
    
    /**
     * No argument constructor initializes fields with defaults
     */
    public Student(){
        firstName = "";
        lastName = "";
        age = -1;
        gpa = 0.00;
        testScores = new ArrayList<Integer>();
    }
    
    public Student(String first,String last){
        this();
        firstName = first;
        lastName = last;
    }
    

    public Student(String first, String last, int a){
        this(first,last);
        age = a;
    }
    
    
    public String toString(){
        return firstName + " " + lastName + " " + age;
    }
   
    
    
}
