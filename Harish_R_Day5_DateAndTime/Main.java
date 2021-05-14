import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Main {
    
	
	public static void main(String[] args) {
		MydateAndTime dt=new MydateAndTime();
		dt.getDate();
	    dt.creditcard();
		dt.getDays();
		dt.dateFormat();
		MyMatcher mm=new MyMatcher();
		mm.checkPattern();
	}

}
