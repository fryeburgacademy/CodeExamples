<#if package?? && package != "">
package ${package};

</#if>
import com.davesartory.launchpad.*;

/**
 * Launchpad Program
 * @author ${user}
 */
public class ${name} {
    
    // add your class variables here
    private Launchpad lp;   // create a Launchpad for the class

    private void init(){
        // put your application logic here
        lp = LaunchpadFactory.getLaunchPad();   // instantiate the Launchpad
        


    }


    /**
     * By creating an instance of THIS class (${name}), we are able to use
     * non-static variables and methods.  This model will make your code more
     * similar to how we code in larger applications.  From a practical point
     * of view, your init() method is now your main program.  Do not change the
     * code below unless you are sure of what you're doing.
     * @param args 
     */
    public static void main(String[] args){
        new ${name}().init();
    }


}
