/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author DELL VOSTRO 5630
 */
public abstract class MatrixOperation {
    public abstract String title();
    
    public abstract boolean isOperable(Matrix m1, Matrix m2);
    
    public abstract Matrix compute(Matrix m1, Matrix m2);
}
