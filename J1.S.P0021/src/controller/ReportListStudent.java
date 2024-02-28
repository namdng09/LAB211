/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.Student;
import model.formatter.StudentDisplayFormatter;
import model.manager.StudentManager;

/**
 *
 * @author namdng09
 */
public class ReportListStudent extends Form{

    @Override
    public void setup() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public STATUS_PROGRAM update() {
        StudentDisplayFormatter formatter = new StudentDisplayFormatter();
        
        System.out.println(StudentDisplayFormatter.HEADER);
        
        for (Student student : StudentManager.getInstance()) {
            System.out.println(formatter.formatTo(student));
        }
        
        return STATUS_PROGRAM.EXIT_LOOP;
    }
    
}
