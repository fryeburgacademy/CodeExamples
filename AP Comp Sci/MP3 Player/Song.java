
public class Song{

	String title;
	String artist;
	String filename;
	String directory;
	int playCount;
	
	public Song(String t, String a, String d, String f){
		title = t;
		artist = a;
		directory = d;
		filename = f;
		playCount = 0;
	
	
	}
	
	public int getPlayCount(){
		return playCount;
	}
	
	public void incrementPlayCount(){
		playCount++;
	}
	
	public String getTitle(){
		return title;
	}
	
	public String getArtist(){
		return artist;
	}
	
	public String getCompleteFilename(){
		return directory + "/" + filename;
	}	



}