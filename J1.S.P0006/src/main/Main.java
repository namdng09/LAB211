/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import DTO.Input;
import java.util.Random;

/**
 *
 * @author DELL VOSTRO 5630
 */
public class Main {
    public static final int MIN_INT = 1;
    public static final int MAX_INT = 50;

    
    public static void main(String[] args) throws Exception {
        int num = Input.inputInteger("Enter the number of array: ", MIN_INT, MAX_INT);
        int[] array = creatArray(num);
        int searchValue = Input.inputInteger("Enter search value: ", MIN_INT, MAX_INT);
        System.out.print("Sorted array: ");
        bubbleSort(array);
        display(array);
        int index = binarySearch(array, 0, array.length - 1, searchValue);
        if (index != -1) {
            System.out.format("\nFound %d at index: %d", searchValue, index);
        }else {
            System.out.println("Not Found!");
        }
    }
    
    public static int[] creatArray (int size_array) {
        int[] array = new int[size_array];
        Random rd = new Random();
        for (int i = 0; i < size_array; i++) {
            array[i] = rd.nextInt(10);
        }
        return array;
    }
    
    public static void display (int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (i == 0) {
                System.out.format("[%d, ", array[i]);
            }else if(i == array.length - 1) {
                System.out.format("%d]", array[i]);
            }else {
                System.out.format("%d, ", array[i]);
            }
        }
    }
    
    public static void bubbleSort (int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j+1]) {
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
    }
    
    public static int binarySearch (int[] array, int left_index, int right_index, int searched_value) {
        if (left_index > right_index) {
            return -1;
        }
        int mid_index = left_index  + ((right_index - left_index) / 2);
        
        if (searched_value == array[mid_index]) {
            return mid_index;
        }else if (array[mid_index] > searched_value) {
            return binarySearch(array, left_index, mid_index - 1, searched_value);
        }else {
            return binarySearch(array, mid_index + 1, right_index, searched_value);
        }
    }
}
