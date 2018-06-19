package assessmentTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _14 {
	public static void main(String[] args) {
		/*
		String[] st = {"1234","455","666"};
		List<String> ls = Arrays.asList(st);*/
		
		// when ls.size() == 0
		// unchecked runtime exception: java.lang.IndexOutOfBoundsException: 
		
		List<String> ls = new ArrayList<>();
		System.out.println(ls.size());
		System.out.println(ls.get(0));
	}

}
