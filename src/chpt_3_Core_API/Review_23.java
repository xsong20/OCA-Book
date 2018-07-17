package chpt_3_Core_API;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Review_23 {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(10, 4, -1, 5);
		System.out.println("Before sorting: " + list);
		Collections.sort(list);
		System.out.println("After sorting:" + list);
		Integer array[] = list.toArray(new Integer[4]);
		System.out.println(array[0]);
	}

}
