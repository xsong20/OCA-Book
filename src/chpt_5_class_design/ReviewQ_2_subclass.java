package chpt_5_class_design;

public class ReviewQ_2_subclass extends ReviewQ_2{
	
	// A call to super constructor must be done in 2 ways:
	// 1. if the default constructor is defined in parent class. the first line can be left empty
	// 2. if the default constructor is not defined in parent calss. a call to super(int) must be provided. 
	public ReviewQ_2_subclass() {
		super(5);
		System.out.println("Platypus");
	}
	
	public static void main(String[] args) {
		new ReviewQ_2(5);
	}
	

}
