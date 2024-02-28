/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.Student;
import model.formatter.StudentDisplayFormatter;
import model.manager.StudentManager;
import utility.Utility;
import view.StudentManagementView;

/**
 *
 * @author namdng09
 */
public class UpdateOrDelete extends Form {
    private StudentManagementView view = new StudentManagementView();
    private StudentDisplayFormatter formatter = new StudentDisplayFormatter();
    private Utility utils = new Utility();
    
    private enum ACTION {
        UPDATE,
        DELETE,
        EXIT;
    }

    @Override
    public void setup() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public STATUS_PROGRAM update() {
        String searchID = utils.getValidID("Enter ID (HExxxxxx): ");
        Student searchStudent;
        try {
            searchStudent = StudentManager.getInstance().findByID(searchID);
            if (searchStudent == null) {
                throw new NullPointerException("No student found with the given ID.");
            }
        } catch (NullPointerException e) {
            System.out.println("ERROR: " + e.getMessage());
            return STATUS_PROGRAM.EXIT_LOOP;
        }
        
        //System.out.println(formatter.formatTo(searchStudent));
        
        ACTION action = (ACTION) view.inputOption(
                "Do you want to update (1), delete (2) or exit (3) the student? ", 
                ACTION.values());
        
        switch (action) {
            case UPDATE:
                searchStudent.setStudentNameString(utils.getNameString("Enter the name of student: "));
                
                searchStudent.setSemester(utils.getInteger("Enter the semester: ", 1, 9));
                
                searchStudent.setCourseName(view.inputOption("Enter course JAVA/.NET/C++ (1-3): ", 
                        StudentManagementView.COURSE_NAME.values()).toString());
                System.out.println("Update succesful!");
                break;
            case DELETE:
                try {
                    StudentManager.getInstance().delete(searchStudent);
                } catch (Exception e) {
                    System.out.println("ERROR: " + e.getMessage());
                }
                System.out.println("Delete succesful!");
                break;
            default:
                System.out.println("Returning to the main screen!");
        }
        
        return STATUS_PROGRAM.EXIT_LOOP;
    }
    
}
