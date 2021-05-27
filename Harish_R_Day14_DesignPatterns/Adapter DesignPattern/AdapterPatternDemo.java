
public class AdapterPatternDemo {

	public static void main(String[] args) {
		
		MediaPlayer mp3Player=new AudioPlayer();
		mp3Player.play("mp3","beyond the horizon");
		
		MediaPlayer mp4Player=new AdvancedMediaPlayerAdapter(new Mp4Player());
		mp4Player.play("mp4", "alone");
		
		MediaPlayer vlcPlayer=new AdvancedMediaPlayerAdapter(new VlcPlayer());
		vlcPlayer.play("vlc", "far far away");
		
		MediaPlayer aviPlayer=new AdvancedMediaPlayerAdapter(new VlcPlayer());
		aviPlayer.play("avi", "Beliver");
	}

}
