import java.util.Scanner;



public class SimpleMusicPlayer{
 	
    public static void main(String[] args) {
        
        Mp3 mp3 = new Mp3();
        
		Song[] songs = {
						new Song("Clocks","Coldplay","mp3","clocks.mp3"),
						new Song("The Scientist","Coldplay","mp3","scientist.mp3")
						};
						
		
		Scanner input = new Scanner(System.in);
		
		boolean keepRunning = true;
		
		while(keepRunning){
			
			clearScreen();			

			for(int i = 0; i < songs.length; i++){
				System.out.println((i+1) + ": " + songs[i].getTitle() + " - " + songs[i].getArtist());		
			}
			
			int songChoice = input.nextInt();
			
			if(songChoice == 0){
				keepRunning = false;
			} else if (songChoice > 0 && songChoice <= songs.length){
				mp3.stop();
				mp3.play(songs[songChoice-1]);
			}	
		}
		
		mp3.stop();
		
		clearScreen();
		
		for(int i = 0; i < songs.length; i++){
			System.out.println(songs[i].getTitle() + " was played " + songs[i].getPlayCount() + " times");	
		}
		
		System.out.println();

    }
	
	private static void clearScreen(){
		for( int i = 0; i < 80; i++ ) {
 		   System.out.println("");
		}
	}

}