package chpt_4_statement_Encapsulation;



public class default_value_of_vars {

	private static int count;

	private static String str;
	
	private int instanceCount;
	
	private  Integer interger; 
	
	public static void main(String[] args) {
		// default value of an int is 0
		System.out.println(count);
		
		// default value of an string is null
		System.out.println(str);
		
		// default value of an instance int is also 0
		System.out.println(new default_value_of_vars().instanceCount);
		
		// default value of a reference is null
		System.out.println(new default_value_of_vars().interger);
	}

}
