/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.ArrayList;
import java.util.Map;
import model.Fruit;
import model.manager.OrderManager;
import utility.Utility;
import view.FruitManagementView;

/**
 *
 * @author namdng09
 */
public class ViewOrder extends Form{

    @Override
    public STATUS_PROGRAM setup() {
        FruitManagementView view = new FruitManagementView();
        OrderManager orderManager = OrderManager.getInstance();
        
        if (orderManager.isEmpty()) {
            System.out.println("List of Order is empty!");
            return STATUS_PROGRAM.EXIT_LOOP;
        }
        
        for (Map.Entry<String, ArrayList<Fruit>> entry : orderManager) {
            // Display name of customer
            System.out.println("Customer: " + entry.getKey());
            
            // Display the list selected fruit
            view.displaySelectedFruit(entry.getValue());
            
            // Print the total price
            orderManager.printTotalPrice(entry.getValue());
        }
        
        return STATUS_PROGRAM.EXIT_LOOP;
    }
    
}
