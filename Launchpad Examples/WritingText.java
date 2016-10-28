/*
 * For educational use only. Copyright 2015 Dave Sartory
 */

import com.davesartory.launchpad.*;


public class WritingText {
    
    public static void main(String[] args){
        
        Launchpad lp = LaunchpadFactory.getLaunchPad();
        
        // our launchpad can handle Sysex messages and knows how to
        // animate text...
        // the virtual device does NOT yet support this feature
        
        lp.writeText("Hello!");
  
        
    }
    

}
