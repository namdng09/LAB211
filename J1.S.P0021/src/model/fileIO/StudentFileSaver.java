/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.fileIO;

import java.io.BufferedWriter;
import java.io.FileWriter;
import model.formatter.StudentFileFormatter;
import model.manager.StudentManager;

/**
 *
 * @author namdng09
 */
public class StudentFileSaver implements IFileSavable<StudentManager>{
    private String path;

    public StudentFileSaver(String path) {
        this.path = path;
    }
    
    
    @Override
    public void append(StudentManager manager) throws Exception {
        StudentFileFormatter formatter = new StudentFileFormatter();
        BufferedWriter writer = new BufferedWriter(new FileWriter(this.path, true));
        
        writer.append(formatter.formatTo(manager.getStudent(manager.size() - 1)) + "\n");
        writer.close();
    }
    
}
