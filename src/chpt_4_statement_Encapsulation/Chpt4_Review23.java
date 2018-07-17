package chpt_4_statement_Encapsulation;

public class Chpt4_Review23 {
	
	// Statements are executed before constructors
	String st = "t";

	
	public Chpt4_Review23(String t){
		st += t;
	}
	
	{st += "a";}
	{st += "b";}

	public Chpt4_Review23() {
		st += "c";
	}
	
	public static void main(String[] args) {
		Chpt4_Review23 r23 = new Chpt4_Review23("1");
		System.out.println(r23.st);
	}

}
