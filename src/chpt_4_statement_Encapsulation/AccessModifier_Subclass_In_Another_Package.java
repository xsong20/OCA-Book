package chpt_4_statement_Encapsulation;

import chpt_4_statement_Encapsulation_AccessModifier_Examples.AccessModifier_protected;

public class AccessModifier_Subclass_In_Another_Package extends AccessModifier_protected{
	public static void main(String[] args) {
		
		AccessModifier_protected ap = new AccessModifier_protected();
		
		// outside the package, no protected and default is allowed by using subperclass ref
		ap.publicprint();
		
		AccessModifier_Subclass_In_Another_Package sbiap = new AccessModifier_Subclass_In_Another_Package();
		
		// outside the package and within the subclass, protected can be used.
		sbiap.protectedprint();
		sbiap.publicprint();
	}

}
