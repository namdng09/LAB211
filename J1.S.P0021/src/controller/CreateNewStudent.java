/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.PathData;
import model.fileIO.StudentFileSaver;
import model.manager.StudentManager;
import view.StudentManagementView;

/**
 *
 * @author namdng09
 */
public class CreateNewStudent extends Form{
    StudentManagementView view = new StudentManagementView();
    
    @Override
    public void setup() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }    
    
    @Override
    public STATUS_PROGRAM update() {
        StudentManager manager = StudentManager.getInstance();
        try {
            manager.insert(view.inputStudent("---------- ADD STUDENT ----------"));
            StudentFileSaver studentSaver = new StudentFileSaver(PathData.STUDENT_PATH);
            studentSaver.append(manager);
        } catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage());
        }
        
        int choice = view.inputYesNoOption("Do you want to continue YES/NO (1/0)?: ");
        switch (choice) {
            case StudentManagementView.YES_OPTION:
                return STATUS_PROGRAM.LOOP_PROGRAM;
            case StudentManagementView.NO_OPTION:
                return STATUS_PROGRAM.EXIT_LOOP;
        }
        
        return STATUS_PROGRAM.EXIT_LOOP;
    }


    
}
