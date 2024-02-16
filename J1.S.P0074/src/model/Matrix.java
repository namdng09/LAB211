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
public class Matrix {
    private int row;
    private int column;
    private double[] values;

    public Matrix() {
    }

    public Matrix(int row, int col) {
        this.row = row;
        this.column = col;
        this.values = new double[this.row * this.column];
    }
    
    public int getColumn() {
        return column;
    }
    
    public int getRow() {
        return row;
    }
    
    public void setValueAt(int row, int col, double value){
        values[row * this.column + col] = value;
    }
    
    public double getValueAt(int row, int col) {
        return values[row * this.column + col];
    }
    
    public String getSizeInString() {
        return "(" + this.row + ", " + this.column + ")";
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder(); 
        for (int r = 0; r < this.row; r++) {
            for (int c = 0; c < this.column; c++) {
                builder.append("[" + this.values[r * this.row + c] + "]");
            }
            builder.append("\n");
        }
        return builder.toString();
    }
}
