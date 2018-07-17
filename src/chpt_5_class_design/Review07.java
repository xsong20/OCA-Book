package chpt_5_class_design;

public class Review07 {
	public Review07(Object ob) {
		// TODO Auto-generated constructor stub
		System.out.println(ob.getClass());
	}
	
	public static void main(String[] args) {
		// class java.lang.Integer. autoboxing from int to integer.
		
		// therefore a parameter with type java.lang.object takes any reference.
		new Review07(5);
		new Review07(null);
	}

}
