package chpt_4_statement_Encapsulation;

import java.util.ArrayList;
import java.util.List;

public class ArrayList_RemoveIf {
	public static void main(String[] args) {
		List<String> ls = new ArrayList<>();
		ls.add("123");
		System.out.println(ls);
		
		// var declaration must be surrounded by.
		// Predicate is a functional interface for the convenience of using lambda expression.
		// without using Predicate, we'd have to create a lot of functional intercases to use Lambdas functional programming.
		// what does lambda mean??
		
		/*	In the simple terms, lambda expression is anonymous function that can be passed around to method as a parameter, 
		can stored in variable and also can returned a result.*/
		
		ls.removeIf((String a) -> a.equals("123"));
		System.out.println(ls);
		
		
	}

}
