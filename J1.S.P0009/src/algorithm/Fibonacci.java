/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithm;

/**
 *
 * @author DELL VOSTRO 5630
 */
public class Fibonacci {
    /**
     * This function use recursion method to find sequence Fibonacci
     * @param number the number of the sequences
     * @return 
     */
    public static int fibonacci(int number) {
        if (number == 0) {
            return 0;
        }else if (number == 1) {
            return 1;
        }else {
            return fibonacci(number - 1) + fibonacci(number - 2);
        }
    }
}
