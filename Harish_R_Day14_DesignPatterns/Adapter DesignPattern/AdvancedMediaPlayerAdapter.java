
public class AdvancedMediaPlayerAdapter implements MediaPlayer{

	private AdvancedMediaPlayer player;
	
	AdvancedMediaPlayerAdapter(AdvancedMediaPlayer player){
		super();
		this.player=player;
	}
	
	@Override
	public void play(String filename, String audioType) {
	
		if(filename!=("mp4")&&filename!=("vlc")) {
			System.out.println("Invalid media. "+filename+" format not supported");
			return;
		}
		player.loadFilename(filename);
		player.listen(audioType);
	}

}
