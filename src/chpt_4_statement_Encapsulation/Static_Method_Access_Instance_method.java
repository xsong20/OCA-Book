package chpt_4_statement_Encapsulation;

public class Static_Method_Access_Instance_method {
	private String name = "static class";
	
	public static void staticMethod() {
		System.out.println("static method");
	}
	
	public void instanceMethod() {
		System.out.println("Instance Method");
	}
	
	// try to call an instance variable in a static method.
	public static void main(String[] args) {
		
		System.out.print("calling static method in a static method: ");
		staticMethod();
		// instanceMethod() is not even on the auto-complete list.
		// instance methods must be access via objects
		
		
		Static_Method_Access_Instance_method smaim = new Static_Method_Access_Instance_method();
		System.out.print("calling instance method with object in a static method: "); 
		smaim.instanceMethod();
				
		// static way of accessing static methods
		// impropriate way: smaim.staticMethod()
		System.out.print("calling static method in static way: ");
		Static_Method_Access_Instance_method.staticMethod();
		
		
		smaim.call_static_in_instance_var();
		smaim.call_instance_in_instance();
	}
	
	// try to call a static method in an instance variable.
	// no problem
	public void call_static_in_instance_var () {
		System.out.print("calling static method within an instance of method");
		staticMethod();
		

	}
	
	public void call_instance_in_instance() {
		System.out.print("calling instance method within an instance of method");
		instanceMethod();
	}
}
