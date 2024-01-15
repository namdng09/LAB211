/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import algorithm.InsertionSort;
import input.Input;

/**
 *
 * @author DELL VOSTRO 5630
 */
public class Main {
    //the main entry point of the Java program
    public static void main(String[] args) {
        //Display a screen to ask users to enter a positive decimal number
        int sizeOfArray = Input.getPositiveNumber("Enter number of array:",
                "Please input a decimal positon number!", 1, Integer.MAX_VALUE);
        
        //Generate random integer in number range for each array element
        int[] array = InsertionSort.createArrayByRandomNumber(sizeOfArray);
                
        //Display array before sorting
        InsertionSort.displayArray("Unsorted array: ", array);
        
        //Sort the array
        InsertionSort.sortArrayUseRecursion(array, array.length);
        
        //Display array after sorting
        InsertionSort.displayArray("Sorted array: ", array);
    }
}
