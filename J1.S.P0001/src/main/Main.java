/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import bubbleSort.BubbleSort;
import input.Input;

/**
 *
 * @author DELL VOSTRO 5630
 */
public class Main {
    
    public static void main(String[] args) {
        int sizeOfArray = Input.getPositiveNumber("Enter number of array:",
                "Size of array must be Postive Decimal Number", 1, Integer.MAX_VALUE);
        int[] array = new int[sizeOfArray];
        //Generate random interger in bumber range for each element
        BubbleSort.generateNumberInRange(array);
        //Display array before sorting
        BubbleSort.displayArray("Unsorted array: ", array);
        //Sort the array
        BubbleSort.sortedArray(array);
        //Display array after sorting
        System.out.println();
        BubbleSort.displayArray("Sorted array: ", array);
    }
}
