/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.operator.Addition;
import model.operator.Multiplication;
import model.operator.Subtraction;
import utility.Utility;
import view.MatrixCalculationView;

/**
 *
 * @author DELL VOSTRO 5630
 */
public class MainForm extends Form{

    private MatrixCalculationView view = new MatrixCalculationView();
    private Utility utils = new Utility();
    
    private enum OPTION{
        ADDITION,
        SUBTRACTION,
        MULTIPLICATION,
        QUIT;
    }
    
    Form newForm = null;
    
    @Override
    public STATUS setup() {
        OPTION choice = (OPTION) view.inputOption("Your choice: ",OPTION.values());
        
        switch (choice) {
            case ADDITION:
                newForm = new OperatorForm('+', new Addition());
                break;
            case SUBTRACTION:
                newForm = new OperatorForm('-', new Subtraction());
                break;
            case MULTIPLICATION:
                newForm = new OperatorForm('*', new Multiplication());
                break;
        }
        newForm.setup();
        
        utils.holdProgram();
        
        return STATUS.EXIT;
    }
    
}
