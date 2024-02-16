/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.math.BigInteger;
import utility.Validation;

/**
 *
 * @author DELL VOSTRO 5630
 */
public class BaseConvert {
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
            decimalNumber += Validation.DIGITS.indexOf(number.charAt(i)) * Math.pow(this.originBase, i);
        }
        return decimalNumber;
    }
    
    private String _convertFromDec(int number) {
        String convertNumber = "";
        while (number > 0) {
            int digit = number % this.convertBase;
            number /= this.convertBase;
            convertNumber = Validation.DIGITS.charAt(digit) + convertNumber;
        }
        return convertNumber;
    }
    
    private BigInteger convertTo10(String number) {
        BigInteger converted = new BigInteger("0");
        // The first index is "0" so the power of base is 1
        BigInteger power = new BigInteger("1");
        
        BigInteger base = new BigInteger(String.valueOf(this.originBase));
        
        for (int i = number.length() - 1; i >= 0; i--) {
            int digit = Validation.DIGITS.indexOf(number.charAt(i));
            
            BigInteger value = new BigInteger(String.valueOf(digit));
            
            converted = converted.add(power.multiply(value)); 
            
            power = power.multiply(base);
        }
        
        return converted;
    }
    
    private String convertFrom10 (BigInteger number) {
        String converted = new String();
        BigInteger base = new BigInteger(String.valueOf(this.convertBase));
        //
        while (number.compareTo(new BigInteger("0")) > 0) {
            
            int module = Integer.parseInt(number.mod(base).toString());
            
            char digit = Validation.DIGITS.charAt(module);
            //
            converted = digit + converted;
            
            number = number.divide(base);
        }
        return converted;
    }
    public String convert(String number) {
        boolean isNegative = false;
        if (number.matches("^-.*")) {
            isNegative = true;
            number = number.substring(1);
        }
        number = number.toUpperCase();
        if (this.originBase == this.convertBase) {
            return number;
        }
        
        BigInteger baseDecimal = (this.originBase == 10) ? new BigInteger(number) : this.convertTo10(number);
        String convertNumber = (this.convertBase == 10) ? String.valueOf(baseDecimal) : convertFrom10(baseDecimal);
        return isNegative ? "-" + convertNumber : convertNumber;
    }
}
