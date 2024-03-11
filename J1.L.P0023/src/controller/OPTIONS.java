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
public enum OPTIONS {
        CREATE_FRUIT("Create", 1),
        VIEW_ORDER("View orders", 2),
        CREATE_ORDER("Shopping (for buyer)", 3),
        EXIT_PROGRAM("Exit", 4);

        private String message;
        private int key;

        OPTIONS(String message, int key){
            this.message = message;
            this.key = key;
        }

        public String getMessage() {
            return message;
        }

        public int getKey() {
            return key;
        }
}
