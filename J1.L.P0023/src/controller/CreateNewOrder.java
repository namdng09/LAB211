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
            if (manager.size() == 0) {
                System.out.println("The list of fruit is empty!");
                return STATUS_PROGRAM.EXIT_LOOP;
            }
            
            System.out.println("| ++ Item ++ | ++ Fruit Name ++ | ++ Origin ++ | ++ Price ++ |");
            for (Fruit fruit : manager) {
                System.out.println(utils.formatListOrder(fruit));
            }
            
            int choice = utils.getInteger("Choose an item you want to buy 1 -> " + manager.size() + ": ", 1, manager.size());
            Fruit selectedFruit = manager.getFruit(choice - 1);
            
            // Set the quantity of selectedFruit
            selectedFruit.setQuantity(utils.getInteger("Please input quantity: ", 1, selectedFruit.getQuantity()));
            
            listOfSelectedFruit.add(selectedFruit);
            
            int choose = view.inputYesNoOption("Do you want to order now? YES/NO (1/0)?: ");
            switch (choose) {
                case FruitManagementView.YES_OPTION:
                    System.out.println("Product | Quantity | Price | Amount");
                    for (Fruit fruit : listOfSelectedFruit) {
                        System.out.println(utils.formatSelectedFruit(fruit));
                    }
                    double totalPrice = 0;
                    for (Fruit fruit : listOfSelectedFruit) {
                        totalPrice += fruit.getPrice() * fruit.getQuantity();
                    }
                    System.out.format("Total: %.2f$\n", totalPrice);
                    String nameOfCustomer = utils.getNameString("Enter your name: ");
                    try {
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
        // Select the item and display the selected fruit
        
        // input the quantity
        
        // Input yes or no to continue ordering
        
        // Display the order and total
        
        // input the name of customer
        
        // put to hashtable
        
        return STATUS_PROGRAM.EXIT_LOOP;
    }
    
}
