/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.BaseConvert;
import view.NumberSystemView;

/**
 *
 * @author DELL VOSTRO 5630
 */
public class MainForm extends Form{

    NumberSystemView view = new NumberSystemView();
    BaseConvert converter = null;
    
    @Override
    public STATUS setup() {
        int original = view.inputBaseNumber("Choose original Base: ");
        int convert = view.inputBaseNumber("Choose convert Base: ");
        
        converter = new BaseConvert(original, convert);
        
        String convertNumber = view.inputConvertNumber("Enter number: ", converter.getOriginBase());
        
        System.out.println(converter.convert(convertNumber));
        
        return STATUS.EXIT;
    }
    
}
