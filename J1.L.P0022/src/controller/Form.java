/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

/**
 *
 * @author namdng09
 */
public abstract class Form {
    protected enum STATUS_PROGRAM {
        EXIT_LOOP,
        CONTINUE_LOOP;
    }
    
    public abstract STATUS_PROGRAM setup();
    
    @SuppressWarnings("empty-statement")
    public void loop() {
        while(setup() != STATUS_PROGRAM.EXIT_LOOP);
    }
}
