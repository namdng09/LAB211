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

/**
 *
 * @author namdng09
 */
public class ViewOrder extends Form{

    @Override
    public STATUS_PROGRAM setup() {
        Utility utils = new Utility();
        OrderManager orderManager = OrderManager.getInstance();
        
        if (orderManager.size() == 0) {
            System.out.println("List of Order is empty!");
            return STATUS_PROGRAM.EXIT_LOOP;
        }
        for (Map.Entry<String, ArrayList<Fruit>> entry : orderManager) {
            System.out.println("Customer: " + entry.getKey());
            System.out.println("Product | Quantity | Price | Amount");
            for (Fruit fruit : entry.getValue()) {
                System.out.println(utils.formatSelectedFruit(fruit));
            }
            double totalPrice = 0;
            for (Fruit fruit : entry.getValue()) {
                totalPrice += fruit.getPrice() * fruit.getQuantity();
            }
            System.out.format("Total: %.2f$\n", totalPrice);
        }
        
        return STATUS_PROGRAM.EXIT_LOOP;
    }
    
}
