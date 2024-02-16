/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.Matrix;
import model.MatrixOperation;
import view.MatrixCalculationView;

/**
 *
 * @author DELL VOSTRO 5630
 */
public class OperatorForm extends Form{
    MatrixCalculationView view = new MatrixCalculationView();
    
    private char sign;
    private MatrixOperation operator;

    public OperatorForm(char sign, MatrixOperation operator) {
        this.sign = sign;
        this.operator = operator;
    }
    
    @Override
    public STATUS setup() {
        System.out.println(operator.title());
        
        Matrix matrix_1 = view.inputInitializeMatrix();
        
        view.inputMatrixValues(matrix_1);
        
        Matrix matrix_2 = view.inputInitializeMatrix();
        
        if (!this.operator.isOperable(matrix_1, matrix_2)) {
            System.out.println("Can't compute!!");
            return STATUS.EXIT;
        }
        
        view.inputMatrixValues(matrix_2);
        
        Matrix matrixResult = operator.compute(matrix_1, matrix_2);
        
        System.out.println(matrixResult);
        
        return STATUS.EXIT;
    }
    
}
