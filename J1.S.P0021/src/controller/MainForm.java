/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.fileIO.StudentFileLoader;
import view.StudentManagementView;
import view.StudentManagementView.OPTIONS;

/**
 *
 * @author namdng09
 */
public class MainForm extends Form{
    private StudentManagementView view = new StudentManagementView();
    Form newForm = null;
    
    @Override
    public void setup() {
        System.out.print("LOADING STUDENT...");
        try {
            StudentFileLoader.getInstance().load();
            System.out.print("DONE\n");
        } catch (Exception e) {
            System.out.println("FAIL");
            System.out.println("ERROR: " + e.getMessage());
            System.exit(0);
        }
    }

    @Override
    public STATUS_PROGRAM update() {
        while (true) {
            view.displayMenu(OPTIONS.values());

            OPTIONS option = (OPTIONS) view.inputOption("Your choice: ", OPTIONS.values());
            
            switch (option) {
                case CREATE_STUDENT:
                    newForm = new CreateNewStudent();
                    break;
                case FIND_SORT:
                    newForm = new FindAndSort();
                    break;
                case UPDATE_DELETE:
                    newForm = new UpdateOrDelete();
                    break;
                case REPORT:
                    newForm = new ReportListStudent();
                    break;
                default:
                    System.exit(0);
            }
            newForm.loop();
            return STATUS_PROGRAM.LOOP_PROGRAM;
        }
    }
}
