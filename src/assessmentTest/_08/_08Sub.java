package assessmentTest._08;

public class _08Sub extends _08 {
	public _08Sub(int age) {
		System.out.println("Reindeer, subclass was constructed");
	}

	// in super class there is one private method with same name
	public void hasHorns() {
		System.out.println("sub has horn");

	}
	
	// inherit from super class and override it. the method in superclass has protected access identifier
	public void showTime() {
		System.out.println("showTime method called from subclass");
	}
	
	// inherit from super class and override it. the method in superclass has public access identifier
	public void showAge() {
		System.out.println("Sub showAge was executed");
	}
}
