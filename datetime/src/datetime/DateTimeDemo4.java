package datetime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeDemo4 {
	public static void main(String[] args) {
		LocalDateTime curDateTime =
			LocalDateTime.parse("junho 30, 2021 12:01 AM",
					DateTimeFormatter.ofPattern("MMMM d',' yyyy hh':'mm a"));
		
		System.out.println(curDateTime.format(
					DateTimeFormatter.ofPattern("MMMM d',' yyyy h':'mm a")));
	}
}
