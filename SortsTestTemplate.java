import java.util.Arrays;
import java.util.Collections;
/**
	This program is a	test driver for a programs that sorts 	
	an array of integers and return a long that contains the number of key comparisons
   done by the sorting algorithm.
*/
public class SortsTestTemplate	{		
	
	public static void main(String[]	args)	 {	
      int[] a= {10,1,2,3,4,5,6,7,8,9, 5, 78, 3, 2, 5, 7, 2, 546, 6, 23, -5, -6, 23, 324, 7, 34, 2,65, 3, 4, 14, 22, -3}; 
  		int[] temp	= a.clone();
		System.out.println("test array to sort:  " + Arrays.toString(a));
	   long numComp = Sorts.insertSort (temp);
		System.out.println("Sorted by insertion sort: ");
		System.out.println(Arrays.toString(temp));
      System.out.println("# of comparisons in insertion sort:  " + numComp);
      System.out.println();

	
		temp	= a.clone();
		System.out.println("test array to sort:  " + Arrays.toString(a));
	   numComp = Sorts.selectSort (temp);
		System.out.println("Sorted by selection sort: ");
		System.out.println(Arrays.toString(temp));
      System.out.println("# of comparisons in selection sort:  " + numComp);
      System.out.println();

		temp = a.clone();
		System.out.println("test array to sort:  " + Arrays.toString(a));
		numComp	= Sorts.mergeSort(temp);
		System.out.println("Sorted by merge sort: ");
      System.out.println(Arrays.toString(temp));
		System.out.println("# of comparisons by mergesort is = " +	numComp);
		System.out.println();

                System.out.println("TESTING MERGE FUNCTION: ");
                int[] arr1 = {1, 3, 5, 7, 9, 11, 12, 15};
                int[] arr2 = { 2, 4, 6, 8, 10};
                System.out.println(Arrays.toString(Sorts.merge(arr1, arr2)));
	}
}
