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
public class Multiplication extends MatrixOperation{

    @Override
    public boolean isOperable(Matrix m1, Matrix m2) {
        return (m1.getColumn()== m2.getRow());
    }

    @Override
    public Matrix compute(Matrix m1, Matrix m2) {
        Matrix matrix = new Matrix(m1.getRow(), m2.getColumn());
        
        for (int r = 0; r < m1.getRow(); r++) {
            for (int c = 0; c < m2.getColumn(); c++) {
                double value = 0;
                for (int i = 0; i < m1.getColumn(); i++) {
                    value += m1.getValueAt(r, i) * m2.getValueAt(i, c);
                }
                matrix.setValueAt(r, c, value);
            }
        }
        
        return matrix;
    }

    @Override
    public String title() {
        return "-------- Multiplication --------";
    }
    
}
