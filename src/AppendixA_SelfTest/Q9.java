package AppendixA_SelfTest;

import java.util.Arrays;

import chpt_3_Core_API.ArrayListAPIs;

public class Q9 {
	
/*	Error: Main method not found in class AppendixA_SelfTest.Q9, please define the main method as:
		   public static void main(String[] args) or a JavaFX application class must extend javafx.application.Application
*/

	
	// final is allowed
	// access modifier must be public 
	// return type must be void
	// static is necessary

	public static final void main(String[] args) {
		System.out.println(Arrays.asList(args));
	}

}
