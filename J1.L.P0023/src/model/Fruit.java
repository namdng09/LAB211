/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author namdng09
 */
public class Fruit {
    private String fruitID;
    private String fruitName;
    private double price;
    private int quantity;
    private String fruitOrigin;

    public Fruit(String fruitID, String fruitName, double price, int quantity, String fruitOrigin) {
        this.fruitID = fruitID;
        this.fruitName = fruitName;
        this.price = price;
        this.quantity = quantity;
        this.fruitOrigin = fruitOrigin;
    }

    public String getFruitID() {
        return fruitID;
    }

    public void setFruitID(String fruitID) {
        this.fruitID = fruitID;
    }

    public String getFruitName() {
        return fruitName;
    }

    public void setFruitName(String fruitName) {
        this.fruitName = fruitName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getFruitOrigin() {
        return fruitOrigin;
    }

    public void setFruitOrigin(String fruitOrigin) {
        this.fruitOrigin = fruitOrigin;
    }

    @Override
    public String toString() {
        return String.format("      %-6d |  %-14s  |  %-11s |  %-9.2f", 
                this.quantity,
                this.fruitName,
                this.fruitOrigin,
                this.price);
    }
    
    //%" + leftPadding + "s%s%" + rightPadding + "s", "", text, ""
    
}
