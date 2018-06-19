package whyDoesThisStatementNotCompile;

public class WhyDoesThisStatementNotCompile {
	public static void main(String[] args) {
		// Cannot convert doulbe to float.
		// Java primitive types:
		/*
		 *
		 1. byte: 
		 The byte data type is an 8-bit signed two's complement integer.
		 It has a minimum value of -128 and a maximum value of 127 (inclusive). 
		 The byte data type can be useful for saving memory in large arrays, 
		 where the memory savings actually matters. They can also be used in place of 
		 int where their limits help to clarify your code; the fact that a variable's range is 
		 limited can serve as a form of documentation.

		2. short:
		The short data type is a 16-bit signed two's complement integer. 
		It has a minimum value of -32,768 and a maximum value of 32,767 (inclusive). 
		As with byte, the same guidelines apply: 
		you can use a short to save memory in large arrays, 
		in situations where the memory savings actually matters.
		
		3. int:
		By default, the int data type is a 32-bit signed two's complement integer, 
		which has a minimum value of -231 and a maximum value of 231-1. In Java SE 8 and later, 
		you can use the int data type to represent an unsigned 32-bit integer,
		which has a minimum value of 0 and a maximum value of 232-1. 
		Use the Integer class to use int data type as an unsigned integer. 
		See the section The Number Classes for more information. 
		Static methods like compareUnsigned, divideUnsigned etc have been added to
		the Integer class to support the arithmetic operations for unsigned integers.
		
		4. long: 
		The long data type is a 64-bit two's complement integer. 
		The signed long has a minimum value of -2^63 and a maximum value of 263-1. 
		In Java SE 8 and later, you can use the long data type to represent an unsigned 64-bit 
		long, which has a minimum value of 0 and a maximum value of 264-1. 
		Use this data type when you need a range of values wider than those provided by int.
		The Long class also contains methods like compareUnsigned,
		divideUnsigned etc to support arithmetic operations for unsigned long.
		
		5. float: 32-bit
		The float data type is a single-precision 32-bit IEEE 754 floating point.
		Its range of values is beyond the scope of this discussion, 
		but is specified in the Floating-Point Types, Formats, 
		and Values section of the Java Language Specification.
		As with the recommendations for byte and short, use a float (instead of double) 
		if you need to save memory in large arrays of floating point numbers.
		This data type should never be used for precise values, such as currency. 
		For that, you will need to use the java.math.BigDecimal class instead. 
		Numbers and Strings covers BigDecimal and other useful classes provided by the Java Platform.
		
		6. double: 64-bit
		The double data type is a double-precision 64-bit IEEE 754 floating point. 
		Its range of values is beyond the scope of this discussion,
		but is specified in the Floating-Point Types, Formats, 
		and Values section of the Java Language Specification. For decimal values, 
		this data type is generally the default choice. 
		As mentioned above, this data type should never be used for precise values, 
		such as currency.
		
		7. boolean: 
		The boolean data type has only two possible values: 
		true and false. Use this data type for simple flags that track true/false conditions.
		This data type represents one bit of information, 
		but its "size" isn't something that's precisely defined.
		
		8. char: 
		The char data type is a single 16-bit Unicode character. 
		It has a minimum value of '\u0000' (or 0) and a maximum value of '\uffff' 
		(or 65,535 inclusive).
		*/
		

		/*
		 * All floating point values (float and double) in an arithmetic operation (+, −, *, /) 
		 * are converted to double type before the arithmetic operation in performed.
		 * 
		 * Thus the following example
		 */
		
		float value = (float) 102.0;
		System.out.println(value);
		
		// int can be directly converted to float
		float value2 = 102;
		float value3 = (int)102.0;
		
		/*
		 * what does 1f mean?
		 * by default 12.3 is double literal,
		 * So to tell compiler to treat it as float explicitly. 
		 */

		float v5 = 1f * (short) 0.0;
		System.out.println(1f * (short) 0.0);
		
		// System.out.println(1f * (boolean) 0);
		
		/* https://docs.oracle.com/javase/specs/jls/se7/html/jls-5.html
		 * Widening Primitive Conversion:
		 * 
		  19 specific conversions on primitive types are called the widening primitive conversions:
				
			byte to short, int, long, float, or double
	
			short to int, long, float, or double
	
			char to int, long, float, or double
	
			int to long, float, or double
	
			long to float or double
	
			float to double
		 */
		
		// 1f will be converted to doulbe then will  the calculation be done. So a cast to 
		// float must be added.
		// Remember: float is 32-bit, double is 64-bit.
		float value4 = (float) (1f * 0.0);
		
	}

}
