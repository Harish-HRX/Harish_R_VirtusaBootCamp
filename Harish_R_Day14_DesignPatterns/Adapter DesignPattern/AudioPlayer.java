
public class AudioPlayer implements MediaPlayer{

	@Override
	public void play(String audioType, String filename) {
		
		System.out.println("Playing "+audioType+" file. Name: "+filename+".mp3");
	
	}

}
