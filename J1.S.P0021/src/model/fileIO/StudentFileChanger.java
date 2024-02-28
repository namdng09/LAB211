/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.fileIO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import model.PathData;
import model.Student;

/**
 *
 * @author namdng09
 */
public class StudentFileChanger {
    
    public void deleteLine(Student student) throws FileNotFoundException, IOException {
        File inputFile = new File(PathData.STUDENT_PATH);
        File tempFile = new File(PathData.TEMP_PATH);

        BufferedReader reader = new BufferedReader(new FileReader(inputFile));
        BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile));
        
        String deletetStudentID = student.getStudentID();
        String currentLine;
        
        while((currentLine = reader.readLine()) != null) {
            // trim newline when comparing with lineToRemove
            String trimmedLine = currentLine.trim();
            if(!trimmedLine.contains(deletetStudentID)) continue;
            writer.write(currentLine + System.getProperty("line.separator"));
        }
        
         // Xóa tệp gốc và đổi tên tệp tạm thành tên tệp gốc
            if (!inputFile.delete()) {
                System.out.println("Không thể xóa tệp gốc");
                return;
            }

            if (!tempFile.renameTo(inputFile)) {
                System.out.println("Không thể đổi tên tệp tạm");
            }
            
        writer.close();
        reader.close();
    }
}
