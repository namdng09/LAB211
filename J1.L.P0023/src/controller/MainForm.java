/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import view.FruitManagementView;

/**
 *
 * @author namdng09
 */
public class MainForm extends Form{
    private final FruitManagementView view = new FruitManagementView();
    Form newForm = null;
    @Override
    public STATUS_PROGRAM setup() {
        while (true) {
            view.displayMenu(OPTIONS.values());

            OPTIONS choice = (OPTIONS) view.inputOption("Your choice: ", OPTIONS.values());
            switch (choice) {
                case CREATE_FRUIT:
                    newForm = new CreateNewFruit();
                    break;
                case VIEW_ORDER:
                    newForm = new ViewOrder();
                    break;
                case CREATE_ORDER:
                    newForm = new CreateNewOrder();
                    break;
                default:
                    System.exit(0);
            }
            newForm.loop();

            return STATUS_PROGRAM.CONTINUE_LOOP;
        }
        
    }
    
}
