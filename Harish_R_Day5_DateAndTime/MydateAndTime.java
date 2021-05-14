import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class MydateAndTime {

	public static void dateFormat() {
		String date="May 14 2021";
		DateTimeFormatter dtf=DateTimeFormatter.ofPattern("MM dd yyyy");
		LocalDate dt=LocalDate.parse(date,dtf);
		System.out.println(dt);
	}
	
	public static void getDays(){
		LocalDate sDay=LocalDate.of(2021,5,14);
		LocalDate eDay=LocalDate.of(2021,5,16);
		Period diffInDays = Period.between(sDay, eDay);
		System.out.println(diffInDays.getMonths()+" "+diffInDays.getDays()+" "+diffInDays.getYears());
	}
	
	public static void creditcard(){
		LocalDate EDay=LocalDate.of(2021,5,14);
		LocalDate today=LocalDate.now();
		if(EDay.equals(today)) {
			System.out.println("Your creditcard has expired");
		}
		else {
			System.out.println("Your creditcard not has expired");
		}
	}
	
	public static void getDate(){
		LocalDate bDay=LocalDate.of(2021,5,14);
		LocalDate today=LocalDate.now();
		if(bDay.equals(today)) {
			System.out.println("Today is your birthday");
		}
		else {
			System.out.println("Today is not your birthday");
		}
		
		System.out.println(today.plusWeeks(1));
	}
	
}
