/*
 * Name:
 * Assignment:
 * Collaborators: 
 */

public class ArrayUtils {

    /*
    * performs a linear search on array and returns the first index of 
    * target in the array or -1 if not found
    */
    public static int linearSearch(double[] array, double target) {
        return -1;
    }
    
    /*
    * performs a binary search on array and returns the index of 
    * target in the array or -1 if not found
    */
    public static int binarySearch(double[] array, double target) {
        return -1;
    }
    
        
    /*
    * returns the minimum value of the array
    */
    public static double min(double[] array) {
        return -1;
    }
    
    /*
    * returns the maximum value of the array
    */
    public static double max(double[] array) {
        return -1;
    }
    
    /*
    * sort the array using bubblesort
    */
    public static void bubbleSort(double[] array){ 	
    }
        
    /*
    * sort the array using selectionsort
    */
    public static void selectionSort(double[] array){
    }
        
    /*
    * sort the array using insertionsort
    */
    public static void insertionSort(double[] array){
    }

    /*
    * sort the array using Merge sort
    */
    public static void mergeSort(double[] array) {
        mergeSortHelper(array, 0, array.length -1 );
    }

    /*
    * recursive helper function for mergeSort
    */
    private static void mergeSortHelper(double[] array, int low, int high) {
        if( low < high ) {
            int middle = (low + high) / 2;
            mergeSortHelper(array, low, middle);
            mergeSortHelper(array, middle+1, high);
            merge(array, low, middle, high);
        }
    }

    /*
    * merge the two halves of the array (low to middle) and (middle+1 to high)
    * in order
    */
    private static void merge(double[] array, int low, int middle, int high) {

        // copy array into a temp array

        // merge the two array halves into the temp array

        // copy temp into array
    }
 }   