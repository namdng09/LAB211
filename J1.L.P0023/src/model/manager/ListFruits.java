/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.manager;

import java.util.ArrayList;
import java.util.Iterator;
import model.Fruit;

/**
 *
 * @author namdng09
 */
public class ListFruits implements Iterable<Fruit>{
    protected ArrayList<Fruit> listOfFruits;

    public ListFruits() {
        this.listOfFruits = new ArrayList<>();
    }

    public ListFruits(ArrayList<Fruit> listOfFruits) {
        this.listOfFruits = listOfFruits;
    }

    public ArrayList<Fruit> getListOfFruits() {
        return listOfFruits;
    }

    public ArrayList<Fruit> getList() {
        return listOfFruits;
    }
    
    public int size() {
        return this.listOfFruits.size();
    }
    
    public Fruit getFruit(int index) {
        return this.listOfFruits.get(index);
    }
    
    @Override
    public Iterator<Fruit> iterator() {
        return this.listOfFruits.iterator();
    }
    
    
}
