package chpt_4_statement_Encapsulation;

public class Chpt4_Review13 {
	private static final String leftRope;
	private static final String rightRope;
	// The blank final field bench may not have been initialized
	// private static final String bench;
	private static final String name = "name";
	static {
		leftRope = "left";
		rightRope = "right";
	}
	
	static {
		// The final field Chpt4_Review13.name cannot be assigned
		// name = "name";
		
		// The final field rightRope may already have been assigned
		// rightRope = "right";
	}

	public static void main(String[] args) {
		// The final field Chpt4_Review13.bench cannot be assigned
		// bench = "bench";
	}
}
