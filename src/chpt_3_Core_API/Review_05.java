package chpt_3_Core_API;

public class Review_05 {
	public static void main(String[] args) {

		String st = "123";
		StringBuilder sb = new StringBuilder("333");
		// can't compare 2 refs of different types
	/*	if(st == sb) {
			st.sub
		}*/
		
		// string += boolean. A string concatenated with any other type returns a string. 
		st += false;
		System.out.println(st);
	
	}

}
