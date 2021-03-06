
import com.davesartory.launchpad.*;

public class LaunchpadDrawing {

    // store the current "pen" color; default to red
    private static LpColor currentColor = LpColor.RED;

    public static void main(String[] args) {
		
		// instantiate a new Launchpad
        Launchpad lp = LaunchpadFactory.getLaunchPad();
        
        // clear the launchpad; sometimes during testing we have leftover lights still on
        lp.clearAll();
        
        // draw the color palette at the top of screen
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
            	// this code runs when you push the button that we're adding this
            	// listener to
                lp.clearGrid();
            }
        });

        // add listeners on every pad to "draw"
        for (LpButton b : lp.getGridButtons()) {
            b.addButtonListener(new ButtonListener() {
                @Override
                public void onPush() {
                	// turn the light on using the current pen color
                    b.lightOn(currentColor);
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
