import com.davesartory.launchpad.ButtonListener;
import com.davesartory.launchpad.Launchpad;
import com.davesartory.launchpad.LaunchpadFactory;
import com.davesartory.launchpad.LpBrightness;
import com.davesartory.launchpad.LpButtonGroup;
import com.davesartory.launchpad.LpColor;
import com.davesartory.launchpad.LpStyle;

/**
 * Example application to show basic shapes
 * @author dsartory
 */
public class ShapesExample {
    public static void main(String[] args){
        
        Launchpad lp = LaunchpadFactory.getLaunchPad();
        lp.clearAll();
    	
    	lp.drawRectangle(1,1,4,4,LpColor.BLUE);
    	lp.drawRectangle(5,5,7,7,LpColor.WHITE);
    	lp.drawVerticalLine(5,0,7,LpColor.GREEN);
        lp.drawHorizontalLine(2,3,7,LpColor.RED);
        
    }
}
