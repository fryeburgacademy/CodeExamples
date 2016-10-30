import com.davesartory.launchpad.*;

/**
 *
 * @author Erik Porter '17
 */
public class Diagonals {
    static boolean result = true;
    static double color = 1;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Launchpad lp = LaunchpadFactory.getLaunchPad();
    lp.getButton(LpButtonTypes.RECORD_ARM).lightOn(LpColor.MAGENTA);
   
    lp.getButton(LpButtonTypes.VOLUME).lightOn(LpColor.BLUE);
    
       
    lp.getButton(LpButtonTypes.VOLUME).addButtonListener(new ButtonListener() {
        @Override
        public void onPush() {
            swap();
        }
    });
    
         
    lp.getButton(LpButtonTypes.RECORD_ARM).addButtonListener(new ButtonListener() {
        @Override
        public void onPush() {
            color();
        }
    });
    
    
    
   
    while (result){
    for (int i = 0; i<8; i++){
        int  x = i;  
        int y = 0;
        while (x>=0){
                lp.getButton(x,y).lightOn((int)(color));
                x--;
                y++;
 
        }
        lp.clearGrid();
    }
      for (int i = 1; i<8; i++){
        int  x = i;  
        int y = 7;
        while (x<8){
                lp.getButton(x,y).lightOn((int)(color));
                x++;
                y--;
 
        }
        lp.clearGrid();
    }
      
        for (int i = 7; i>=0; i--){
        int  x = i;  
        int y = 7;
        while (x<8){
                lp.getButton(x,y).lightOn((int)(color));
                x++;
                y--;
 
        }
        lp.clearGrid();
    }
          for (int i = 6; i>=0; i--){
        int  x = i;  
        int y = 0;
        while (x>=0){
                lp.getButton(x,y).lightOn((int)(color));
                x--;
                y++;
 
        }
        lp.clearGrid();
    }
       for (int i = 0; i<8; i++){
        int  x = i;  
        int y = 7;
        while (x>=0){
                lp.getButton(x,y).lightOn((int)(color));
                x--;
                y--;
 
        }
        lp.clearGrid();
    }
      for (int i = 2; i<8; i++){
        int  x = i;  
        int y = 0;
        while (x<8){
                lp.getButton(x,y).lightOn((int)(color));
                x++;
                y++;
 
        }
        lp.clearGrid();
    }
      
        for (int i = 7; i>=0; i--){
        int  x = i;  
        int y = 0;
        while (x<8){
                lp.getButton(x,y).lightOn((int)(color));
                x++;
                y++;
 
        }
        lp.clearGrid();
    }
          for (int i = 6; i>=0; i--){
        int  x = i;  
        int y = 7;
        while (x>=0){
                lp.getButton(x,y).lightOn((int)(color));
                x--;
                y--;
 
        }
        lp.clearGrid();
    }
    }
    
    }
    public static void swap(){
        result = !result;
    }
    public static void color(){
        color = Math.random()*20+1;
    }
   
    
}
