/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.formatter;

import java.util.StringTokenizer;
import model.Student;

/**
 *
 * @author namdng09
 */
public class StudentFileFormatter implements IFormatter<Student>{
    private final static String DELIM = ":";
    
    @Override
    public String formatTo(Student e) {
        return e.getStudentID() + DELIM + e.getStudentName() 
                + DELIM + e.getSemester() + DELIM + e.getCourseName();
    }

    @Override
    public Student formatForm(String e) throws Exception {
        StringTokenizer tokenizer = new StringTokenizer(e, DELIM);

        String studentID = tokenizer.nextToken().trim();
        String studentName = tokenizer.nextToken().trim();
        int semester = Integer.parseInt(tokenizer.nextToken().trim());
        String courseName = tokenizer.nextToken().trim();
        
        return new Student(studentID, studentName, semester, courseName);
    }
    
}
