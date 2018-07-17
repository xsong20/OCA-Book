package chpt_5_class_design.hidingStaticMethods;

public class Panda extends Bear{
	public static void eat() {
		System.out.println("Panda is eating");
	}
	
	public static void main(String[] args) {
		
		// Subclass hides the methods of superclass
		// this practice tends to be erroneous and difficult-to-read code.  
		Panda.eat();
		Bear.eat();
	}

}
