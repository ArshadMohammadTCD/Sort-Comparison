import static org.junit.Assert.assertEquals;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

//-------------------------------------------------------------------------
/**
 *  Test class for SortComparison.java
 *
 *  @ Arshad Mohammed
 *  1000 random numbers
 * Time taken to do insertionSort for 1000 random numbers : 5.11ms
 * Time taken to do quickSort for 1000 random numbers : 5.24ms
 * Time taken to do selectionSort for 1000 random numbers : 4.75ms
 * Time taken to do mergeSortIterative for 1000 random numbers : 0.65ms
 * Time taken to do mergeSortRecursive for 1000 random numbers : 0.31ms
 *
 * 1000 numbers with duplicates
 * Time taken to do insertionSort for 1000 random numbers with duplicates : 0.36ms
 * Time taken to do quickSort for 1000 random numbers with duplicates : 5.40ms
 * Time taken to do selectionSort for 1000 random numbers with duplicates : 0.46ms
 * Time taken to do mergeSortIterative for 1000 random numbers with duplicates : 0.18ms
 * Time taken to do mergeSortRecursive for 1000 random numbers with duplicates : 0.18ms
 *
 * 10000 numbers
 * Time taken to do insertionSort for 10000 random numbers : 27.01ms
 * Time taken to do quickSort for 10000 random numbers : 13.51ms
 * Time taken to do selectionSort for 10000 random numbers : 27.67ms
 * Time taken to do mergeSortIterative for 10000 random numbers : 0.89ms
 * Time taken to do mergeSortRecursive for 10000 random numbers : 0.38ms
 *
 * 1000 sorted numbers
 * Time taken to do insertionSort for 1000 sorted numbers : 0.002ms
 * Time taken to do quickSort for 1000 sorted numbers : 0.50ms
 * Time taken to do selectionSort for 1000 sorted numbers : 0.31ms
 * Time taken to do mergeSortIterative for 1000 sorted numbers : 0.09ms
 * Time taken to do mergeSortRecursive for 1000 sorted numbers : 0.04ms
 *
 * 1000 nearly sorted numbers
 * Time taken to do insertionSort for 1000 nearly sorted numbers : 0.041ms
 * Time taken to do quickSort for 1000 nearly sorted numbers : 0.38ms
 * Time taken to do selectionSort for 1000 nearly sorted numbers : 0.39ms
 * Time taken to do mergeSortIterative for 1000 nearly sorted numbers : 0.09ms
 * Time taken to do mergeSortRecursive for 1000 nearly sorted numbers : 0.04ms
 *
 * 1000 reversed numbers
 * Time taken to do insertionSort for 1000 nearly sorted numbers : 0.449ms
 * Time taken to do quickSort for 1000 reversed numbers : 0.33ms
 * Time taken to do selectionSort for 1000 reversed numbers : 0.26ms
 * Time taken to do mergeSortIterative for 1000 reversed numbers : 0.09ms
 * Time taken to do mergeSortRecursive for 1000 reversed numbers : 0.04ms
 *
 * Process finished with exit code 0
 *  @version HT 2020
 */
@RunWith(JUnit4.class)
public class SortComparisonTest
{
    //~ Constructor ........................................................
    @Test
    public void testConstructor()
    {
        new SortComparison();
    }

    //~ Public Methods ........................................................
    @Test
	/**
	 * Testing insertion sort by making multiple different arrays with different layouts and seeing the outcome is as expected
	 */
    public void testInsertionSort() {
    	double array[] = {10.6, 20.5, 2.9};  
    	double sortedArray[] = SortComparison.insertionSort(array);
    	assertEquals("insertion Sort with 3 doubles", Arrays.toString(sortedArray), "[2.9, 10.6, 20.5]" );
    	double array1[] = {5.0, 10.0};
    	double sortedArray1[] = SortComparison.insertionSort(array1); 
    	assertEquals("insertion Sort with 2 doubles that is already sorted", Arrays.toString(sortedArray1), "[5.0, 10.0]");
    	double array2[] = {20};
    	double sortedArray2[] = SortComparison.insertionSort(array2);
    	assertEquals("insertion Sort with 1 double that is already sorted", Arrays.toString(sortedArray2), "[20.0]");
     	
    	double array3[] = {200, 900, 500, 100, 200};
    	double sortedArray3[] = SortComparison.insertionSort(array3);
    	assertEquals("insertion sort with 5 doubles that has duplicates", Arrays.toString(sortedArray3), "[100.0, 200.0, 200.0, 500.0, 900.0]");
    	
    }
    
