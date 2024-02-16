/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.operator;

import model.Matrix;
import model.MatrixOperation;

/**
 *
 * @author DELL VOSTRO 5630
 */
public class Addition extends MatrixOperation{

    @Override
    public boolean isOperable(Matrix m1, Matrix m2) {
        return (m1.getRow() == m2.getRow()) && (m1.getColumn() == m1.getColumn());
    }

    @Override
    public Matrix compute(Matrix m1, Matrix m2) {
        Matrix matrix = new Matrix(m1.getRow(), m2.getColumn());
        
        for (int r = 0; r < matrix.getRow(); r++) {
            for (int c = 0; c < matrix.getColumn(); c++) {
                matrix.setValueAt(r, c, m1.getValueAt(r, c) + m2.getValueAt(r, c));
            }
        }
        return matrix;
    }

    @Override
    public String title() {
        return "-------- Addition --------";
    }
    
}
