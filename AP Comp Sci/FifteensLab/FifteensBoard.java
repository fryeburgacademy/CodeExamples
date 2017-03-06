public interface FifteensBoard
{

    // shuffle the tiles
    private void shuffle();
    
	// find and return the Tile that has the number the user typed
    public Tile getSelectedTile(int tileNum);
    
    // move the Tile the user selected
    public void moveTile(int tileNum);
    
	// check if the Tile we're moving is a valid move
    private boolean isValidMove(Tile t);
    
	// check if the game is solved
    public boolean isSolved();
    
	// populate the board with 15 Tiles
    private void fillBoard();
    
	// display the board
    public void printBoard();
    
}
