package assessmentTest._08;

// _08 is the super class with 
// private method in super class
// 


public class _08 {
	
	//constructor
	public _08() {
		System.out.println("Deer, superclass was constructed");
	}

	// constructor with parameter age
	public _08(int age) {
		System.out.println("DeerAge");
	}
	
	// private method. In subclass there is another method with same name.
	private void hasHorns() {
		System.out.println("super has no horn");
	}
	
	// subclass will override this method
	public void showAge() {
		System.out.println("Super showAge was executed");
	}
	
	// will be overridden
	protected void showTime() {
		System.out.println("Super showtime");
	}
	
	
	public static void main(String[] args) {
		// assign a subclass object to a super class reference 
		_08 deer = new _08Sub(5);
		
		/* Console output after last line.*/
		// Deer, superclass was constructed
		// Console : Reindeer, subclass was constructed
		deer.hasHorns();
		// super has no horn
	
		// assign a subclass object to a subclass reference

		_08Sub deersub = new _08Sub(5);
		
		/* 
		 * 	Deer, superclass was constructed
			Reindeer, subclass was constructed
		 */
		
		deersub.hasHorns();
		// sub has horn
		
		deer.showAge();
		deersub.showAge();
		/*	Sub showAge was executed
			Sub showAge was executed*/
		
		deer.showTime();
		deersub.showTime();
		/*	showTime method called from subclass
			showTime method called from subclass*/
		
	}
}
