package chpt_3_Core_API;

import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Review_32 {
	public static void main(String[] args) {
		// Period p = Period.of(years, months, days);
		// LocalDateTime.of(year, month, dayOfMonth, hour, minute, second);
		
		DateTimeFormatter dtf = DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT);
		
		LocalDateTime ldt = LocalDateTime.of(1991, 03, 19, 5, 14, 33);
		
		// same
		System.out.println(ldt.format(dtf));
		System.out.println(dtf.format(ldt));
		
		// p doesn't support chainning,
		// use p.of(years, months, days);
		// only ofYear() Counts.
		Period p  = Period.ofMonths(3).ofYears(1991);
		ldt = ldt.minus(p);

		System.out.println(p.getMonths());
		System.out.println(p.getYears());

		
	}

}
