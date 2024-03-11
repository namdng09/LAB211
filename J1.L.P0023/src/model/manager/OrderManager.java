/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.manager;

import java.util.ArrayList;
import model.Fruit;

/**
 *
 * @author namdng09
 */
public class OrderManager extends ListOrders{
    private static OrderManager instance;
    
    private OrderManager() {}
    
    public static OrderManager getInstance() {
        if (instance == null) {
            instance = new OrderManager();
        }
        return instance;
    }
    
    public boolean isEmpty() {
        boolean flag = false;
        if (size() == 0) {
            flag = true;
            return flag;
        }
        return flag;
    }
    
    public void printTotalPrice(ArrayList<Fruit> listOfFruits) {
        double totalPrice = 0;
        for (Fruit fruit : listOfFruits) {
            totalPrice += fruit.getPrice() * fruit.getQuantity();
        }
        System.out.format("Total: %.2f$\n", totalPrice);
    }
    
    public void insertOrderList(ArrayList<Fruit> listOfFruit, String name) throws Exception{
        this.listOfOrders.put(name, listOfFruit);
    }
}
