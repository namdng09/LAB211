/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package input;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author DELL VOSTRO 5630
 */
public class Input {
    /**
     * This function use to get Positive Decimal Number from user input.
     * @param message
     * @param error
     * @param MIN
     * @param MAX
     * @return 
     */
    public static int getPositiveNumber (String message, String error, int MIN, int MAX) {
        Scanner scanner = new Scanner(System.in);
        while(true) {
            System.out.println(message);
            try {
                String input = scanner.nextLine();
                if (input.isEmpty()) {
                    System.out.println("Cannot left the blank!");
                }
                int number = Integer.parseInt(input);
                if (number < MIN || number > MAX) {
                    System.out.format("Number '%d' is out of range: [%d, %d]", number, MIN, MAX);
                } else {
                    return number;
                }
            } catch (Exception e) {
                System.err.println(error);
            }
        }
    }
    
    /**
     * Generate random integer in number range for each array element.
     * @param array
     */
    public static void generateNumberInRange (int []array) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(array.length);
        }
    }
    
    /**
     * Using Bubble sort to sort the array in ascending order
     * @param array
     */
    public static void sortArray (int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j+1]) {
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
    }
    
    /**
     * Display the array
     * @param array 
     */
    public static void displayArray(int[] array) {
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
