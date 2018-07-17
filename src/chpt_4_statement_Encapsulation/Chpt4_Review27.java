package chpt_4_statement_Encapsulation;

public class Chpt4_Review27 {
	public static void main(String[] args) {
		String st = "123";
		// String class doesn't have append method
		StringBuilder sb = new StringBuilder();
		// inital value of stringbuilder sb is an empty string "".
		System.out.println(sb);
		sb.append("1");
		System.out.println(sb);
	}

}
