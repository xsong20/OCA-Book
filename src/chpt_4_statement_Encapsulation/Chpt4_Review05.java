package chpt_4_statement_Encapsulation;

public class Chpt4_Review05 {
	
	{
		System.out.println("123");
	}

	public int howMany(boolean b, boolean... b2) {
		return b2.length;
	}
	
	public static void main(String[] args) {
		boolean[] booleanarray = {true, true};
		Chpt4_Review05 rw = new Chpt4_Review05();
		rw.howMany(true, booleanarray);
		
		// not compiling
		// rw.howMany(true, {true, true}};
		
		// alternative approach 
		System.out.println(rw.howMany(true, new boolean[] {true,true}));
		
		// 
		System.out.println(rw.howMany(true, new boolean[2]));
		
		// Variable must provide either dimension expressions or an array initializer
		// System.out.println(rw.howMany(true, new boolean[]));
		
	}

}
