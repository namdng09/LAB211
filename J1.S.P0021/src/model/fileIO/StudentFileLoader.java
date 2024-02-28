/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.fileIO;

import java.io.BufferedReader;
import java.io.FileReader;
import model.PathData;
import model.formatter.StudentFileFormatter;
import model.manager.StudentManager;

/**
 *
 * @author namdng09
 */
public class StudentFileLoader implements IFileLoadable{
    private StudentManager manager;
    private String path;
    
    private static StudentFileLoader instance;

    private StudentFileLoader(StudentManager manager, String path) {
        this.manager = manager;
        this.path = path;
    }
    
    public static StudentFileLoader getInstance() {
        if (instance == null) {
            instance = new StudentFileLoader(StudentManager.getInstance(), PathData.STUDENT_PATH);
        }
        return instance;
    }
    
    
    @Override
    public void load() throws Exception {
        StudentFileFormatter formatter = new StudentFileFormatter();
        BufferedReader reader = new BufferedReader(new FileReader(this.path));
        
        String line;
        while ((line = reader.readLine()) != null) {
            manager.insert(formatter.formatForm(line));
        }
        reader.close();
    }
    
}
