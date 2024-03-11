/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.ArrayList;
import model.Fruit;
import model.manager.FruitManager;
import model.manager.OrderManager;
import utility.Utility;
import view.FruitManagementView;

/**
 *
 * @author namdng09
 */
public class CreateNewOrder extends Form{

    @Override
    public STATUS_PROGRAM setup() {
        FruitManager manager = FruitManager.getInstance();
        OrderManager orderManager = OrderManager.getInstance();
        Utility utils = new Utility();
        FruitManagementView view = new FruitManagementView();
        ArrayList<Fruit> listOfSelectedFruit;
        listOfSelectedFruit = new ArrayList<>();
        
        // Display the list of Fruit
        while (true) {   
            // check if no fruit in program
            if (manager.isEmpty()) {
                System.out.println("The list of fruit is empty!");
                return STATUS_PROGRAM.EXIT_LOOP;
            }
            
            // Select the item and display the selected fruit
            view.displayListOfFruit(manager);
            
            Fruit selectedFruit = manager.getFruit(
                    utils.getInteger(
                            "Choose an item you want to buy 1 -> " + manager.size() + ": ", 
                            1, 
                            manager.size()) - 1);
            
            // Set the quantity of selectedFruit
            selectedFruit.setQuantity(
                    utils.getInteger("Please input quantity: ", 
                            1, 
                            selectedFruit.getQuantity()));
            
            // Add selectedFruit to array list to store
            listOfSelectedFruit.add(selectedFruit);
            
            // Input yes or no to continue ordering
            int choose = view.inputYesNoOption("Do you want to order now? YES/NO (1/0)?: ");
            switch (choose) {
                case FruitManagementView.YES_OPTION:
                    // Display the order and total
                    view.displaySelectedFruit(listOfSelectedFruit);
                    
                    // Print the total price
                    orderManager.printTotalPrice(listOfSelectedFruit);
                    
                    // input the name of customer
                    String nameOfCustomer = utils.getNameString("Enter your name: ");
                    try {
                        // put to hashtable
                        orderManager.insertOrderList(listOfSelectedFruit, nameOfCustomer);
                    } catch (Exception e) {
                        System.out.println("ERROR: " + e.getMessage());
                    }
                    break;
                case FruitManagementView.NO_OPTION:
                    continue;
            }
        
            break;
        }
        
        
        
        
        
        
        
        
        
        
        
        
        return STATUS_PROGRAM.EXIT_LOOP;
    }
    
}
