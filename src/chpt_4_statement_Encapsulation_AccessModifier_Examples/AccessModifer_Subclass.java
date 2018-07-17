package chpt_4_statement_Encapsulation_AccessModifier_Examples;

public class AccessModifer_Subclass extends AccessModifier_protected{
	
	public void subFly() {
		AccessModifier_protected ap = new AccessModifier_protected();
		// within the subclass and within the same package. protected, default, public are allowed by using superclass ref
		ap.defaultprint();
		ap.protectedprint();
		
		// default methods can be called because this class is defined in the same package as the instantiated class(Access_protected)
		ap.publicprint();
		
		// within the subclass and within the same package. protected, default, public are allowed by using subclass ref
		AccessModifer_Subclass sb = new AccessModifer_Subclass();
		
		// protected method can be called because it's a subclass
		sb.protectedprint();
		sb.publicprint();
		
		// default methods can be called because this class is defined in the same package as the instantiated class(Subclass)
		sb.defaultprint();
	}
	
	

}
