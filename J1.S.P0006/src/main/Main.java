/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import form.BinarySearch;
import input.Input;
import java.util.Random;

/**
 *
 * @author DELL VOSTRO 5630
 */
public class Main {
    private static final int MIN_INT = 1;
    private static final int MAX_INT = 50;

    public static void main(String[] args) {
        
        //Display a screen to enter a number of array
        int sizeOfArray = Input.getPositiveNumber("Enter number of array: ", 
                "number of array must be positive decimal number", MIN_INT, MAX_INT);
        
        //Display a screen to ask input a positive decimal number
        int searchValue = Input.getPositiveNumber("Enter search value: ", 
                "Search value must be positive decimal number", 0, MAX_INT);
        
        //Generate random integer in number range for each array element.
        int[] array = new int[sizeOfArray];
        Input.generateNumberInRange(array);
        
        //Sort array
        Input.sortArray(array);
        
        //Display the sorted array 
        Input.displayArray(array);
        
        ////Display the index of search number in array.
        System.out.println(BinarySearch.binarySearch(array, 0, array.length-1, searchValue));
    }
}
