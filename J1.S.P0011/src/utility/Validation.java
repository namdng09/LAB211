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
public class Validation {
    private final String DIGITS = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private Scanner scanner = new Scanner(System.in);
    
    public int inputInteger(String message, int min, int max) throws NumberFormatException, Exception {
        System.out.print(message);
        
        int number = Integer.parseInt(scanner.nextLine());
        if (number < min || number > max) {
            throw new Exception(String.format("Invalid number, number must be in range [%d, %d]", min, max));
        }
        return number;
    }
    
    private boolean _isValidNumber(String number, int originBase) {
        for (int i = 0; i < number.length(); i++) {
            int digit = DIGITS.indexOf(number.charAt(i));
            if (digit < 0 || digit > originBase - 1) {
                return false;
            }
        }
        return true;
    }
    
    public String inputValidNumber(int originBase) throws Exception{
        String number = scanner.nextLine().toUpperCase();
        if (!_isValidNumber(number, originBase)) {
            throw new Exception(String.format(
                    "The number '%s' is not valid in base %d.", 
                    number, originBase));
        }
        return number;
    }
    
}
