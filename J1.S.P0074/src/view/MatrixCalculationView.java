/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import model.Matrix;
import utility.Utility;

/**
 *
 * @author DELL VOSTRO 5630
 */
public class MatrixCalculationView {
    private Utility input = new Utility();
    
    private void displayMenu() {
        System.out.println("=======Calculator program=======");
        System.out.println("1. Addition Maxtrix\n"
                + "2. Subtraction Maxtrix\n"
                + "3. Multiplication Maxtrix\n"
                + "4. Quit");
    }
    
    public Object inputOption(String message, Object[] options){
        Object object;
        displayMenu();
        object = options[input.getInteger(message, 1, options.length) - 1];
        return object;
    } 
    public Matrix inputInitializeMatrix() {
        Matrix matrix = new Matrix(
                input.getInteger("Enter Row Matrix: ", 1, Integer.MAX_VALUE), 
                input.getInteger("Enter Column Matrix: ", 1, Integer.MAX_VALUE));
        return matrix;
    }
    
    public void inputMatrixValues(Matrix matrix) {
        for (int r = 0; r < matrix.getRow(); r++) {
            for (int c = 0; c < matrix.getColumn(); c++) {
                matrix.setValueAt(r, c, input.getDouble(
                                String.format(
                                        "Enter Matrix[%d][%d]: ", 
                                        r + 1, 
                                        c + 1)));
            }
        }
    }
    
}
