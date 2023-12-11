/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 *
 * @author DELL VOSTRO 5630
 */
public class Input {
    public static BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    public static int inputInteger (String msg, int MIN, int MAX) throws Exception {
        int input;
        Scanner sc = new Scanner(System.in);
        while(true) {            
            System.out.println(msg);
            try {
                input = sc.nextInt();
                
                if (!isPosDecimalNum("" + input)) {
                    System.out.format("Input = %d is not Positive Decimal Number", input);
                } else if ((input < MIN) || (input > MAX)) {
                    System.out.format("Input is out of range, input = %d, range = [%d, %d]", input, MIN, MAX);
                } else {
                    break;
                }
            } catch (Exception e) {
                System.out.print("Invalid Number!!");
                sc.nextLine();
            }
            System.out.println();
        }
        return input;
    }
    
    private static boolean isPosDecimalNum (String input) {
        try {
            int number = Integer.parseInt(input);
            return (int) number > 0;
        } catch (NumberFormatException e) {
            return false;
        }
    }
    
}
