/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.OPTIONS;
import model.Fruit;
import utility.Utility;


/**
 *
 * @author namdng09
 */
public class FruitManagementView {
    private Utility utils = new Utility();
    
    public static final int YES_OPTION = 1;
    public static final int NO_OPTION = 0;
    
    public void displayMenu(OPTIONS[] options) {
        System.out.println("WELCOME TO STUDENT MANAGEMENT");
        for (OPTIONS option : options) {
            System.out.println(option.getKey() + ". " + option.getMessage());
        }
    }
    
    public Object inputOption(String message, Object[] options) {
        Object option;
        //
        option = options[utils.getInteger(message, 1, options.length) - 1];
        return option;
    }
    
    public Fruit inputFruit(String message) {
        System.out.println(message);
        return new Fruit(
                utils.getValidID("Enter the ID of fruit (FRxxx): "), 
                utils.getNameString("Enter the name of fruit: "), 
                utils.getDouble("Enter the price: "), 
                utils.getInteger("Enter the quantity: ", 0, 1000), 
                utils.getNameString("Enter the origin: "));
    }
    
    public int inputYesNoOption(String message){
        return utils.getInteger(message, FruitManagementView.NO_OPTION, FruitManagementView.YES_OPTION);
    }
}
