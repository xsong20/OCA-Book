package chpt_3_Core_API;

import java.util.ArrayList;
import java.util.List;

public class Review_26 {
	public static void main(String[] args) {
		/*
		 * Parses the string argument as a signed decimal integer. 
		The characters in the string must all be decimal digits, 
		except that the first character may be an ASCII minus sign 
		*/
		
		// int java.lang.Integer.parseInt(String s) throws NumberFormatException
		Integer.parseInt("123456");
		
		// throws NumberFormatException
		// Integer.parseInt("fds");
		
		/*			
		Integer java.lang.Integer.valueOf(int i)

		 * Returns an Integer instance representing the specified int value.
		If a new Integer instance is not required, this method should generally be used in preference to the constructor Integer(int), 
		as this method is likely to yield significantly better space and time performance by caching frequently requested values. 
		This method will always cache values in the range -128 to 127, 
		inclusive, and may cache other values outside of this range.
		*/
		
		// Java Class class??
		Class<? extends Integer> c = (Integer.valueOf( new Integer(15) ) ).getClass();
		System.out.println(c);
		
		// console: class java.lang.Integer.  
		// the returned value of valueOf() is an integer object.
		
		/*Returns an Integer object holding the value of the specified String.
		The argument is interpreted as representing a signed decimal integer, 
		exactly as if the argument were given to the parseInt(java.lang.String) method. 
		The result is an Integer object that represents the integer value specified by the string. 
		*/
		System.out.println(Integer.valueOf("6"));
		

		// what's the type of null
		List<Integer> ls = new ArrayList<>();
		ls.add(null);
		ls.add(7);
		System.out.println(ls);
		
	}

}
