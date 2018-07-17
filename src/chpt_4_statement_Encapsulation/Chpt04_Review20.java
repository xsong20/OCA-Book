package chpt_4_statement_Encapsulation;

public class Chpt04_Review20 {
	public Chpt04_Review20 cpt;

	public Chpt04_Review20() {
		this(1);
		// The method Chpt04_Review20(int) is undefined for the type Chpt04_Review20.
		// the following line of code calls an instance method
		// Chpt04_Review20(1);
		int i;
		// one alternative way to call constructor. new keyword is necessary or an instance var will be called.
		// it can be used anywhere in constructor. this is to used to create a new object instead of the one "this" points to.
		cpt = new Chpt04_Review20(1);
	}
	
	public Chpt04_Review20(int i) {
		
		System.out.println(1);
		
	}

	
	public static void main(String[] args) {
		Chpt04_Review20 cp = new Chpt04_Review20();
		
		// 1579572132
		// 359023572
		System.out.println(System.identityHashCode(cp));
		System.out.println(System.identityHashCode(cp.cpt));
	}
}
