import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class BufferedWriterEmailReg {
		
	public void bufferedWriterEmail() {
		try {
			Scanner in=new Scanner(System.in);
			String name=in.nextLine();
			String id=in.nextLine();
			FileWriter fw=new FileWriter("C:\\Users\\Haris\\Desktop\\webDev\\test.txt");				
				BufferedWriter bw=new BufferedWriter(fw);
				bw.write("Welcome "+name+" thank you for registering your email id"+id);
				bw.flush();
				bw.close();
			}
			catch(IOException o) {
				o.printStackTrace();;
			}
	}

}
