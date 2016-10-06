import java.io.BufferedInputStream;
import java.io.FileInputStream;
import javazoom.jl.player.Player;
public class Mp3{

    private Player player;
    
    public Mp3(){
    	//no arg constructor
    }

    public void stop() { 
    	if (player != null){
    		player.close();
    	}
    }


    public void play(Song s) {
        try {
            FileInputStream fis     = new FileInputStream(s.getCompleteFilename());
            BufferedInputStream bis = new BufferedInputStream(fis);
            player = new Player(bis);
        }
        catch (Exception e) {
            System.out.println("Problem playing file " + s.getTitle());
            System.out.println(e);
        }

        // needs a thread so it doesn't just die when the application finishes executing
        new Thread() {
            public void run() {
                try { 
                	player.play();
                	s.incrementPlayCount();
                 }
                catch (Exception e) { System.out.println(e); }
            }
        }.start();

    }

}