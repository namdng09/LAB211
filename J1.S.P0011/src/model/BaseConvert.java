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
public class BaseConvert {
    private final String DIGITS = "0123456789ABCDEFGHỊKLMNOPQRSTUVWXYZ";
    private final int MAX_BASE = 32;
    private final int MIN_BASE = 2;
    
    private int originBase;
    private int convertBase;

    
    private boolean _isValidBase(int base) {
        return ((base >= MIN_BASE) && (base <= MAX_BASE));
    }
    
    private String _getInvalidMessage(int base) {
        return String.format("Invald base! base = %d is not in [%d, %d]", base, MIN_BASE, MAX_BASE);
    }
    public BaseConvert(int originBase, int convertBase) throws Exception {
        if (!_isValidBase(originBase)) {
            throw new Exception(_getInvalidMessage(originBase));
        }
        this.originBase = originBase;
        
        if (!_isValidBase(convertBase)) {
            throw new Exception(_getInvalidMessage(convertBase));
        }
        this.convertBase = convertBase;
    }

    public int getOriginBase() {
        return originBase;
    }

    public int getConvertBase() {
        return convertBase;
    }
    
    private boolean _isValidConvertNumber(String number) {
        for (int i = 0; i < number.length(); i++) {
            int digit = DIGITS.indexOf(number.charAt(i));
            if (digit < 0 || digit > this.originBase) {
                return false;
            }
        }
        return true;
    }
    
    private int _convertTo10(String number) {
        return 1;
    }
    
    public String convert(String number) throws Exception{
        if (!_isValidConvertNumber(number)) {
            throw new Exception("InValid number, original base = " + this.originBase); 
        }
        return "";
    }
    
    
    
}
