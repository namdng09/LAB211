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
public class SelectionSort {
    /**
    * This method fills the given integer array with random numbers 
    * in the range [0, array.length].
    *
    * @param array The array to be filled with random numbers.
    */
    public static void getRandomNumberInRange(int[] array) {
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
    public static void displayAraay (String message, int[] array) {
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
     * This method sorts array in ascending order using Selection Sort algorithm.
     * @param array the integer array to be sorted.
     */
    public static void sortArray(int[] array) {
        // Iterate through each element in array
        for (int i = 0; i < array.length - 1; i++) {
            // Assume this current index is the position of the minimum element
            int minimalElement = i;
            // Iterate through each elements of unsorted part of array to find minimum element
            for (int j = i + 1; j < array.length; j++) {
                // If a smaller element is found, update the index of the minimum element
                if (array[minimalElement] > array[j]) {
                    minimalElement = j;
                }
            }
            // Swap the current element with the found minimum element
            swapElementsArray(array, array[i], array[minimalElement]);
        }
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
}
