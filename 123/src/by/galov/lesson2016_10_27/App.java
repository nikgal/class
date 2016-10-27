package by.galov.lesson2016_10_27;

import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class App {

	public static void main(String[] args) throws InterruptedException  {
		Date date = new Date();
		System.out.println(date);
		Thread.sleep(2000);
		Date date1 = new Date();
		System.out.println(date1);
		
		System.out.println(date.before(date1));
		
		Calendar calendar = Calendar.getInstance();
		
		System.out.println(calendar.get(Calendar.MONTH));
		System.out.println(calendar.get(Calendar.DAY_OF_WEEK));
		System.out.println(calendar.get(Calendar.YEAR));
		
		DateTimeFormatter f = DateTimeFormatter.ofPattern("yyyy-mm-dd");
		
		
		
	}

}
