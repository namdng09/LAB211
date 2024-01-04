/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import input.Input;
import linearSearch.LinearSearch;

/**
 *
 * @author DELL VOSTRO 5630
 */
public class Main {
    private static final int MIN = 1;
    private static final int MAX = 50;
    
    public static void main(String[] args) {
        //Display a screen to ask users to enter a number of array and a search number. 
        int sizeOfArray = Input.getInteger("Enter number of array: ", 
                "Size of array must be Positive decimal number", MIN, MAX);
        
        //Display a screen to ask users to enter search value. 
        int searchValue = Input.getInteger("Enter search value: ", 
                "Search value must be Positive decimal number", 0, Integer.MAX_VALUE);
        
        //Generate random integer in number range for each array element.
        int[] array = new int[sizeOfArray];
        LinearSearch.getRandomNumberInRange(array);
        
        //Display the array
        LinearSearch.displayAraay("The array: ", array);
        
        //Display the index of search number in array.
        LinearSearch.searchNumber(array, searchValue);
    }
}
