
package example;

public class BoardingStudent extends Student {
    
    private int dormRoom;
    
    public BoardingStudent(String first, String last, int age, int d){
        super(first,last,age);
        dormRoom = d;
    }
    
    public String toString(){
        return super.toString() + " " + dormRoom;
    }
    
}
