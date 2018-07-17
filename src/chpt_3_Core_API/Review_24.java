package chpt_3_Core_API;

import java.util.Arrays;
import java.util.List;

public class Review_24 {
	public static void main(String[] args) {
		String [] names = {"Tom", "Dick", "Harry"};
		// names.asList() doesn't exist. 
		List<String> list = Arrays.asList(names);
		System.out.println(list);
	}

}
