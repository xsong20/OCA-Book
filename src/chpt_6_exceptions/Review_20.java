package chpt_6_exceptions;

public class Review_20 {

	public static void main(String[] args) {
		System.out.println("a");
		try {
			System.out.println("b");
			throw new IllegalArgumentException();
		}catch (IllegalArgumentException e) {
			System.out.println("c");
			throw new RuntimeException("1");
		}catch(RuntimeException e) {
			System.out.println("d");
			throw new RuntimeException("2");
		}
		finally {
			System.out.println("e");
			// throw new RuntimeException("3");
		}
	}
}
