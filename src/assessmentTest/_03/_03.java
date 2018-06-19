package assessmentTest._03;

interface HasTail{
	int getTailLength();
}


abstract class Puma implements HasTail {
	// Cannot reduce the visibility of the inherited method from HasTail
	// protected int getTailLength() { } line 3 can't compile
	
	public int getTailLength() {
		return 4;
	}
	
}

public class _03 {
	
	public static void main(String[] args) {
		// Cannot instantiate the type Puma abstract class
		// Puma puma = new Puma();
		Puma puma = new Cougar();
		System.out.println(puma.getTailLength());
	}
	


}
