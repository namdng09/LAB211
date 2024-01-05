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
     * This function use recursion method to find Fibonacci sequence 
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
    
    public static int fibonacci2(int number, int lower, int higher, int position) {
        System.out.print(higher + " ");
        System.out.println("index: " + position);
        if (number < 1) {
            return higher;
        }
        return fibonacci2(number - 1, higher, higher + lower, position + 1);
    }
}
