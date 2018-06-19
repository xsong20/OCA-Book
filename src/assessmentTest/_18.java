package assessmentTest;

import java.time.LocalDate;
import java.time.Month;
import java.util.Calendar;

public class _18 {
	public static void main(String[] args) {
		System.out.println(LocalDate.of(2015, Month.APRIL, 1));
		
		// 2015-03-01
		// indexed from 0 
		// public final static int APRIL = 3;
		System.out.println(LocalDate.of(2015, Calendar.APRIL, 1));
		
		System.out.println(LocalDate.of(2015, 4, 1));
		
		
	   /* *
	    * //**
	     * Constructor, previously validated.
	     *
	     * @param year  the year to represent, from MIN_YEAR to MAX_YEAR
	     * @param month  the month-of-year to represent, not null
	     * @param dayOfMonth  the day-of-month to represent, valid for year-month, from 1 to 31
	     *//*
	    private LocalDate(int year, int month, int dayOfMonth) {
	        this.year = year;
	        this.month = (short) month;
	        this.day = (short) dayOfMonth;
	    }*/
	}
}
