package chpt_5_class_design;

public class UnrelatedCasting {
	
	String st = "123";
	
	// Cannot cast String to int, because they are unrelated. The classes Fish and Bird are not related through any class hierarchy that the compiler 
	// is aware of.
	// int i = (int)st;
	
	// to avoid misusing type casting, use instanceof keyword to check the type.
	

}
