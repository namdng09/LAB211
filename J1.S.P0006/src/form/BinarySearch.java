/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package form;

/**
 *
 * @author DELL VOSTRO 5630
 */
public class BinarySearch {
    public static int binarySearch (int[] array, int left_index, int right_index, int searched_value) {
        if (left_index > right_index) {
            return -1;
        }
        int mid_index = (left_index + right_index) / 2;
        
        if (searched_value == array[mid_index]) {
            return mid_index;
        }else if (array[mid_index] > searched_value) {
            return binarySearch(array, left_index, mid_index - 1, searched_value);
        }else {
            return binarySearch(array, mid_index + 1, right_index, searched_value);
        }
    }
}
