import org.junit.runner.*;
import org.junit.runner.Result;
import com.sun.net.httpserver.Authenticator.Failure;

public class Main {

	public static void main(String[] args) {
		MyLoggers ml=new MyLoggers();
		ml.myLogger();
		Result result=JUnitCore.runClasses(MyJunits.class);
		for (org.junit.runner.notification.Failure failure: result.getFailures())
		{
			System.out.println(failure.toString());
			
		}
		System.out.println(result.wasSuccessful());
	}

}
