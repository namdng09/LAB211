/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import utility.Validation;

/**
 *
 * @author DELL VOSTRO 5630
 */
public class NumberSystemView {
    private Validation input = new Validation();
    
    private enum BASE_FORM {
        BINARY,
        DECIMAL,
        HEXIMAL;
    }
    
    private void displayMenu(BASE_FORM[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(String.valueOf(i + 1) + ". " + array[i]);
        }
    }
    
    public int inputBaseNumber(String message) {
        BASE_FORM[] bases = BASE_FORM.values();
        this.displayMenu(bases);
        BASE_FORM base;
        
        while (true) {
            try {
                base = bases[input.inputInteger(message, 1, bases.length) - 1];
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
    
    public String inputConvertNumber(String message, int originBase) {
        String number = "";
        System.out.println(message);
        while (true) {
            try {
                number = input.inputValidNumber(originBase);
                break;
            } catch (Exception e) {
                System.out.println("ERROR: " + e.getMessage());
            }
        }
        return number;
    }
}
