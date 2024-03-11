/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.manager;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import model.Fruit;

/**
 *
 * @author namdng09
 */
public class ListOrders implements Iterable<Map.Entry<String, ArrayList<Fruit>>>{
    protected Hashtable<String, ArrayList<Fruit>> listOfOrders;
    
    public ListOrders() {
        listOfOrders = new Hashtable<>();
    }
    
    public ListOrders(Hashtable<String, ArrayList<Fruit>> listOfOrders) {
        this.listOfOrders = listOfOrders;
    }
    
    public int size() {
        return this.listOfOrders.size();
    }

    @Override
    public Iterator<Map.Entry<String, ArrayList<Fruit>>> iterator() {
        return this.listOfOrders.entrySet().iterator();
    }

    
}
