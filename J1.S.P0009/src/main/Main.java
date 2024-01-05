/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import algorithm.Fibonacci;

/**
 *
 * @author DELL VOSTRO 5630
 */
public class Main {
    //the main of the class
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.print(Fibonacci.fibonacci(i) + ", ");
        }
    }
}
