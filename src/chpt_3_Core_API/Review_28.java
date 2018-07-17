package chpt_3_Core_API;

import java.time.LocalDate;
import java.time.Month;
import java.util.Calendar;

public class Review_28 {
	public static void main(String[] args) {
		// calendar.JUNE is 5
		System.out.println(Calendar.JUNE);
		// Month.JUNE
		System.out.println(Month.JUNE);
		
		
		//enum class
		System.out.println(LocalDate.of(2014, Month.JUNE, 21));
	}
}
