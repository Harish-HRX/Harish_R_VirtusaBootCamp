import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileBufferReader {

	public void filebufferReader() throws FileNotFoundException {
		String s="";
		byte[] data=new byte[1200];
		FileInputStream fs=new FileInputStream("C:\\\\Users\\\\Haris\\\\Desktop\\\\webDev\\\\test.txt");
		BufferedInputStream bs=new BufferedInputStream(fs);
		try {
			while(bs.available()>0)
			{
				//System.out.print((char)bs.read());
				s +=(char)bs.read();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		data=s.getBytes();
		String str=new String(data);
		System.out.println("\nThe Content of the file read using BufferedInputStream: "+str);
	}
	
}
