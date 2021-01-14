package com.example;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class DistanceConverter {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        String userInput = "";
        double measurementInInches = 0.0;
        String output = "";
        double conversion = 0.0;


        userInput = JOptionPane.showInputDialog("Please enter a measurement in inches:");
        measurementInInches = Double.parseDouble(userInput);

        // conversion variable takes user input and multiplies it by 2.54 to convert to centimeters
        conversion = 2.54 * measurementInInches;

        output = "\nYour converted measurement is: " + conversion + "cm";

        JOptionPane.showMessageDialog(null, output);
    }
}
