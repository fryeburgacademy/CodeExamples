

import com.davesartory.launchpad.*;

public class LightFX {
    
    private static Launchpad lp;
    
    public static void main(String[] args) {

        lp = LaunchpadFactory.getLaunchPad();
        lp.setWindowTitle("Light Race");
        
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
    
    public static void smoothAnimate(int row, int start,int end, LpColor c){
        Thread t = new Thread(){
            public void run(){
                for(int i = start; i <= end;i++){
                    lp.getButton(row,i).fadeOut(c, 150);
                    lp.pause(100);
                }
            }
        };
        t.start();
        
    }
    
}
