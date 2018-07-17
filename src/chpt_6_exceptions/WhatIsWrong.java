package chpt_6_exceptions;


public class WhatIsWrong {
	public static void main(String[] args) throws Exception {
		// initiate an array of string of no element
		String[] st = new String[0];
		
		// printing the first element. 
		// Exception.
		// System.out.println(st[0]);
		
		// throw new Exception();
		try {
			// java.lang.Exception.Exception(String message)
		throw new Exception("Exception was thrown");
		}catch(Exception e ) {
			e.printStackTrace();
		}
		// throw new RuntimeException();
		// throw new RuntimeException("wow Runtime exception");
	}

}
