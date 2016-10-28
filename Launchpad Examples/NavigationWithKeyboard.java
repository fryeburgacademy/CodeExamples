/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import com.davesartory.launchpad.Launchpad;
import com.davesartory.launchpad.LaunchpadFactory;
import com.davesartory.launchpad.LpColor;
import com.davesartory.launchpad.LpKeyListener;
import java.awt.event.KeyEvent;

/**
 *
 * @author Admin
 */
public class NavigationWithKeyboard{
    
    private Launchpad lp;
    private int row,col;
    
    public static void main(String[] args){
        new NavigationWithKeyboard().init();
    }
    
    private void init(){
        row = 0;
        col = 0;
        
        lp = LaunchpadFactory.getLaunchPad();
        lp.setWindowTitle("Navigation with Keyboard");
        
        LpKeyListener kl = new LpKeyListener() {
            @Override
            public void keyPressed(int keyCode) {
                
                switch(keyCode){
                    case KeyEvent.VK_LEFT:
                        moveLeft();
                        break;
                    case KeyEvent.VK_RIGHT:
                        moveRight();
                        break;
                    case KeyEvent.VK_UP:
                        moveUp();
                        break;
                    case KeyEvent.VK_DOWN:
                        moveDown();
                        break;
                    default:
                        break;
                }
                
            }
        };
        
        lp.addKeyListener(kl);
        
        redraw();
       
        
    }

    private void moveUp() {
        row = row > 0 ? row-1 : row;
        redraw();
    }
    
    private void moveDown() {
        row = row < 7 ? row+1 : row;
        redraw();
    }
    
    private void moveLeft() {
        col = col > 0 ? col-1 : col;
        redraw();
    }
    
    private void moveRight() {
        col = col < 8 ? col+1 : col;
        redraw();
    }
    
    private void redraw(){
        lp.clearGrid();
        lp.getButton(row,col).lightOn(LpColor.ORANGE);
    }
}
