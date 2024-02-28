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
    
    protected enum STATUS_PROGRAM {
        EXIT_LOOP,
        LOOP_PROGRAM;
    }
    
    public abstract void setup();
    public abstract STATUS_PROGRAM update();
    
    @SuppressWarnings("empty-statement")
    public void loop() {
        while(update() != STATUS_PROGRAM.EXIT_LOOP);
    }
}
