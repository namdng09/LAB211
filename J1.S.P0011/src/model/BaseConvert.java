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
    private final String DIGITS = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private int originBase;
    private int convertBase;
    
    public BaseConvert(int originBase, int convertBase) {
        this.originBase = originBase;
        this.convertBase = convertBase;
    }

    public int getOriginBase() {
        return originBase;
    }

    public int getConvertBase() {
        return convertBase;
    }
    
    private int _convertToDec(String number) {
        int decimalNumber = 0;
        for (int i = 0; i < number.length(); i++) {
            decimalNumber += DIGITS.indexOf(number.charAt(i)) * Math.pow(this.originBase, i);
        }
        return decimalNumber;
    }
    
    private String _convertFromDec(int number) {
        String convertNumber = "";
        while (number > 0) {
            int digit = number % this.convertBase;
            number /= this.convertBase;
            convertNumber = DIGITS.charAt(digit) + convertNumber;
        }
        return convertNumber;
    }
    
    public String convert(String number) {
        number = number.toUpperCase();
        if (this.originBase == this.convertBase) {
            return number;
        }
        int base10 = (this.originBase == 10) ? Integer.parseInt(number) : this._convertToDec(number);
        String convertNumber = (this.convertBase == 10) ? String.valueOf(base10) : this._convertFromDec(base10);
        return convertNumber;
    }
}
