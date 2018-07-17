package chpt_4_statement_Encapsulation;

import chpt_4_statement_Encapsulation_AccessModifier_Examples.*;


public class AccessModifier_protected_Outside_package {
	public static void main(String[] args) {
		AccessModifier_protected ap = new AccessModifier_protected();
		// outside packge, outside subclass. only public method can be used. 
		// protected, default, private can't be seen by using ap
		ap.publicprint();
		
		AccessModifer_Subclass sb = new AccessModifer_Subclass();

		// outside package, outside subclass. Only public is allowed
		sb.publicprint();
		
		
		// outside the package, outside subclass, only public is allowed
		AccessModifier_Subclass_In_Another_Package sbiap = new AccessModifier_Subclass_In_Another_Package();
		sbiap.publicprint();
		
		
		// !!!!!!! Subclass is defined in the same package as superclass
		// Subclass_In_Another_Package is defined in another package.
		
	}
	
}
