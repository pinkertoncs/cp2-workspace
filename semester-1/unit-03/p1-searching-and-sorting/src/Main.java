/*
 * Name:
 * Assignment:
 * Collaborators:
 */

import java.util.concurrent.TimeUnit;
import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        

        //
        // define a double array and test each function of ArrayUtils
        // add your code here
        //
    	
        //---------------------------------------------------------------------------------------
        // compare your binary search to Java's built-in Array.binSearch
        //---------------------------------------------------------------------------------------
    	
        long startTime, endTime;

        double[] binsearch_array = new double[]{2,4,5,6,7,8,19,22,37,100,134,289, 954};

        startTime = System.nanoTime();
        int idx = ArrayUtils.binarySearch(binsearch_array, 134);
        endTime = System.nanoTime();
        System.out.println("ArrayUtils.binarySearch @ index: " + idx + " took:" + (endTime - startTime));

        startTime = System.nanoTime();
        idx = Arrays.binarySearch(binsearch_array,134);
        endTime = System.nanoTime();
        System.out.println("Arrays.binarySearch @ index: " + idx + " took:" + (endTime - startTime));
        
        /*
        * Question: Which one is faster? Why do you think one is faster than the other?
        * 
        * Answer:
        * 
        */
         
    }
}