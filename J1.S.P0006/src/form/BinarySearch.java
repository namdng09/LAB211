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
    /**
     * This function use to search value by using binary search.
     * @param array the array to find out
     * @param number the search value
     * @param leftIndex the left index of element in array
     * @param rightIndex the right index of element in array
     * @return 
     */
    public static int binarySearch(int[] array, int number, int leftIndex, int rightIndex) {
        if (!isSortAscending(array)) {
            System.out.println("Array is not sorted. "
                    + "Binary search may not work correctly.");
            return -1;
        }
        //Get the middle elements by index
        if (rightIndex >= leftIndex) {
            int midIndex = leftIndex + (rightIndex - leftIndex) / 2;
            
            if (array[midIndex] == number) {
                return midIndex;
            }else if (array[midIndex] < number) {
                return binarySearch(array, number, midIndex + 1, rightIndex);
            }else {
                return binarySearch(array, number, leftIndex, midIndex - 1);
            }
        }else {
            //Not found return -1;
            return -1;
        }
        
    }
    /**
     * This function checks if an array is sorted
     * @param array the array that needs checking
     * @return 
     */
    private static boolean isSortAscending(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] > array[i+1]) {
                return false;
            }
        }
        return true;
    }
//    public static int binarySearch (int[] array, int left_index, int right_index, int searched_value) {
//        if (left_index > right_index) {
//            return -1;
//        }
//        int mid_index = (left_index + right_index) / 2;
//        
//        if (searched_value == array[mid_index]) {
//            return mid_index;
//        }else if (array[mid_index] > searched_value) {
//            return binarySearch(array, left_index, mid_index - 1, searched_value);
//        }else {
//            return binarySearch(array, mid_index + 1, right_index, searched_value);
//        }
//    }
}
