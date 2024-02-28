/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import model.Student;
import utility.Utility;

/**
 *
 * @author namdng09
 */
public class StudentManagementView {
    private Utility utils = new Utility();
    
    public static final int YES_OPTION = 1;
    public static final int NO_OPTION = 0;
    
    public enum OPTIONS {
        CREATE_STUDENT("Create", 1),
        FIND_SORT("Find and Sort", 2),
        UPDATE_DELETE("Update/Delete", 3),
        REPORT("Report", 4),
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
    
    public enum COURSE_NAME{
        JAVA,
        DOT_NET,
        C_PLUS;
    }
    
    public void displayMenu(OPTIONS[] options) {
        System.out.println("WELCOME TO STUDENT MANAGEMENT");
        for (OPTIONS option : options) {
            System.out.println(option.getKey() + ". " + option.getMessage());
        }
    }
    
    public Object inputOption(String message, Object[] options) {
        Object option;
        option = options[utils.getInteger(message, 1, options.length) - 1];
        return option;
    }
    
    public Student inputStudent(String message) {
        System.out.println(message);
        return new Student(
                utils.getValidID("Enter ID (HExxxxxx): "), 
                utils.getNameString("Enter name: "), 
                utils.getInteger("Enter semester: ", 1, 9), 
                this.inputOption("Enter course JAVA/.NET/C++ (1-3): ", 
                        COURSE_NAME.values()).toString()
        );
        
    } 
    public int inputYesNoOption(String message){
        return utils.getInteger(message, NO_OPTION, YES_OPTION);
    }
    
    public String inputNameString(String message) {
        return utils.getNameString(message);
    }
}
