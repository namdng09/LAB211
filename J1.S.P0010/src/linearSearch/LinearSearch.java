/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linearSearch;

import java.util.Random;

/**
 *
 * @author DELL VOSTRO 5630
 */
public class LinearSearch {
    public static void searchNumber(int[] array, int searchValue) {
        boolean flag = false;
        for (int i = 0; i < array.length; i++) {
            if (searchValue == array[i]) {
                System.out.format("Found %d at index: %d", searchValue, i);
                flag = true;
                break;
            }
        }
        if (!flag) {
            System.out.println("Not Found the search value!");
        }
    }
    
    public static void getRandomNumberInRange(int[] array) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(array.length);
        }
    }
    
    public static void displayAraay (String message, int[] array) {
        System.out.print(message);
        for (int i = 0; i < array.length; i++) {
            if (i == 0) {
                System.out.print("[" + array[i] + ", ");
            }else if (i == array.length - 1) {
                System.out.print(array[i] + "]\n");
            }else {
                System.out.print(array[i] + ", ");
            }
        }
    }
}
