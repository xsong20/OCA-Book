package assessmentTest;

public class _13 {
	// difference between i-- and --i;
	
	public static void main(String[] args) {
		int i = 5;
		i--;
		// 4
		System.out.println(i);

		int a = 5;
		//5
		//why?  this statement applies syso(a)[result of that is 5] first
		System.out.println(a--);
		//4 , then decremnt a[result of that is 4].
		System.out.println(a);
		
		int j = 5;
		// 4. Decrement j first then apply syso(j)
		System.out.println(--j);
		// 4
		System.out.println(j);
		
		int b = 5;
		--b;
		// 4
		System.out.println(b);
	}

}
