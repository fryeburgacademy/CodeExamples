

import com.davesartory.launchpad.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Creates a random board of color each time the bottom right button is pushed.
 * AP Topics covered:  ArrayList, random number generation, for loop, while loop
 * @author dave
 */
public class ColorStorm {

    public static void main(String[] args) {

        Launchpad lp = LaunchpadFactory.getLaunchPad();
        lp.getButton(LpButtonTypes.RECORD_ARM).lightOn(LpColor.WHITE);
        lp.getButton(LpButtonTypes.RECORD_ARM).addButtonListener(new ButtonListener() {
            @Override
            public void onPush() {
                randomize(lp);
            }
        });

    }
    
    private static void randomize(Launchpad lp) {

        lp.clearGrid(); // clear the board

        
        List<LpButton> all = lp.getGridButtons();
        List<Integer> allColors = new ArrayList<>();
        
        // Color values go from 1-127 :  0 is black...
        // We don't want that since it's just OFF
        for (int i = 1; i < 65; i++) {
            allColors.add(i);
        }
        
        while (all.size() > 0) {
            int randColor = (int) (Math.random() * allColors.size());
            int randButton = (int) (Math.random() * all.size());
            
            all.remove(randButton).lightOn(allColors.remove(randColor));
            lp.pause(20);
        }

    }
}
