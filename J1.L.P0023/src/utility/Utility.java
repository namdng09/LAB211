/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utility;

import java.util.Scanner;
import model.Fruit;

/**
 *
 * @author namdng09
 */
public class Utility {
    private Scanner scanner = new Scanner(System.in);
    
    public int getInteger(String message, int min, int max) {
        int input;
        while (true) {
            System.out.print(message);
            try {
                input = Integer.parseInt(scanner.nextLine());
                if (input < min || input > max) {
                    throw new Exception(String.format(
                            "Invalid number, number must be in range [%d, %d]", 
                            min, max));
                } else {
                    break;
                }
            } catch (Exception e) {
                System.out.println("ERROR: " + e.getMessage());
            }
        }
        return input;
    }
    public double getDouble(String message) {
        double input;
        while (true) {
            System.out.print(message);
            try {
                input = Double.parseDouble(scanner.nextLine());
                if (input < 0) {
                    throw new Exception(
                            "Invalid value, price must be positive number!");
                } else {
                    break;
                }
            } catch (Exception e) {
                System.out.println("ERROR: " + e.getMessage());
            }
        }
        return input;
    }
    
    public String getNameString(String message) {
        String input;
        while (true) {
            System.out.print(message);
            try {
                input = scanner.nextLine();
                if (input.isEmpty()) {
                    throw new Exception("Can not leave blank!");
                }else if (!input.matches("[\\w\\s]+")) {
                    throw new Exception("Can not have special word!");
                }else {
                    // Return valid string
                    return this.formatNameString(input);
                }
            } catch (Exception e) {
                System.out.println("ERROR: " + e.getMessage());
            }
        }
    }
    
    public String getValidID(String message) {
        String input;
        while (true) {
            try {
                System.out.print(message);
                input = scanner.nextLine().toUpperCase();
                if (input.matches("^FR[\\d]{3}$")) {
                    return input;
                }else {
                    throw new Exception(
                            "Invalid ID, Please enter the ID in the form FRxxx");
                }
            } catch (Exception e) {
                System.out.println("ERROR: " + e.getMessage());
            }
        }
    }

    private String formatNameString(String e) {
        StringBuilder stringBuilder = new StringBuilder();
        String words[] = e.split("\\s+");
        for (String word : words) {
            stringBuilder.append(word.substring(0,1).toUpperCase()).append(word.substring(1).toLowerCase()).append(" ");
        }
        return stringBuilder.toString().trim();
    }
    
    public String formatListOrder(Fruit fruit) {
        return String.format("   %-9s |  %-14s  |  %-11s |  %-9.2f", 
                fruit.getFruitID(),
                fruit.getFruitName(),
                fruit.getFruitOrigin(),
                fruit.getPrice());
    }
    
    public String formatSelectedFruit(Fruit fruit) {
        return String.format("%-15s|%-8s|%-7s|%-6.2f", 
            fruit.getFruitName(),
            fruit.getQuantity(),
            fruit.getPrice(),
            fruit.getQuantity() * fruit.getPrice());
    }
}
