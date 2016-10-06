To run this program, download all the files.  On BOTH compilation and RUN, you'll need to include the jar file.  To do this:

ON WINDOWS:
javac -cp ".;*" SimpleMusicPlayer.java
java -cp ".;*" SimpleMusicPlayer

ON MAC/UNIX
javac -cp ".:*" SimpleMusicPlayer.java
java -cp ".:*" SimpleMusicPlayer

This example uses the Javazoom JL library to play the MP3 files.
