package assessmentTest_11;

public class DoesInfiniteLoopCompile {

	public static void main(String[] args) {
		outer: for(int i =0 ; i < 3;) {
			System.out.println(i);
		};
	}

}
