/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import model.Student;
import model.formatter.StudentDisplayFormatter;
import model.manager.StudentManager;
import view.StudentManagementView;

/**
 *
 * @author namdng09
 */
public class FindAndSort extends Form {
    private final StudentManagementView view = new StudentManagementView();
    private final StudentDisplayFormatter formatter = new StudentDisplayFormatter();

    @Override
    public void setup() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public STATUS_PROGRAM update() {
        String searchName = view.inputNameString("Enter a part of name to search: ");
        
        ArrayList<Student> founded = StudentManager.getInstance().findbyPartOfName(searchName);
        
        if (founded.isEmpty()) {
            System.out.println("No students found with the given name.");
            return STATUS_PROGRAM.EXIT_LOOP;
        }else {
            Collections.sort(founded, new Comparator<Student>() {
                @Override
                public int compare(Student o1, Student o2) {
                    int num = o1.getStudentName().compareTo(o2.getStudentName());
                    return num;
                }
            });
        }
        
        System.out.println(StudentDisplayFormatter.HEADER);
        
        for (Student student : founded) {
            System.out.println(formatter.formatTo(student));
        }
        
        return STATUS_PROGRAM.EXIT_LOOP;
    }
    
}
