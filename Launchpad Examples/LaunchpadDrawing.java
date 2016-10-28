

import com.davesartory.launchpad.ButtonListener;
import com.davesartory.launchpad.Launchpad;
import com.davesartory.launchpad.LaunchpadFactory;
import com.davesartory.launchpad.LpButton;
import com.davesartory.launchpad.LpButtonTypes;
import com.davesartory.launchpad.LpColor;

public class LaunchpadDrawing {

    // store the current "pen" color
    private static LpColor currentColor = LpColor.RED;

    public static void main(String[] args) {

        Launchpad lp = LaunchpadFactory.getLaunchPad();
        lp.clearAll(); //sometimes during testing we have leftover lights still on
        
        drawPalette(lp);

        // add palette listeners to top row buttons
        for (final LpButton b : lp.getTopButtons()) {
            // each button will now reset the "pen" to the button's color
            b.addButtonListener(new ButtonListener() {
                @Override
                public void onPush() {
                    currentColor = b.getColor();
                    b.lightOn(currentColor);
                }
            });

        }

        // add a reset button
        lp.getButton(LpButtonTypes.VOLUME).addButtonListener(new ButtonListener() {
            @Override
            public void onPush() {
                lp.clearGrid();
            }
        });

        // add listeners on every pad to "draw"
        for (LpButton b : lp.getGridButtons()) {
            b.addButtonListener(new ButtonListener() {
                @Override
                public void onPush() {
                    b.lightOn(currentColor);
                    System.out.println(b.getRow() + " : " + b.getCol());
                }
            });
        }

    }

    /**
     * set rainbow colors to the top control buttons
     *
     */
    private static void drawPalette(Launchpad lp) {

        lp.getButton(LpButtonTypes.UP).lightOn(LpColor.RED);
        lp.getButton(LpButtonTypes.DOWN).lightOn(LpColor.ORANGE);
        lp.getButton(LpButtonTypes.LEFT).lightOn(LpColor.YELLOW);
        lp.getButton(LpButtonTypes.RIGHT).lightOn(LpColor.GREEN);
        lp.getButton(LpButtonTypes.SESSION).lightOn(LpColor.BLUE);
        lp.getButton(LpButtonTypes.USER_1).lightOn(LpColor.PURPLE);
        lp.getButton(LpButtonTypes.USER_2).lightOn(LpColor.MAGENTA);
        lp.getButton(LpButtonTypes.MIXER).lightOn(LpColor.AQUAMARINE);
        lp.getButton(LpButtonTypes.VOLUME).lightOn(LpColor.WHITE);
    }

}
