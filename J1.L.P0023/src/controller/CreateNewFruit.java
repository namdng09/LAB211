/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.manager.FruitManager;
import view.FruitManagementView;

/**
 *
 * @author namdng09
 */
public class CreateNewFruit extends Form{
    FruitManagementView view = new FruitManagementView();

    @Override
    public STATUS_PROGRAM setup() {
        FruitManager manager = FruitManager.getInstance();
        try {
            manager.insert(view.inputFruit("---------- Input Fruit ----------"));
        } catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage());
        }
        
        int choice = view.inputYesNoOption("Do you want to continue YES/NO (1/0)?: ");
        switch (choice) {
            case FruitManagementView.YES_OPTION:
                return STATUS_PROGRAM.CONTINUE_LOOP;
            case FruitManagementView.NO_OPTION:
                return STATUS_PROGRAM.EXIT_LOOP;
        }
        
        return STATUS_PROGRAM.EXIT_LOOP;
    }
    
}
