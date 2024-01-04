/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package input;

import java.util.Scanner;

/**
 *
 * @author DELL VOSTRO 5630
 */
public class Input {
    /**
     * This function use to get a Positive Number from user input.
     * @param message
     * @param error
     * @param MIN
     * @param MAX
     * @return 
     */
    public static int getInteger (String message, String error, int MIN, int MAX) {
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
    
}
