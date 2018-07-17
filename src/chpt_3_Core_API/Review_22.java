package chpt_3_Core_API;

import java.util.Arrays;

public class Review_22 {
	public static void main(String[] args) {
		int [] random = {6, -4, 12, 0, -10};
		int x = 12;
		
		// unordered array can be also sorted
		int y = Arrays.binarySearch(random, x);
		System.out.println(y);
	}

}