    @Test
	/**
	 * Testing mergesort recursive by making multiple different arrays with different layouts and seeing the outcome is as expected
	 */
    public void testMergeSortRecursive() {
    	double array[] = {10.6, 20.5, 2.9};  
    	double sortedArray[] = SortComparison.mergeSortRecursive(array);
    	assertEquals(" mergesort recursive with 3 doubles", Arrays.toString(sortedArray), "[2.9, 10.6, 20.5]" );
    	double array1[] = {5.0, 10.0};
    	double sortedArray1[] = SortComparison.mergeSortRecursive(array1); 
    	assertEquals(" mergessort recursive with 2 doubles that is already sorted", Arrays.toString(sortedArray1), "[5.0, 10.0]");
    	double array2[] = {20};
    	double sortedArray2[] = SortComparison.mergeSortRecursive(array2);
    	assertEquals("mergessort recursive with 1 double that is already sorted", Arrays.toString(sortedArray2), "[20.0]");
     	
    	double array3[] = {200, 900, 500, 100, 200};
    	double sortedArray3[] = SortComparison.mergeSortRecursive(array3);
    	assertEquals("mergesort recursive with 5 doubles that has duplicates", Arrays.toString(sortedArray3), "[100.0, 200.0, 200.0, 500.0, 900.0]");
    	
    	
    }
    
    @Test
	/**
	 * Testing mergesort iterative by making multiple different arrays with different layouts and seeing the outcome is as expected
	 */
    public void testMergeSortIterative() {
    	double array[] = {10.6, 20.5, 2.9};  
    	double sortedArray[] = SortComparison.mergeSortIterative(array);
    	assertEquals(" mergesort recursive with 3 doubles", Arrays.toString(sortedArray), "[2.9, 10.6, 20.5]" );
    	double array1[] = {5.0, 10.0};
    	double sortedArray1[] = SortComparison.mergeSortIterative(array1); 
    	assertEquals(" mergessort recursive with 2 doubles that is already sorted", Arrays.toString(sortedArray1), "[5.0, 10.0]");
    	double array2[] = {20};
    	double sortedArray2[] = SortComparison.mergeSortIterative(array2);
    	assertEquals("mergessort recursive with 1 double that is already sorted", Arrays.toString(sortedArray2), "[20.0]");
     	
    	double array3[] = {200, 900, 500, 100, 200};
    	double sortedArray3[] = SortComparison.mergeSortIterative(array3);
    	assertEquals("mergesort recursive with 5 doubles that has duplicates", Arrays.toString(sortedArray3), "[100.0, 200.0, 200.0, 500.0, 900.0]");

    }
    
    
    @Test
	/**
	 * Testing slectionsort by making multiple different arrays with different layouts and seeing the outcome is as expected
	 */
    public void testSelectionSort() {
    	double array[] = {10.6, 20.5, 2.9};  
    	double sortedArray[] = SortComparison.selectionSort(array);
    	assertEquals(" selection sort with 3 doubles", Arrays.toString(sortedArray), "[2.9, 10.6, 20.5]" );
    	double array1[] = {5.0, 10.0};
    	double sortedArray1[] = SortComparison.selectionSort(array1); 
    	assertEquals(" selection sort with 2 doubles that is already sorted", Arrays.toString(sortedArray1), "[5.0, 10.0]");
    	double array2[] = {20};
    	double sortedArray2[] = SortComparison.selectionSort(array2);
    	assertEquals("selection sort with 1 double that is already sorted", Arrays.toString(sortedArray2), "[20.0]");
     	
    	double array3[] = {200, 900, 500, 100, 200};
    	double sortedArray3[] = SortComparison.selectionSort(array3);
    	assertEquals("selection sort with 5 doubles that has duplicates", Arrays.toString(sortedArray3), "[100.0, 200.0, 200.0, 500.0, 900.0]");

    }

