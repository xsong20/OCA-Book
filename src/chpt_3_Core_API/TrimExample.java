package chpt_3_Core_API;

public class TrimExample {
	public static void main(String[] args) {
		String st = "\n1234\t\r";
		System.out.print(st);
		st.trim();
		System.out.print(st);
		
		System.out.println(System.getProperty("line.separator"));

	}

}
