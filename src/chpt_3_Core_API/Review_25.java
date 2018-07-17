package chpt_3_Core_API;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Review_25 {
	public static void main(String[] args) {
		List<String> hex = Arrays.asList("30", "8", "3A", "FF");

		
		/* public static <T extends Comparable<? super T>> void sort(List<T> list)
		Sorts the specified list into ascending order, according to the natural ordering of its elements. 
		All elements in the list must implement the Comparable interface. Furthermore, 
		all elements in the list must be mutually comparable (that is, e1.compareTo(e2) 
		must not throw a ClassCastException for any elements e1 and e2 in the list).
		This sort is guaranteed to be stable: equal elements will not be reordered as a result of the sort.


		=================== important =================
		The specified list must be modifiable, but need not be resizable.
		Implementation note: This implementation is a stable, adaptive, 
		iterative mergesort that requires far fewer than n lg(n) comparisons when the input array is partially sorted, 
		while offering the performance of a traditional mergesort when the input array is randomly ordered. If the input array is nearly sorted,
		the implementation requires approximately n comparisons. 
		Temporary storage requirements vary from a small constant for nearly sorted input arrays to n/2 object references for randomly
		ordered input arrays.
		===============================================

		The implementation takes equal advantage of ascending and descending order in its input array, 
		and can take advantage of ascending and descending order in different parts of the same input array. 
		It is well-suited to merging two or more sorted arrays: simply concatenate the arrays and sort the resulting array.

		The implementation was adapted from Tim Peters's list sort for Python ( TimSort). 
		It uses techiques from Peter McIlroy's "Optimistic Sorting and Information Theoretic Complexity", 
		in Proceedings of the Fourth Annual ACM-SIAM Symposium on Discrete Algorithms, pp 467-474, January 1993.

		This implementation dumps the specified list into an array, sorts the array,
		and iterates over the list resetting each element from the corresponding position in the array. 
		This avoids the n2 log(n) performance that would result from attempting to sort a linked list in place.
		*/
		Collections.sort(hex);
		// result after sorting: [30, 3A, 8, FF]
		// Numbers before letters, uppercase before lowercase
		// special symbol like $???
		System.out.println(hex);

		int y = Collections.binarySearch(hex, "4F");
		System.out.println(y);
		
		// try printing an array directly
		int[] inte = {1,2,3,4,5};
		// not working, hashcode returned
		System.out.println(inte);
		// use for loop
		for(int i : inte) System.out.println(i);
	}

}
