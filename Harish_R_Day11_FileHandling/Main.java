import java.io.FileNotFoundException;

public class Main {

	public static void main(String[] args) throws FileNotFoundException {
		FileBufferReader fr=new FileBufferReader();
		FileBuffer f=new FileBuffer();
		BufferedWriterEmailReg ereg=new BufferedWriterEmailReg();
		f.fileBuffer();
		fr.filebufferReader();
		ereg.bufferedWriterEmail();

	}

}
