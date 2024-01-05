/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bubbleSort;

import java.util.Random;

/**
 *
 * @author DELL VOSTRO 5630
 */
public class BubbleSort {
    /**
     * 
     * @param array 
     */
    public static void generateNumberInRange (int[] array) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(array.length);
        }
    }
    
    public static void displayArray (String message,int[] array) {
        System.out.print(message);
        for (int i = 0; i < array.length; i++) {
            if (i == 0) {
                System.out.print("[" + array[i] + ", ");
            }else if (i == array.length - 1) {
                System.out.print(array[i] + "]");
            }else {
                System.out.print(array[i] + ", ");
            }
        }
    }
    
    public static void sortedArray (int[] array) {
        int temp = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j+1]) {
                    temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
    }
}
