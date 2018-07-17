package assessmentTest;

public class _02_IdentityHashCode {
	public static void main(String[] args) {
		
		/*	The comparison operator == determines whether both the reference variables 
			are referring to the same String objects.*/
		
		/*	String objects created using the assignment operator are stored in 
		  	a pool of String objects.
			String objects in the string value pool is reused.
			
			String objects created using the operator new are never placed 
			in the pool of String objects.*/
		
		String s1 = "Java";
		String s2 = "Java";
		String s3 = new String("java");
		
		StringBuilder sb1 = new StringBuilder();
		sb1.append("Ja").append("va");
		
		System.out.println(s1 == s2);
		
		/* As in case of String s3, Explicit Copy constructor is called, 
		new reference is created for Java, while the same reference is allotted to s2
		(Object pooling to enhance performance)
		 */
		System.out.println(System.identityHashCode(s1));
		System.out.println(System.identityHashCode(s2));
		// s3 has different hashcode due to new keyword
		System.out.println(System.identityHashCode(s3));
		
		System.out.println(s1.equals(s2));
		System.out.println(sb1.toString() == s1);
		System.out.println(sb1.toString().equals(s1));
	}

}
