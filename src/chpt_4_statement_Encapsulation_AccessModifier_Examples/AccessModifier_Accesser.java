package chpt_4_statement_Encapsulation_AccessModifier_Examples;

public class AccessModifier_Accesser {
	public static void main(String[] args) {
		AccessModifier_protected ap = new AccessModifier_protected();
		AccessModifer_Subclass sb = new AccessModifer_Subclass();
		// protected methods can be accessed in the same package and also in the subclass
		ap.protectedprint();
		
		// protected and default methods can be called in subclass.
		sb.defaultprint();
		sb.protectedprint();
		
		// can't see ap.priprint(); private methods is only available within the class.
		
		// default method can be used in whole package
		ap.defaultprint();
		
		
		
		
	}

}