    @Test
	/**
	 * Testing quicksort by making multiple different arrays with different layouts and seeing the outcome is as expected
	 */


    public void testQuickSort() {
    	double array[] = {10.6, 20.5, 2.9};  
    	double sortedArray[] = SortComparison.quickSort(array);
    	assertEquals(" selection sort with 3 doubles", Arrays.toString(sortedArray), "[2.9, 10.6, 20.5]" );
    	double array1[] = {5.0, 10.0};
    	double sortedArray1[] = SortComparison.quickSort(array1); 
    	assertEquals(" selection sort with 2 doubles that is already sorted", Arrays.toString(sortedArray1), "[5.0, 10.0]");
    	double array2[] = {20};
    	double sortedArray2[] = SortComparison.quickSort(array2);
    	assertEquals("selection sort with 1 double that is already sorted", Arrays.toString(sortedArray2), "[20.0]");
     	
    	double array3[] = {200, 900, 500, 100, 200};
    	double sortedArray3[] = SortComparison.quickSort(array3);
    	assertEquals("selection sort with 5 doubles that has duplicates", Arrays.toString(sortedArray3), "[100.0, 200.0, 200.0, 500.0, 900.0]");
    	
    	double array4[] = {200.0, 900.1, 500.10, 13.90, 13.21, 200.55, 12093.3, 200.2};
    	double sortedArray4[] = SortComparison.quickSort(array4);
//    	System.out.println(Arrays.toString(sortedArray4));
    	assertEquals("selection sort with 5 doubles that has duplicates", Arrays.toString(sortedArray4),"[13.21, 13.9, 200.0, 200.2, 200.55, 500.1, 900.1, 12093.3]");

    }
    
    
    
    // ----------------------------------------------------------
    /**
     * Check that the methods work for empty arrays
     */

	/**
	 * Made empty arrays and tested each one of them with the sorting algorithms made previously
	 */
    @Test
    public void testEmpty()
    {
    	double array[] = {};
    	double sortedArray[] = SortComparison.insertionSort(array);
    	assertEquals("Insertion Sort with an empty array", Arrays.toString(sortedArray), "[]");
    	
    	double sortedArray1[] = SortComparison.selectionSort(array);
    	assertEquals("Selection Sort with an empty array", Arrays.toString(sortedArray1), "[]"); 
    	
    	double sortedArray2[] = SortComparison.mergeSortIterative(array);
    	assertEquals("MergeSort Iterative with an empty array", Arrays.toString(sortedArray2), "[]");
    	
    	double sortedArray3[] = SortComparison.mergeSortRecursive(array);
    	assertEquals("MergeSort recursive with an empty array", Arrays.toString(sortedArray3), "[]");
    	
    	double sortedArray4[] = SortComparison.quickSort(array);
    	assertEquals("QuickSort with an empty array", Arrays.toString(sortedArray4), "[]");   	
    	
    	
    	
    }
    

    // TODO: add more tests here. Each line of code and ech decision in Collinear.java should
    // be executed at least once from at least one test.

    // ----------------------------------------------------------
    /**
     *  Main Method.
     *  Use this main method to create the experiments needed to answer the experimental performance questions of this assignment.
     *	Basically I read in all the data and parse them. The string print functions do a pretty good job at explaining which ones im working on.
	 *  I parse the data into different double arrays then I print what I have. The results are at the top of this document.
     */
   
