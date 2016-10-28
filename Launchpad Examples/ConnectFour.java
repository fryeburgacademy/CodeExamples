 /*
 * For educational use only. Copyright 2015 Dave Sartory
 */

import com.davesartory.launchpad.*;

/**
 *
 * @author dave
 */
public class ConnectFour{
    
    private Player[][] gameBoard;
    private Player p1;
    private Player p2;
    private Player currentPlayer;
    private Launchpad launchpad;
    private LpButton[] winningSequence; // this is going to hold the 4 winning buttons
    
    public static void main(String[] args) {
        ConnectFour game = new ConnectFour();
        game.init();
    }
    
    private void init(){
        

        winningSequence = new LpButton[4];
        
        gameBoard = new Player[8][8];
        
        launchpad = LaunchpadFactory.getLaunchPad();
        
        launchpad.clearAll();
        

        p1 = new Player("Player 1");
        p2 = new Player("Player 2");
        p1.setColor(LpColor.ORANGE);
        p2.setColor(LpColor.GREEN);
        
       
        startGame();
    }
    
    
    
    public void winSequence() {
        LpColor wincolor = currentPlayer.getColor();
       
        launchpad.clearAll(); 
        // animation pattern
        int[][] winLights = {
                            {0,0},{0,1},{0,2},{0,3},{0,4},{0,5},{0,6},{0,7},
                            {1,7},{2,7},{3,7},{4,7},{5,7},{6,7},{7,7},
                            {7,6},{7,5},{7,4},{7,3},{7,2},{7,1},{7,0},
                            {6,0},{5,0},{4,0},{3,0},{2,0},{1,0},
                            {1,1},{1,2},{1,3},{1,4},{1,5},{1,6},
                            {2,6},{3,6},{4,6},{5,6},{6,6},
                            {6,5},{6,4},{6,3},{6,2},{6,1},
                            {5,1},{4,1},{3,1},{2,1},
                            {2,2},{2,3},{2,4},{2,5},
                            {3,5},{4,5},{5,5},
                            {5,4},{5,3},{5,2},
                            {4,2},{3,2},
                            {3,3},{3,4},
                            {4,4},{4,3}};

        
        int count = 30;
        for(int[] i : winLights){
            launchpad.getButton(i[0], i[1]).lightOn(wincolor);
            pause(20);
//            Launchpad.getSynth().playNote(count++, 20);
        }
        launchpad.clearAll();
        printBoard();
        printWinning(); // sets the winning group to pulse
        newGame();
   
    }
    
    
    public void nextTurn(){
        printBoard();
        if(checkForWin()){
            winSequence();
        } else {
            changePlayer();
        }
        
    }
    
    public void newGame(){
        gameBoard = new Player[8][8];
 
        launchpad.getButton(LpButtonTypes.UP).lightOn(LpColor.PURPLE);
        
        // clear all button listeners
        launchpad.clearButtonListeners();
        
        launchpad.getButton(LpButtonTypes.UP).addButtonListener(new ButtonListener() {
            @Override
            public void onPush() {
                startGame();
            }
        });
    }
    
    public void printBoard(){
        
        for(int rows = 0; rows < gameBoard.length; rows++){
            for(int cols = 0; cols < gameBoard[rows].length; cols++){
                if(gameBoard[rows][cols] != null){     
                    // translate the game board 2D array to the launchpad
                    launchpad.getButton(rows, cols).lightOn(gameBoard[rows][cols].getColor());
                }
            }
        }
        
        
    }

    private boolean checkForWin() {
        
        // scan the board for 4 in a row horizontally
        for(int row = 0; row < gameBoard.length; row++){
            for(int col = 0; col < gameBoard[row].length-3; col++){
                if(gameBoard[row][col] == currentPlayer &&
                   gameBoard[row][col+1] == currentPlayer &&
                   gameBoard[row][col+2] == currentPlayer &&
                   gameBoard[row][col+3] == currentPlayer){
                   
                   winningSequence[0] = launchpad.getButton(row,col);
                   winningSequence[1] = launchpad.getButton(row,col+1);
                   winningSequence[2] = launchpad.getButton(row,col+2);
                   winningSequence[3] = launchpad.getButton(row,col+3);
                   return true;
                              
                } 
            }
        }
        
        // scan the board for 4 in a row vertically
        for(int col = 0; col < gameBoard[0].length; col++){
            for(int row = 0; row < gameBoard.length-3; row++){
                
                if(gameBoard[row][col] == currentPlayer &&
                   gameBoard[row+1][col] == currentPlayer &&
                   gameBoard[row+2][col] == currentPlayer &&
                   gameBoard[row+3][col] == currentPlayer){
                   winningSequence[0] = launchpad.getButton(row,col);
                   winningSequence[1] = launchpad.getButton(row+1,col);
                   winningSequence[2] = launchpad.getButton(row+2,col);
                   winningSequence[3] = launchpad.getButton(row+3,col);
                   
                   return true;              
                } 
            }
        }
        
        // scan the board for 4 in a row diagonally top to bottom
        for(int row = 0; row < gameBoard.length-3; row++){
            for(int col = 0; col < gameBoard[row].length-3; col++){
                
                if(gameBoard[row][col] == currentPlayer &&
                   gameBoard[row+1][col+1] == currentPlayer &&
                   gameBoard[row+2][col+2] == currentPlayer &&
                   gameBoard[row+3][col+3] == currentPlayer){
                   winningSequence[0] = launchpad.getButton(row,col);
                   winningSequence[1] = launchpad.getButton(row+1,col+1);
                   winningSequence[2] = launchpad.getButton(row+2,col+2);
                   winningSequence[3] = launchpad.getButton(row+3,col+3);
                   
                   return true;              
                } 
            }
        }
        
        // scan the board for 4 in a row diagonally bottom to top
        for(int row = 3; row < gameBoard.length; row++){
            for(int col = 0; col < gameBoard[row].length-3; col++){
                
                if(gameBoard[row][col] == currentPlayer &&
                   gameBoard[row-1][col+1] == currentPlayer &&
                   gameBoard[row-2][col+2] == currentPlayer &&
                   gameBoard[row-3][col+3] == currentPlayer){
                   winningSequence[0] = launchpad.getButton(row,col);
                   winningSequence[1] = launchpad.getButton(row-1,col+1);
                   winningSequence[2] = launchpad.getButton(row-2,col+2);
                   winningSequence[3] = launchpad.getButton(row-3,col+3);
                   return true;             
                } 
            }
        }
        
       
        return false;
        
    }

