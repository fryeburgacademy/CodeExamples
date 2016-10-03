
public class HelloCommandLine {

    public static void main(String[] args){
        
        if(args != null && args.length > 0 && args[0] != null){
            System.out.println("Hello there, " + args[0]);
        }
        
    }
    
}
