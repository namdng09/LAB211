/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import model.BaseConvert;
import view.Input;

/**
 *
 * @author DELL VOSTRO 5630
 */
public class MainForm extends Form{

    /**
     *
     * @return
     */
    @Override
    public STATUS setup() {
        Input inputObject = new Input();
        int original = inputObject.inputBase("Choose the original base number: ");
        int convert = inputObject.inputBase("Choose the convert base number: ");

        BaseConvert converter = null;
        try {
            converter = new BaseConvert(original, convert);
        } catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage());
        }
        
        String number = null;
        while (true) {
            try {
                number = inputObject.inputConvertNumber("Enter the number: ");
                break;
            } catch (IOException e) {
                System.out.println("ERROR: " + e.getMessage());
            }
        }
        
        try {
            System.out.println(number + " (" + converter.getOriginBase() + ") = " + converter.convert(number) + " (" + converter.getConvertBase() + ")");
        } catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage());
        }
        
        int option = 0;        
        while (true) {
            try {
                option = inputObject.inputYesNoOption(
                        "Do you want to continue, YES/NO (1/0): ");
                break;
            } catch (Exception e) {
                System.out.println("ERROR: " + e.getMessage());
            }
        }

        switch (option) {
            case Input.YES_OPTION:
                return STATUS.CONTINUE;
            case Input.NO_OPTION:
                return STATUS.EXIT;
        }

        return STATUS.CONTINUE;
    }

    
}
