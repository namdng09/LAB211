/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

/**
 *
 * @author DELL VOSTRO 5630
 */
public abstract class Form {
    
    protected enum STATUS {
        EXIT,
        CONTINUE;
    }
    
    public abstract STATUS setup();
    
    @SuppressWarnings("empty-statement")
    public void loop() {
        while(setup() != STATUS.EXIT);
    }
}
