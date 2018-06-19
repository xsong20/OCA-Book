package chpt_2_Intro;

import java.io.File;

public class Assignment {
	public static void main(String[] args) {
		int x;
		int y = (x=3);
		// returned value of y is 3
		// x=3 1. sets the value of the var x to 3. 2.returns a value of the assignment.
		System.out.println(y);
		
		
		boolean a;
		boolean b = (a = true);
		// b is true
		System.out.println(b);
		
		// why does this not compile
		// The compiler cannot compare boolean with integer. They are not the same type.
		// boolean c = (true == 3);
		
		// "==" operator are used only in:
		// 1. comparing 2 numeric primitive types
		// 2. comparing 2 boolean values;
		// 3. comparing 2 objects, including null and string.
		
		// Object comparison: 2 references are equal if and only if they point to the same object or to null.
		
		System.out.println("=== File Object Comparison Example ===");
		File q = new File("myFile.txt");
		File w = new File("myFile.txt");
		File e = q;
		
		// false
		// new keyword creates a new object, even if this new object points to the same file as another object. 
		System.out.println(q == w);
		
		// true
		System.out.println(q == e);
		
		
		
		
	}

}
