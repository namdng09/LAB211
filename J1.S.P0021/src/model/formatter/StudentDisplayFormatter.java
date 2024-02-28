/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.formatter;

import model.Student;

/**
 *
 * @author namdng09
 */
public class StudentDisplayFormatter implements IFormatter<Student>{
    public final static String HEADER = "ID          Name                   COURSE       SEMESTER"
                + "\n--------------------------------------------------------";

    @Override
    public String formatTo(Student e) {
        return String.format("%-10s | %-20s | %-10s | %-4s ", 
                e.getStudentID(),
                e.getStudentName(),
                e.getCourseName(),
                e.getSemester());
    }

    @Override
    public Student formatForm(String e) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
