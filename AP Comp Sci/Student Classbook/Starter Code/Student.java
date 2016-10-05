
/**
 *
 * @author dave
 */
public class Student {
    
    /*
    REQUIREMENT: Create the proper constructors to allow the example code
    in StudentClassbook.java to work.  Make any other constructors you'd 
    like as well.  Create any needed getters and setters.  ALL INSTANCE
    VARIABLES MUST BE PRIVATE!
    */
    
    private String firstName;
    private Address homeAddress;
    
    // no argument constructor
    public Student(){
        
    }
    
    public void setFirstName(String fn){
        firstName = fn;
    }
    
    public String getFirstName(){
        return firstName;
    }
    
    public void setHomeAddress(Address a){
        homeAddress = a;
    }
    
    public Address getHomeAddress(){
        return homeAddress;
    }
    
    
    
    
    
}
