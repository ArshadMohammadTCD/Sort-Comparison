// -------------------------------------------------------------------------

/**
 *  This class contains static methods that implementing sorting of an array of numbers
 *  using different sort algorithms.
 *
 *  @author
 *  @version HT 2020
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;


/**
 * This code is influenced by Robert Sedgewicks and Kevin Wayne Algorithms 4th edition book
 * or the recommended reading in the module.
 *
 */


 class SortComparison {
    /**
     * Sorts an array of doubles using InsertionSort.
     * This method is static, thus it can be called as SortComparison.sort(a)
     * @param a: An unsorted array of doubles.
     * @return array sorted in ascending order.
     *
     */
    static double [] insertionSort (double a[])
    {
    	int N = a.length;

    	for (int i = 1; i < N; i++)
    	{
    		for(int j = i; j > 0 && a[j] < a[j-1]; j-- ) {
    			exch(a, j, j-1);
    		}
    	}
        return a;
   
        //todo: implement the sort
    }//end insertionsort

    /**
     *
     * @param a the double array
     * @param i location 1 within the array
     * @param j location 2 within the array
     *
     * This method swaps i and j
     */
    private static void exch(double[] a, int i, int j) {
        double swap = a[i];
        a[i] = a[j];
        a[j] = swap;
    }
    

	    /**
     * Sorts an array of doubles using Selection Sort.
     * This method is static, thus it can be called as SortComparison.sort(a)
     * @param a: An unsorted array of doubles.
     * @return array sorted in ascending order
     *
     */
    static double [] selectionSort (double a[]){ {
        int n = a.length;
        for (int i = 0; i < n; i++) {
            int min = i;
            for (int j = i+1; j < n; j++) {
                if (less(a[j], a[min])) min = j;
            }
            exch(a, i, min);
        }
        return a;
    }
    

    
    	
         //todo: implement the sort

    }//end selectionsort

    /**
     *
     * @param v value one
     * @param w value two
     * @return  if value is one is less than value two send true other wise false.
     */
    private static boolean less(double v, double w) {
        if (v < w) {        
        	return true;
        }
        return false;
    }

    /** partition the subarray a[lo - - hi] so that a[lo - - j-1] <= a[j] <= a[j+1 - - hi]
     *  and return the index j.
     *
     * @param a an array to be partitioned
     * @param lo lower bound of sub array
     * @param hi upper bound of sub array
     * @return return index j
     */
    
    
    private static int partition(double[] a, int lo, int hi) {
        int i = lo;
        int j = hi + 1;
        double v = a[lo];
        while (true) { 

            // find item on lo to swap
            while (less(a[++i], v)) {
                if (i == hi) break;
            }

            // find item on hi to swap
            while (less(v, a[--j])) {
//                if (j == lo) break;      // redundant since a[lo] acts as sentinel
            }

            // check if pointers cross
            if (i >= j) break;

            exch(a, i, j);
        }

        // put partitioning item v at a[j]
        exch(a, lo, j);

        // now, a[lo .. j-1] <= a[j] <= a[j+1 .. hi]
        return j;
    }
    /**
     * Sorts an array of doubles using Quick Sort.
     * This method is static, thus it can be called as SortComparison.sort(a)
     * @param a: An unsorted array of doubles.
     * @return array sorted in ascending order
     *
     */
    static double [] quickSort(double a[]) {
    	int lo = 0;
    	int hi = a.length - 1;
    	return quickSortRecursive(a, lo , hi);
    	
    }

    /**
     *
     * @param a double array a
     * @param lo lower bound location of array
     * @param hi higher bound location of array
     * @return returns a double array that is partially sorted between upper and lower bound
     */
    static double [] quickSortRecursive (double a[], int lo, int hi){
    	

    	
        if (hi <= lo) 
        { 
        	return a;
        }
        int j = partition(a, lo, hi);
        quickSortRecursive(a, lo, j-1);
        quickSortRecursive(a, j+1, hi);
        return a;
		 //todo: implement the sort

    }//end quicksort
//
    /**
     * Sorts an array of doubles using Merge Sort.
     * This method is static, thus it can be called as SortComparison.sort(a)
     * @param a: An unsorted array of doubles.
     * @return array sorted in ascending order
     *
     */
    /**
     * Sorts an array of doubles using iterative implementation of Merge Sort.
     * This method is static, thus it can be called as SortComparison.sort(a)
     *
     * @param a: An unsorted array of doubles.
     * @return after the method returns, the array must be in ascending sorted order.
     */

    public static double[] mergeSortIterative(double[] a) {
        int n = a.length;
        double[] aux = new double[n];
        for (int len = 1; len < n; len *= 2) {
            for (int lo = 0; lo < n-len; lo += len+len) {
                int mid  = lo+len-1;
                int hi = Math.min(lo+len+len-1, n-1);
                merge(a, aux, lo, mid, hi);
            }
        }
        return a;
    }

    /**
     * Sorts an array of doubles using recursive implementation of Merge Sort.
     * This method is static, thus it can be called as SortComparison.sort(a)
     *
     * @param a: An unsorted array of doubles.
     * @return after the method returns, the array must be in ascending sorted order.
     */


     public static double[] mergeSortRecursive(double[] a) {
        double[] aux = new double[a.length];
        return mergeSortRecursive(a, aux, 0, a.length-1);
    }

    /**
     * This merges the
     * @param a array to be sorted
     * @param aux auxillary array to help sort
     * @param lo lower bound
     * @param mid mid point
     * @param hi upper bound
     *
     */

    private static void merge(double[] a, double[] aux, int lo, int mid, int hi) {
        // precondition: a[lo .. mid] and a[mid+1 .. hi] are sorted subarrays

        // copy to aux[]
        for (int k = lo; k <= hi; k++) {
            aux[k] = a[k]; 
        }

        // merge back to a[]
        int i = lo, j = mid+1;
        for (int k = lo; k <= hi; k++) {
            if      (i > mid)              a[k] = aux[j++];
            else if (j > hi)               a[k] = aux[i++];
            else if (less(aux[j], aux[i])) a[k] = aux[j++];
            else                           a[k] = aux[i++];
        }

        // postcondition: a[lo .. hi] is sorted
//        assert isSorted(a, lo, hi);
    }

    // mergesort a[lo..hi] using auxiliary array aux[lo..hi]

     /**
      *
      * @param a   array to be sorted
      * @param aux auxillary array
      * @param lo  lower bound of subarray to be sorted
      * @param hi  upper bound of subarray to be sorted
      * @return a sorted array
      */
    private static double[] mergeSortRecursive(double[] a, double[] aux, int lo, int hi) {
        if (hi <= lo) return a;
        int mid = lo + (hi - lo) / 2;
        mergeSortRecursive(a, aux, lo, mid);
        mergeSortRecursive(a, aux, mid + 1, hi);
        merge(a, aux, lo, mid, hi);
		return a;
    }
			//end class
 }
