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
public class FruitManager extends ListFruits{
    private static FruitManager instance;
    
    private FruitManager() {}
    
    public static FruitManager getInstance() {
        if (instance == null) {
            instance = new FruitManager();
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
    
    public Fruit findFirst(IIdentify<Fruit> identify) {
        for (Fruit fruit : this.listOfFruits) {
            if (identify.isFound(fruit)) {
                return fruit;
            }
        }
        return null;
    }
    
    public ArrayList<Fruit> findAll(IIdentify<Fruit> identify) {
        ArrayList<Fruit> founded = new ArrayList<>();
        for (Fruit fruit : this.listOfFruits) {
            if (identify.isFound(fruit)) {
                founded.add(fruit);
            }
        }
        return founded;
    }
    
    public Fruit findByID (String fruitID) {
        return this.findFirst(new IIdentify<Fruit>() {
            @Override
            public boolean isFound(Fruit fruit) {
                return fruit.getFruitID().equals(fruitID);
            }
        });
    }
    
    public void insert(Fruit fruit) throws Exception{
        if (this.findByID(fruit.getFruitID()) != null) {
            throw new Exception("Fruit's ID has been exist!");
        }
        this.listOfFruits.add(fruit);
    }
}
