
import org.apache.log4j.Appender;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.HTMLLayout;
import org.apache.log4j.Layout;
import org.apache.log4j.Logger;
import org.apache.log4j.SimpleLayout;


public class MyLoggers {
	static final Logger log1=Logger.getLogger(App.class.getName());
    public static void myLogger()
    {
    	Layout layout=new SimpleLayout();
    	Layout layout=new PatternLayout(" %d{ yyyy-MMM-dd HH:mm:ss-SSS} %m %n");

    	Appender a=new ConsoleAppender(layout);
    	log1.addAppender(a);
     	BasicConfigurator.configure();
    	
    	log1.info("info message");
    	log1.debug("debug message");
    	log1.fatal("fatal message");
    	log1.error("error messgae");
    	log1.warn("warning message");
    	
     //   System.out.println( "Hello World!" );
    }
}
