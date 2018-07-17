package chpt_5_class_design;

public class Review04_subclasss extends Review04{
	
	// This instance method cannot override the static method from Review04
	// public Number chew() throws RuntimeException{
	
	// The return type is incompatible with Review04.chew() because Number is superclass of Integer.
	// Additionally, Integer class is final.Thus can't be extended.
	// public static Number chew() throws RuntimeException{
	
	public static Integer chew() throws RuntimeException{
		System.out.println("Sub is chewing");
		return 2;
	}

}
