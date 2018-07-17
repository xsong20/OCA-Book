package chpt_4_statement_Encapsulation;

public class Chpt4_Review18 {
	private static int j = 0;
	private int k = 0;
	
	public Chpt4_Review18() {
		// Cannot refer to an instance field k while explicitly invoking a constructor
		this(0);
		
		// constructor is initialized after instance field.
		// superclass > static vars > instance vars > constructor.
		System.out.println(k);
		
		// Constructor call must be the first statement in a constructor. A is false
		// this();
	}
	
	public Chpt4_Review18(int i ) {
		System.out.println(i);
	}
	
	// to access a private constructor in main method.
	private Chpt4_Review18(String s) {
		System.out.println(s);
	}
	
	public void callThis() {
		// Constructor call must be the first statement in a constructor. B is false
		// this();
		
		// try to call instance/static variables in an instance method
		
	}
	
	
	public void callVarsInInstanceMethod() {
		// C is correct
		System.out.println(j);
		System.out.println(k);
	}
	
	public static void callVarsInStaticMethod() {
		// D is wrong. Instance vars cannot be called in any static method.
		System.out.println(j);
		
		//Cannot make a static reference to the non-static field k
		// System.out.println(k);
	}
	
	public static void main(String[] args) {
		// accessing the private construction within main method in the same class.
		Chpt4_Review18 cp = new Chpt4_Review18("123");
		
	}
	
	
	

}
