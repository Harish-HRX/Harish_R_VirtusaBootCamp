
public class VlcPlayer implements AdvancedMediaPlayer{

	@Override
	public void loadFilename(String filename) {
		
		System.out.print("Playing "+filename+" file. ");
	}

	@Override
	public void listen(String audio) {
		
		System.out.println("Name:"+audio+".vlc");
		
	}

}
