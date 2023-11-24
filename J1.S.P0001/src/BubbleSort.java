
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
        int size_array = getInt("Enter a positive decimal number: ");
        int[] array = createArray(size_array);
        System.out.print("Unsort array: ");
        display(array);
    }
    
    public static void bubbleSort(int[] array) {
        
    }
    
    public static int[] createArray (int size_array) {
        int[] array = new int[size_array];
        Random rd = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = rd.nextInt(100);
        }
        return array;
    } 
    
    public static void display(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            if (i == 0) {
                System.out.print("[" + arr[i] + ", ");
            } else if (i == arr.length - 1) {
                System.out.print(arr[i] + "]");
            }else {
                System.out.print(arr[i] + ", ");
            }
        }
    }
    
    public static int getInt(String string) {
        double number = 0;
        Scanner sc = new Scanner(System.in);
        do {            
            System.out.print(string);
            try {
                number = sc.nextDouble();
            } catch (Exception e) {
                System.out.println("Invalid number!!");
                sc.nextLine();
            }
        } while (number < 0 || !isDecimal("" + number));
        return (int) number;
    }
    
    public static boolean isDecimal(String number) {
        try {
            //convert string into a decimal number
            Double.parseDouble(number);
            return true;
        } catch (NumberFormatException e) {
            return false;
            //if exception catched, it does not decimal number
        }
    }
}
