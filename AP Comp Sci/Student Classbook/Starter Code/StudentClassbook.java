
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class StudentClassbook {
    
    private Scanner input = new Scanner(System.in);
    private static List<Student> students = new ArrayList<>();
  
    public static void main(String[] args) {
        
        // REQUIREMENT: create 3-5 students manually
        Student s1 = new Student("Dave","Sartory", "2016", "dsartory@fryeburgacademy.org");
        s1.setHomeAddress(new Address("123 Main St.","Fryeburg","ME","04037"));
        s1.setAlternateAddress(new Address("8 Farkle Rd.","Fryeburg","ME","04037"));
        
        // HINT:  this is how you add to a List..
        students.add(s1);
        
        // HINT:  this is how you get an item from a List... similar to an array... students[3]
        Student theThirdStudent = students.get(2);
        
        
        /* REQUIREMENT: Upon running, user should be prompted with a numbered list
           of students, in this format "Number: Lastname, Firstname"
        
            User should be able to choose a number to view a student's details
            or type "0" to add a new user.
        
            If a student is chosen, the program should display the student's details,
            in the following format:
                Dave Sartory
                Class of 2016
                Email: dsartory@fryeburgacademy.org
                Home Address:
                    123 Main St.
                    Fryeburg, ME 04037
                Alternate Address:
                    8 Farkle Rd.
                    Fryeburg, ME 04037
        
            After the student details are listed, the program should return to the
            original list of students.
        
            If "0" is chosen, the user should be asked for each piece of information
            to create a new student, and that new student should be added to the list.
            
        REQUIREMENT: Implement and finish the method "displayStudentDetail(Student s)" for
        displaying the information above.
            
            The user can quit by typing the word "quit" instead of entering a number.
            HINT:  Read all input as strings, use Integer.parseInt() to pull a number out
        */
        
        
        
        
    }
    
    private static void displayStudentDetail(Student s){
       
        // output all the student info...
        
    }
    
}
