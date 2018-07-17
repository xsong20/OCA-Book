package chpt_4_statement_Encapsulation;

import java.util.function.Predicate;

public class Chpt4_Review26 {
	int age;
	
	public static void main(String[] args) {
		Chpt4_Review26 panda = new Chpt4_Review26();
		panda.age = 1;
		check(panda, p -> p.age <5);
		
	}
	
	private static void check(Chpt4_Review26 p, Predicate<Chpt4_Review26> pred) {
		String result = pred.test(p) ? "match" : "not match";
		System.out.println(result);
		
	}
	

}
