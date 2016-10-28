

import com.davesartory.launchpad.*;

/**
 * Creates a "ground level" then starts a ball bouncing in the grid.
 * AP Topics used: class-level fields/instance variables, conditionals, array
 * index manipulation, shorthand conditionals
 * @author dave
 */
public class BouncingBall {
    
    private Launchpad lp;
    private boolean running = true;
    private int row = 0; 
    private int col = 0;
    private int xDir = 1;
    private int yDir = 1;
    
    public static void main(String[] args){
        new BouncingBall().init();
    }
    
    private void init(){
        lp = LaunchpadFactory.getLaunchPad();
        
        lp.getButton(LpButtonTypes.STOP).lightOn(LpColor.RED);
        lp.getButton(LpButtonTypes.STOP).addButtonListener(new ButtonListener() {
            @Override
            public void onPush() {
                // stop the ball
                running = false;
            }
        });
        
        // we need it to be a rectangular space so the ball will bounce erratically
        drawGround();
        
        while(running){   
            bounce();
        }
        
        drop();
        
        
    }

    private void drawGround() {
        for(int i = 0; i < 8; i++){
            lp.getButton(7, i).lightOn(LpColor.GREEN);
        }
    }
    
    private void bounce() {
        lp.getButton(row, col).lightOn();
        lp.pause(50);
        lp.getButton(row, col).lightOff();
        
        if((row + yDir == -1 ) || (row + yDir == 7)){
            yDir = yDir == 1?-1:1;
        }

        if((col + xDir == -1) || (col + xDir == 8)){
            xDir = xDir == 1?-1:1;
        }

        row += yDir;
        col += xDir;
    }

    private void drop() {
        // drop the ball to the ground
        for(int r = row; r <= 6; r++){
            lp.getButton(r, col).lightOn();
            lp.pause(50);
            if(r != 6){
                lp.getButton(r, col).lightOff();
            }
        }
    }
    
}