    public static void main(String[] args)
    {
		File a = new File("C:\\Users\\arsha\\IdeaProjects\\Assignment 1 Semester 1\\src\\numbers1000.txt");
		Scanner reader = null;
		try {
		    reader = new Scanner(a);
		} catch (FileNotFoundException e) {
		    // TODO Auto-generated catch block
		    e.printStackTrace();
		} 

		File b = new File("src/numbers1000Duplicates.txt");
		Scanner reader1 = null;
		try {
			reader1 = new Scanner(b);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		File c = new File("src/numbers10000.txt");
		Scanner reader2 = null;
		try {
			reader2 = new Scanner(c);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		File d = new File("src/numbersNearlyOrdered1000.txt");
		Scanner reader3 = null;
		try {
			reader3 = new Scanner(d);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		File f = new File("src/numbersReverse1000.txt");
		Scanner reader4 = null;
		try {
			reader4 = new Scanner(f);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		File g = new File("src/numbersSorted1000.txt");
		Scanner reader5 = null;
		try {
			reader5 = new Scanner(g);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		double[] thousandNumbers = new double[1000];
		double[] thousandNumbersDuplicates = new double[1000];
		double[] tenThousandNumbers = new double[10000];
		double[] thousandNumbersNearlyOrdered = new double[1000];
		double[] numbersReversed = new double[1000];
		double[] numbersSorted = new double[1000];

//
		for (int i = 0; i < 1000; i++) {
			thousandNumbers[i] = reader.nextDouble();
			thousandNumbersDuplicates[i] = reader1.nextDouble();
			thousandNumbersNearlyOrdered[i] = reader3.nextDouble();
			numbersReversed[i] = reader4.nextDouble();
			numbersSorted[i] = reader5.nextDouble();

//			System.out.println(thousandNumbers[i]);
		}

		for (int i = 0; i < 10000; i++){
			tenThousandNumbers[i] = reader2.nextDouble();
		}



//		System.out.println("Sorting using insertion sort for thousand random numbers");
		double[] sortedThousandNumbers = new double[1000];
		double start = System.nanoTime();
		sortedThousandNumbers = SortComparison.insertionSort(thousandNumbers);
		double end = System.nanoTime();
//		System.out.println(Arrays.toString(sortedThousandNumbers));
		System.out.println("\n1000 random numbers \nTime taken to do insertionSort for 1000 random numbers : " + String.format("%.2f",((end - start)/1000000)) + "ms");

		start = System.nanoTime();
		sortedThousandNumbers = SortComparison.quickSort(thousandNumbers);
		end = System.nanoTime();
		System.out.println("Time taken to do quickSort for 1000 random numbers : "+ String.format("%.2f",((end - start)/1000000)) + "ms");

		start = System.nanoTime();
		sortedThousandNumbers = SortComparison.selectionSort(thousandNumbers);
		end = System.nanoTime();
		System.out.println("Time taken to do selectionSort for 1000 random numbers : "+ String.format("%.2f",((end - start)/1000000)) + "ms");

		start = System.nanoTime();
		sortedThousandNumbers = SortComparison.mergeSortIterative(thousandNumbers);
		end = System.nanoTime();
		System.out.println("Time taken to do mergeSortIterative for 1000 random numbers : "+ String.format("%.2f",((end - start)/1000000)) + "ms");

		start = System.nanoTime();
		sortedThousandNumbers = SortComparison.mergeSortRecursive(thousandNumbers);
		end = System.nanoTime();
		System.out.println("Time taken to do mergeSortRecursive for 1000 random numbers : "+ String.format("%.2f",((end - start)/1000000)) + "ms");



		start = System.nanoTime();
		sortedThousandNumbers = SortComparison.insertionSort(thousandNumbersDuplicates);
		end = System.nanoTime();
//		System.out.println(Arrays.toString(sortedThousandNumbers));
		System.out.println("\n1000 numbers with duplicates\nTime taken to do insertionSort for 1000 random numbers with duplicates : " + String.format("%.2f",((end - start)/1000000)) + "ms");

		start = System.nanoTime();
		sortedThousandNumbers = SortComparison.quickSort(thousandNumbersDuplicates);
		end = System.nanoTime();
		System.out.println("Time taken to do quickSort for 1000 random numbers with duplicates : "+ String.format("%.2f",((end - start)/1000000)) + "ms");

		start = System.nanoTime();
		sortedThousandNumbers = SortComparison.selectionSort(thousandNumbersDuplicates);
		end = System.nanoTime();
		System.out.println("Time taken to do selectionSort for 1000 random numbers with duplicates : "+ String.format("%.2f",((end - start)/1000000)) + "ms");

		start = System.nanoTime();
		sortedThousandNumbers = SortComparison.mergeSortIterative(thousandNumbersDuplicates);
		end = System.nanoTime();
		System.out.println("Time taken to do mergeSortIterative for 1000 random numbers with duplicates : "+ String.format("%.2f",((end - start)/1000000)) + "ms");

		start = System.nanoTime();
		sortedThousandNumbers = SortComparison.mergeSortRecursive(thousandNumbersDuplicates);
		end = System.nanoTime();
		System.out.println("Time taken to do mergeSortRecursive for 1000 random numbers with duplicates : "+ String.format("%.2f",((end - start)/1000000)) + "ms");



		start = System.nanoTime();
		sortedThousandNumbers = SortComparison.insertionSort(tenThousandNumbers);
		end = System.nanoTime();
//		System.out.println(Arrays.toString(sortedThousandNumbers));
		System.out.println("\n10000 numbers \nTime taken to do insertionSort for 10000 random numbers : " + String.format("%.2f",((end - start)/1000000)) + "ms");

		start = System.nanoTime();
		sortedThousandNumbers = SortComparison.quickSort(tenThousandNumbers);
		end = System.nanoTime();
		System.out.println("Time taken to do quickSort for 10000 random numbers : "+ String.format("%.2f",((end - start)/1000000)) + "ms");

		start = System.nanoTime();
		sortedThousandNumbers = SortComparison.selectionSort(tenThousandNumbers);
		end = System.nanoTime();
		System.out.println("Time taken to do selectionSort for 10000 random numbers : "+ String.format("%.2f",((end - start)/1000000)) + "ms");

		start = System.nanoTime();
		sortedThousandNumbers = SortComparison.mergeSortIterative(tenThousandNumbers);
		end = System.nanoTime();
		System.out.println("Time taken to do mergeSortIterative for 10000 random numbers : "+ String.format("%.2f",((end - start)/1000000)) + "ms");

		start = System.nanoTime();
		sortedThousandNumbers = SortComparison.mergeSortRecursive(tenThousandNumbers);
		end = System.nanoTime();
		System.out.println("Time taken to do mergeSortRecursive for 10000 random numbers : "+ String.format("%.2f",((end - start)/1000000)) + "ms");




		start = System.nanoTime();
		sortedThousandNumbers = SortComparison.insertionSort(numbersSorted);
		end = System.nanoTime();
//		System.out.println(Arrays.toString(sortedThousandNumbers));
		System.out.println("\n1000 sorted numbers \nTime taken to do insertionSort for 1000 sorted numbers : " + String.format("%.3f",((end - start)/1000000)) + "ms");

		start = System.nanoTime();
		sortedThousandNumbers = SortComparison.quickSort(numbersSorted);
		end = System.nanoTime();
		System.out.println("Time taken to do quickSort for 1000 sorted numbers : "+ String.format("%.2f",((end - start)/1000000)) + "ms");

		start = System.nanoTime();
		sortedThousandNumbers = SortComparison.selectionSort(numbersSorted);
		end = System.nanoTime();
		System.out.println("Time taken to do selectionSort for 1000 sorted numbers : "+ String.format("%.2f",((end - start)/1000000)) + "ms");

		start = System.nanoTime();
		sortedThousandNumbers = SortComparison.mergeSortIterative(numbersSorted);
		end = System.nanoTime();
		System.out.println("Time taken to do mergeSortIterative for 1000 sorted numbers : "+ String.format("%.2f",((end - start)/1000000)) + "ms");

		start = System.nanoTime();
		sortedThousandNumbers = SortComparison.mergeSortRecursive(numbersSorted);
		end = System.nanoTime();
		System.out.println("Time taken to do mergeSortRecursive for 1000 sorted numbers : "+ String.format("%.2f",((end - start)/1000000)) + "ms");


		start = System.nanoTime();
		sortedThousandNumbers = SortComparison.insertionSort(thousandNumbersNearlyOrdered);
		end = System.nanoTime();
//		System.out.println(Arrays.toString(sortedThousandNumbers));
		System.out.println("\n1000 nearly sorted numbers \nTime taken to do insertionSort for 1000 nearly sorted numbers : " + String.format("%.3f",((end - start)/1000000)) + "ms");

		start = System.nanoTime();
		sortedThousandNumbers = SortComparison.quickSort(thousandNumbersNearlyOrdered);
		end = System.nanoTime();
		System.out.println("Time taken to do quickSort for 1000 nearly sorted numbers : "+ String.format("%.2f",((end - start)/1000000)) + "ms");

		start = System.nanoTime();
		sortedThousandNumbers = SortComparison.selectionSort(thousandNumbersNearlyOrdered);
		end = System.nanoTime();
		System.out.println("Time taken to do selectionSort for 1000 nearly sorted numbers : "+ String.format("%.2f",((end - start)/1000000)) + "ms");

		start = System.nanoTime();
		sortedThousandNumbers = SortComparison.mergeSortIterative(thousandNumbersNearlyOrdered);
		end = System.nanoTime();
		System.out.println("Time taken to do mergeSortIterative for 1000 nearly sorted numbers : "+ String.format("%.2f",((end - start)/1000000)) + "ms");

		start = System.nanoTime();
		sortedThousandNumbers = SortComparison.mergeSortRecursive(thousandNumbersNearlyOrdered);
		end = System.nanoTime();
		System.out.println("Time taken to do mergeSortRecursive for 1000 nearly sorted numbers : "+ String.format("%.2f",((end - start)/1000000)) + "ms");



		start = System.nanoTime();
		sortedThousandNumbers = SortComparison.insertionSort(numbersReversed);
		end = System.nanoTime();
//		System.out.println(Arrays.toString(sortedThousandNumbers));
		System.out.println("\n1000 reversed numbers \nTime taken to do insertionSort for 1000 nearly sorted numbers : " + String.format("%.3f",((end - start)/1000000)) + "ms");

		start = System.nanoTime();
		sortedThousandNumbers = SortComparison.quickSort(numbersReversed);
		end = System.nanoTime();
		System.out.println("Time taken to do quickSort for 1000 reversed numbers : "+ String.format("%.2f",((end - start)/1000000)) + "ms");

		start = System.nanoTime();
		sortedThousandNumbers = SortComparison.selectionSort(numbersReversed);
		end = System.nanoTime();
		System.out.println("Time taken to do selectionSort for 1000 reversed numbers : "+ String.format("%.2f",((end - start)/1000000)) + "ms");

		start = System.nanoTime();
		sortedThousandNumbers = SortComparison.mergeSortIterative(numbersReversed);
		end = System.nanoTime();
		System.out.println("Time taken to do mergeSortIterative for 1000 reversed numbers : "+ String.format("%.2f",((end - start)/1000000)) + "ms");

		start = System.nanoTime();
		sortedThousandNumbers = SortComparison.mergeSortRecursive(numbersReversed);
		end = System.nanoTime();
		System.out.println("Time taken to do mergeSortRecursive for 1000 reversed numbers : "+ String.format("%.2f",((end - start)/1000000)) + "ms");









//		System.out.println("Sorting using insertion sort for thousand numbers with duplicates");
//		double[] sortedThousandNumbersDuplicates = new double[1000];
//		start = System.currentTimeMillis();
//		sortedThousandNumbers = SortComparison.insertionSort(thousandNumbers);
//		end = System.currentTimeMillis();
//		System.out.println(Arrays.toString(sortedThousandNumbers));
//		System.out.println("Time taken to do insertionSort for 1000 numbers with duplicates:" + (end - start) + "ms");
//

		
    }
}

