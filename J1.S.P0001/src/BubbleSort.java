
import java.util.Random;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DELL VOSTRO 5630
 */
public class BubbleSort {
    public static void main(String[] args) {
        int num = getNumber("Enter the number of array: ");
        int[] array = createArray(num);
        System.out.print("Unsorted array: ");
        display(array);
        System.out.println();
        bubbleSort(array);
        System.out.println();
        System.out.print("Sorted array: ");
        display(array);
    }
    
    public static int getNumber(String str) {
        Scanner sc = new Scanner(System.in);
        double num = 0;
        
        do {          
            System.out.print(str);
            try {
                num = sc.nextDouble();
                if ((int)num <= 0) {
                    System.out.println("Invalid Number!!");
                }
            } catch (Exception e) {
                System.out.println("Invalid Number!!");
                sc.nextLine();
            }
        } while (!isPosDecimalNum("" + num));
        
        return (int) num;
    }
    
    public static boolean isPosDecimalNum (String input) {
        try {
            double number = Double.parseDouble(input);
            return (int) number > 0;
        } catch (NumberFormatException e) {
            return false;
        }
    }
    
    public static int[] createArray (int size_array) {
        Random rd = new Random();
        int[] array = new int[size_array];
        for (int i = 0; i < array.length; i++) {
            array[i] = rd.nextInt(100);
        }
        return array;
    }
    
    public static void display (int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (i == 0) {
                System.out.print("[" + array[i] + ", ");
            } else if (i == array.length - 1) {
                System.out.print(array[i] + "]");
            } else {
                System.out.print(array[i] + ", ");
            }
        }
    }
    
    public static void bubbleSort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                display(array);
                if (array[j] > array[j+1]) {
                    System.out.print("\t" + array[j] + " > " + array[j+1] + ", swap");
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }else if (array[j] < array[j+1]) {
                    System.out.print("\t" + array[j] + " < " + array[j+1] + ", ok");
                }else if (array[j] == array[j+1]) {
                    System.out.print("\t" + array[j] + " = " + array[j+1] + ", ok");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
