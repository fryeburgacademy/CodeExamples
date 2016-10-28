

import com.davesartory.launchpad.ButtonListener;
import com.davesartory.launchpad.Launchpad;
import com.davesartory.launchpad.LaunchpadFactory;
import com.davesartory.launchpad.LpBrightness;
import com.davesartory.launchpad.LpButtonGroup;
import com.davesartory.launchpad.LpColor;
import com.davesartory.launchpad.LpStyle;

/**
 * Example application to show basic grouping and ungrouping
 * and implementation of ButtonListeners on a group
 * @author dsartory
 */
public class GroupingButtons {
    public static void main(String[] args){
        
        Launchpad lp = LaunchpadFactory.getLaunchPad();
        lp.clearAll();
        
        // some colors to choose from
        LpColor[] colors = {
            LpColor.AQUAMARINE,
            LpColor.BLUE,
            LpColor.GREEN,
            LpColor.LIGHTBLUE,
            LpColor.MAGENTA,
            LpColor.ORANGE,
            LpColor.PINK,
            LpColor.RED,
            LpColor.PURPLE,
            LpColor.YELLOW,
            LpColor.WHITE
            };
        
        // create a group
        LpButtonGroup diamond = new LpButtonGroup();
        
        // put the buttons that make up our diamond into the group
        diamond.addButton(lp.getButton(0,3));
        diamond.addButton(lp.getButton(1,2));
        diamond.addButton(lp.getButton(1,3));
        diamond.addButton(lp.getButton(1,4));
        diamond.addButton(lp.getButton(2,1));
        diamond.addButton(lp.getButton(2,2));
        diamond.addButton(lp.getButton(2,3));
        diamond.addButton(lp.getButton(2,4));
        diamond.addButton(lp.getButton(2,5));
        diamond.addButton(lp.getButton(3,2));
        diamond.addButton(lp.getButton(3,3));
        diamond.addButton(lp.getButton(3,4));
        diamond.addButton(lp.getButton(4,3));
        
        // remove the middle
        diamond.removeButton(lp.getButton(2,3));
        
        // use the group just like any other button
        diamond.lightOn(LpColor.ORANGE);
        
        diamond.addButtonListener(new ButtonListener() {
            @Override
            public void onPush() {
                diamond.lightOn(colors[(int)(Math.random()*colors.length)]);
            }
        });
        
        // add a listener to ONE button -- this will REPLACE the one added by
        // the group
        lp.getButton(0,3).addButtonListener(new ButtonListener() {
            @Override
            public void onPush() {
               diamond.lightOn(LpColor.RED, LpBrightness.HIGH, LpStyle.PULSING);
            }
        });
    }
}
