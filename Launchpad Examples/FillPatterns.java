

import com.davesartory.launchpad.*;

public class FillPatterns {
    
    private static Launchpad lp;
    
    public static void main(String[] args) {

        lp = LaunchpadFactory.getLaunchPad();
        lp.getButton(LpButtonTypes.RECORD_ARM).lightOn(LpColor.YELLOW);
        lp.getButton(LpButtonTypes.RECORD_ARM).addButtonListener(new ButtonListener() {
            @Override
            public void onPush() {
                rowMajorFill();
            }
        });
        
        lp.getButton(LpButtonTypes.SOLO).lightOn(LpColor.ORANGE);
        lp.getButton(LpButtonTypes.SOLO).addButtonListener(new ButtonListener() {
            @Override
            public void onPush() {
                columnMajorFill();
            }
        });
        
        lp.getButton(LpButtonTypes.MUTE).lightOn(LpColor.RED);
        lp.getButton(LpButtonTypes.MUTE).addButtonListener(new ButtonListener() {
            @Override
            public void onPush() {
                telescopeFill();
            }
        });
        
        lp.getButton(LpButtonTypes.STOP).lightOn(LpColor.GREEN);
        lp.getButton(LpButtonTypes.STOP).addButtonListener(new ButtonListener() {
            @Override
            public void onPush() {
                diagonalPattern();
            }
        });
        
        lp.getButton(LpButtonTypes.SEND_B).lightOn(LpColor.PINK);
        lp.getButton(LpButtonTypes.SEND_B).addButtonListener(new ButtonListener() {
            @Override
            public void onPush() {
                diagonalReverse();
            }
        });
        
        lp.getButton(LpButtonTypes.SEND_A).lightOn(LpColor.BLUE);
        lp.getButton(LpButtonTypes.SEND_A).addButtonListener(new ButtonListener() {
            @Override
            public void onPush() {
                spiralFill();
            }
        });
        
        lp.getButton(LpButtonTypes.PAN).lightOn(LpColor.PURPLE);
        lp.getButton(LpButtonTypes.PAN).addButtonListener(new ButtonListener() {
            @Override
            public void onPush() {
                checkerFill();
            }
        });

    }
    
    private static void rowMajorFill() {

        lp.clearGrid(); // clear the board

        for(int row = 0; row < 8; row++){
            for(int col = 0; col < 8; col++){
                lp.getButton(row, col).lightOn(LpColor.YELLOW);
                lp.pause(200);
            }
        }
    }
    
    private static void columnMajorFill() {

        lp.clearGrid(); // clear the board

        for(int row = 0; row < 8; row++){
            for(int col = 0; col < 8; col++){
                lp.getButton(col, row).lightOn(LpColor.ORANGE);
                lp.pause(30);
            }
        }
    }
    
    private static void telescopeFill() {

        lp.clearGrid(); // clear the board
        
        boolean direction = true; // start forward
        for(int row = 0; row < 8; row++){
            for(int col = 0; col < 8; col++){
                int c = direction?col:(7-col);
                lp.getButton(row, c).lightOn(LpColor.RED);
                lp.pause(30);
            }
            direction = !direction; // flip direction
        }
    }

    
    private static void diagonalPattern() {

        lp.clearGrid(); // clear the board

        for(int row = 0; row < 8; row++){
            for(int col = 0; col <= row; col++){
                lp.getButton(row, col).lightOn(LpColor.GREEN);
                lp.pause(30);
            }
        }
    }
    
    private static void diagonalReverse() {

        lp.clearGrid(); // clear the board

        for(int row = 0; row < 8; row++){
            for(int col = row; col < 8; col++){
                lp.getButton(row, col).lightOn(LpColor.PINK);
                lp.pause(30);
            }
        }
    }
    
    private static void checkerFill() {

        lp.clearGrid(); // clear the board
        int flip = 1;
        for(int row = 0; row < 8; row++){
            for(int col = 0; col < 8; col++){
                if(col % 2 == flip){
                    lp.getButton(row, col).lightOn(LpColor.PURPLE);
                } 
                
                lp.pause(30);
                
            }
            flip = flip == 1?0:1;
        }
    }
    
    private static void spiralFill() {

        lp.clearGrid(); // clear the board
        
        int i, row = 0, col = 0,rowEnd = 8, colEnd = 8;      

        while (row < rowEnd && col < colEnd)
        {
            /* Print the first row from the remaining rows */
            for (i = col; i < colEnd; ++i){
                lp.getButton(row,i).lightOn(LpColor.BLUE);
                lp.pause(20);
            }
            row++;

            /* Print the last column from the remaining columns */
            for (i = row; i < rowEnd; ++i)
            {
                lp.getButton(i,colEnd-1).lightOn(LpColor.BLUE);
                lp.pause(20);
            }
            colEnd--;

            /* Print the last row from the remaining rows */
            if ( row < rowEnd)
            {
                for (i = colEnd-1; i >= col; --i)
                {
                    lp.getButton(rowEnd-1,i).lightOn(LpColor.BLUE);
                    lp.pause(20);
                }
                rowEnd--;
            }

            /* Print the first column from the remaining columns */
            if (col < colEnd)
            {
                for (i = rowEnd-1; i >= row; --i)
                {
                    lp.getButton(i,col).lightOn(LpColor.BLUE);
                    lp.pause(20);
                }
                col++;    
            }        
        }
    }
    
}
