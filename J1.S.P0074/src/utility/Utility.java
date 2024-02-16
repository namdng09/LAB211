/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utility;

import java.util.Scanner;

/**
 *
 * @author DELL VOSTRO 5630
 */
public class Utility {
    private Scanner scanner = new Scanner(System.in);
    
    public int getInteger(String message, int min, int max) {
        int input;
        while (true) {
            System.out.print(message);
            try {
                input = Integer.parseInt(scanner.nextLine());
                if (input < min || input > max) {
                    throw new Exception(String.format(
                            "Invalid number, number must be in range [%d, %d]", 
                            min, max));
                } else {
                    break;
                }
            } catch (Exception e) {
                System.out.println("ERROR: " + e.getMessage());
            }
        }
        return input;
    }
    
    public double getDouble(String message) {
        double input;
        while (true) {
            System.out.print(message);
            try {
                input = Double.parseDouble(scanner.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("ERROR: " + e.getMessage());
            }
        }
        return input;
    }
    
    public void holdProgram() {
        System.out.print("Press enter to continue!");
        scanner.nextLine();
    }
}
