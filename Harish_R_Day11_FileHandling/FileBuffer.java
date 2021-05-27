import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileBuffer {
	public void fileBuffer() throws FileNotFoundException {
		Scanner sc=new Scanner(System.in);
		String empid=sc.nextLine();
		String name=sc.nextLine();
		String str= "Welcome "+name + " your Employee Id is " + empid;
		FileOutputStream fs=new FileOutputStream("C:\\\\Users\\\\Haris\\\\Desktop\\\\webDev\\\\test.txt");
		BufferedOutputStream bs=new BufferedOutputStream(fs);
		byte buf[]=new byte[1000];
		buf=str.getBytes();
		try {
			fs.write(buf);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		System.out.println("\nEmployee details sucessfully added...!! ");
	}
}
