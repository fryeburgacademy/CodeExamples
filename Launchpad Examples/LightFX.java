

import com.davesartory.launchpad.*;

public class LightFX {
    
    private static Launchpad lp;
    
    public static void main(String[] args) {

        lp = LaunchpadFactory.getLaunchPad();
        
        lp.getButton(LpButtonTypes.UP).lightOn();
        lp.getButton(LpButtonTypes.UP).addButtonListener(new ButtonListener() {
            @Override
            public void onPush() {
                smoothAnimate(1,0,7,LpColor.BLUE);
                smoothAnimate(4,0,7,LpColor.RED);
            }
        });
        
        lp.getButton(LpButtonTypes.RECORD_ARM).lightOn();
        lp.getButton(LpButtonTypes.RECORD_ARM).addButtonListener(new ButtonListener() {
            @Override
            public void onPush() {
                smoothAnimate(2,0,7,LpColor.ORANGE);
                smoothAnimate(6,0,7,LpColor.YELLOW);
            }
        });
        
        
        
    }
    
    public static void fadeInOut(LpButton b, LpColor c,long millis){
        Thread one = new Thread() {
            public void run() {
                b.lightOn(c, LpBrightness.LOW);
                lp.pause(millis);
                b.lightOn(c, LpBrightness.MEDIUM);
                lp.pause(millis);
                b.lightOn(c, LpBrightness.HIGH);
                lp.pause(millis);
                b.lightOn(c, LpBrightness.MEDIUM);
                lp.pause(millis);
                b.lightOn(c , LpBrightness.LOW);
                lp.pause(millis);
                b.lightOff();
            }  
        };

        one.start();
       
    }
    
    public static void smoothAnimate(int row, int start,int end, LpColor c){
        Thread t = new Thread(){
            public void run(){
                for(int i = start; i <= end;i++){
                 fadeInOut(lp.getButton(row,i),c,50);
                    lp.pause(100);
                }
            }
        };
        t.start();
        
    }
    
}
