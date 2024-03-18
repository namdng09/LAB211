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
        EXPERIENCE("Experience", 1),
        FRESHER("Fresher", 2),
        INTERNSHIP("Internship", 3),
        SEARCHING("Searching", 4),
        EXIT_PROGRAM("Exit", 5);

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
