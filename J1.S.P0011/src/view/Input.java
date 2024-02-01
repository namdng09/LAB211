/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import com.sun.glass.ui.SystemClipboard;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author DELL VOSTRO 5630
 */
public class Input {
    public final static int YES_OPTION = 1;
    public final static int NO_OPTION = 0;
    
    private enum BASE_FORM{
        BINARY,
        DECIMAL,
        HEXIMAL;
    }
    
    private Scanner scanner = new Scanner(System.in);
    
    public int inputInteger(String message, int min, int max) throws Exception{
        System.out.print(message);
        
        int inputNumber = Integer.parseInt(scanner.nextLine());
        
        if (inputNumber < min || inputNumber > max) {
            throw new Exception(String.format(
                    "The '%d' number is out of range [%d, %d]!", 
                    inputNumber, min, max));
        }
        
        return inputNumber;
    }
    
    public int inputBase(String message) {
        BASE_FORM[] bases = BASE_FORM.values();
        this._displayMenu(bases);
        
        BASE_FORM base;
        while (true) {
            try {
                base = bases[inputInteger(message, 1, bases.length) - 1];
                break;
            } catch (Exception e) {
                System.out.println("ERROR: " + e.getMessage());
            }
        }
        
        switch (base) {
            case BINARY:
                return 2;
            case DECIMAL:
                return 10;
            case HEXIMAL:
                return 16;
        }
        return -1;
    }
    
    private void _displayMenu(BASE_FORM[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(i+1 + ". " + array[i]);
        }
    }
    
    public int inputYesNoOption(String message) throws Exception{
        return inputInteger(message, NO_OPTION, YES_OPTION);
    }
    
    public String inputConvertNumber(String message) throws IOException{
        System.out.println(message);
        return scanner.nextLine();
    }
}
