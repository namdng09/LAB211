/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import algorithm.QuickSort;
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
        int[] array = QuickSort.createArrayByRandomNumber(sizeOfArray);
                
        //Display array before sorting
        QuickSort.displayAraay("Unsorted array: ", array);
        
        //Sort the array
        QuickSort.sortArray(array, 0, array.length - 1);
        
        //Display array after sorting
        QuickSort.displayAraay("Sorted array: ", array);
    }
}
