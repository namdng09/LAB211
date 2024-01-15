/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithm;

import java.util.Random;

/**
 *
 * @author DELL VOSTRO 5630
 */
public class QuickSort {
    /**
    * This method fills the given integer array with random numbers 
    * in the range [0, array.length].
    *
    * @param array The array to be filled with random numbers.
    */
    private static void getRandomNumberInRange(int[] array) {
        Random random = new Random();
        // Iterate through each element in array
        for (int i = 0; i < array.length; i++) {
            // Assign the random integer to the current element in array
            array[i] = random.nextInt(array.length);
        }
    }
    
    /**
    * Displays the elements of the given integer array 
    * along with a custom message.
    *
    * @param message The message to be displayed before the array elements.
    * @param array   The integer array whose elements are to be displayed.
    */
    public static void displayArray (String message, int[] array) {
        // Print the custom message
        System.out.print(message);
        
        // Iterate through each element of the array
        for (int i = 0; i < array.length; i++) {
            // Check if the current element is the first one
            if (i == 0) {
                // Print the opening bracket with the current element in array
                System.out.print("[" + array[i] + ", ");
                
                // Check if the current element is the last one
            }else if (i == array.length - 1) {
                // Print the current element in array and closing bracket
                System.out.print(array[i] + "]\n");
                
                // For elements in between first and last one
            }else {
                // Print the current element follow by a comma and a space
                System.out.print(array[i] + ", ");
            }
        }
    }
    /**
     * This method creates an integer array with specified size and fills 
     * each elements with a random value.
     * @param size the size of array to be create
     * @return A new integer array with randomly generate values for each element
     */
    public static int[] createArrayByRandomNumber(int size) {
        // Initialize an array with the given size
        int[] array = new int[size];
        
        // Fill the array with random values
        getRandomNumberInRange(array);
        
        // Return the created array
        return array;
    }
    
    /**
     * This method swap 2 position of elements in array
     * @param array the array that to be swap 2 elements
     * @param firstIndex the index of the first elements use to swap
     * @param secondIndex the index of the second elements use to swap
     */
    private static void swapElementsArray(int[] array, int firstIndex, int secondIndex) {
        // Store the value of first element with the temporary variable
        int temp = array[firstIndex];
        // Assign the value of the second elememt to the first element
        array[firstIndex] = array[secondIndex];
        // Assign the value stored in temporary variable to the second element
        array[secondIndex] = temp;
    }
    /**
    * This method sorts array in ascending order using Selection Sort algorithm.
    * @param array the integer array to be sorted.
    */
    public static void sortArray(int[] array, int leftIndex, int rightIndex) {
        int pivotIndex = partitionArray(array, leftIndex, rightIndex);
        if (leftIndex < pivotIndex - 1) {
            sortArray(array, leftIndex, pivotIndex - 1);
        }
        if (pivotIndex < rightIndex) {
            sortArray(array, pivotIndex, rightIndex);
        }
    }
    /**
     * 
     * @param array
     * @param leftIndex
     * @param rightIndex
     * @return 
     */
    private static int partitionArray(int[] array, int leftIndex, int rightIndex) {
        int pivotValue = array[(leftIndex + rightIndex) / 2];
        while (leftIndex <= rightIndex) {
            while (array[leftIndex] < pivotValue) {                
                leftIndex++;
            }
            while (array[rightIndex] > pivotValue) {
                rightIndex--;
            }
            if (leftIndex <= rightIndex) {
                //Swap two elements by using temporary variable
                //swapElementsArray(array, leftIndex, rightIndex);
                int temp = array[leftIndex];
                array[leftIndex] = array[rightIndex];
                array[rightIndex] = temp;
                
                displayArray("s:", array);
                
                leftIndex++;
                rightIndex--;
            }
        }
        
        return leftIndex;
    }
}
