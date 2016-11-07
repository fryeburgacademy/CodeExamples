
public class 2DQuiz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String[][] names = {
                        {"ken","bob","joe"},
                        {"jill","ann","bill"},
                        {"kate","sarah","alice"},
                        {"dave","dom","timmy"}};
        
        // ROW MAJOR
        for(int row = 0; row < names.length; row++){    
            for(int col = 0; col < names[0].length; col++){
                // IN THIS SPOT
                // we have access to a SINGLE location in the grid
                System.out.print(names[row][col] + "  "); 
            }
            System.out.println();
        }
        
        // COLUMN MAJOR
        for(int col = 0; col < names[0].length; col++){    
            for(int row = 0; row < names.length; row++){
                System.out.print(names[row][col] + "  ");
            }
             System.out.println();
        }
    
        
    }
    
}
