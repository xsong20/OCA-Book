package chpt_4_statement_Encapsulation;

/*
 * static vars are called by using class type instead of the object pointed by the reference.
 * so (static_var)null.count compiles.
 * 
 *  Key points related to static vars:
 *  
 */
public class Static_Var_Are_Shared {
	
	public static int count = 0;
	
	public static void main(String[] args) {
		Static_Var_Are_Shared sv = new Static_Var_Are_Shared();
		System.out.println(sv.count);
		sv = null;
		
		// sv is a ref that points to null, the type is Static_var.
		// when accessing a static var in a class. JVM use the class type instead of the object itself.
		// sv.count is acutually null.count, but the type of sv, ie,reference to null is Static_var.
		System.out.println(sv.count);
		
		// static fields are shared
		
		Static_Var_Are_Shared sv1 = new Static_Var_Are_Shared();
		sv1.count = 4;
		
		Static_Var_Are_Shared sv2 = new Static_Var_Are_Shared();
		sv2.count = 5;
		
		
		// the answer is 5.
		System.out.println(sv1.count);
		
		
	}

}