    private void dropPiece(Player currentPlayer, int column){
        
        int note = 70;
        // start at the top to aid the animation
        for(int i = 0; i <= gameBoard.length-1; i++){
                
                
                // if we hit the end with no player found
                if(gameBoard[i][column] != null){
                    gameBoard[i-1][column] = currentPlayer;
                    break;
                } else if(i == gameBoard.length-1) {
                    gameBoard[i][column] = currentPlayer;
                    break;
                } 
                
                launchpad.getButton(i, column).lightOn(currentPlayer.getColor());
                pause(50);
//                Launchpad.getSynth().playNote(--note, 40);
                launchpad.getButton(i, column).lightOff();

        }

        nextTurn();
        
    }

    private void changePlayer() {
        currentPlayer = (currentPlayer == p1 ? p2 : p1);
        lightButtonBar(currentPlayer.getColor());
    }

    private void startGame() {
        launchpad.clearAll();
        currentPlayer = p2;
        lightButtonBar(currentPlayer.getColor());
        
        launchpad.getButton(LpButtonTypes.UP).addButtonListener(new ButtonListener() {
            @Override
            public void onPush() {
                dropPiece(currentPlayer, 0);
            }
        });
        
        launchpad.getButton(LpButtonTypes.DOWN).addButtonListener(new ButtonListener() {
            @Override
            public void onPush() {
                dropPiece(currentPlayer, 1);
            }
        });
        
        launchpad.getButton(LpButtonTypes.LEFT).addButtonListener( new ButtonListener() {
            @Override
            public void onPush() {
                dropPiece(currentPlayer, 2);
            }
        });
        
        launchpad.getButton(LpButtonTypes.RIGHT).addButtonListener(new ButtonListener() {
            @Override
            public void onPush() {
                dropPiece(currentPlayer, 3);
            }
        });
        
        launchpad.getButton(LpButtonTypes.SESSION).addButtonListener(new ButtonListener() {
            @Override
            public void onPush() {
                dropPiece(currentPlayer, 4);
            }
        });
        
        launchpad.getButton(LpButtonTypes.USER_1).addButtonListener(new ButtonListener() {
            @Override
            public void onPush() {
                dropPiece(currentPlayer, 5);
            }
        });
        
        launchpad.getButton(LpButtonTypes.USER_2).addButtonListener(new ButtonListener() {
            @Override
            public void onPush() {
                dropPiece(currentPlayer, 6);
            }
        });
        
        launchpad.getButton(LpButtonTypes.MIXER).addButtonListener(new ButtonListener() {
            @Override
            public void onPush() {
                dropPiece(currentPlayer, 7);
            }
        });
        nextTurn();
    }
    
    /**
     * Lights the winning 4 pads with some kind of change (pulsing/flashing)
     */
    private void printWinning() {
        for(LpButton p : winningSequence){
            p.lightOn(currentPlayer.getColor(),LpBrightness.HIGH, LpStyle.PULSING);
        }
    }
    
    
    
    public boolean validChoice(int choice){
        return (choice > 0 && choice <= gameBoard[0].length);
    }

    private void lightButtonBar(LpColor color) {
        for(LpButton b : launchpad.getTopButtons()){
            b.lightOn(color);
        }
    }

    private void pause(long i) {
        try {
            Thread.sleep(i);
        } catch (InterruptedException ex) {
            System.err.println(ex);
        }
    }
    
    public class Player{
        private String name;
        private LpColor color;
        
        public Player(String n){
            name = n;
        }

        public LpColor getColor() {
            return color;
        }

        public void setColor(LpColor color) {
            this.color = color;
        }
        
        public String getName(){
            return name;
        }
        
    }
}
