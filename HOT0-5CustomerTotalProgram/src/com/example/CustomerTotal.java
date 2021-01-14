package com.example;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CustomerTotal {

    // Global Variables
    private static DecimalFormat pattern1 = new DecimalFormat("$###,###,##0.00");

    public static void main(String[] args) {
        Scanner userPrice = new Scanner(System.in);

        // Variables
        double price = 0.0;
        double subtotal = 0.0;
        double taxTotal = 0;
        double tax = 0.08;
        double finalTotal = 0.0;
        String output = "";



        while (true) {
            System.out.print("Please Enter A Price or Enter A Negative Price To" +
                    " Add Up Your Total Prices And End The Program: ");
            price = userPrice.nextDouble();

            if (price < 0) {
                break;
            }

            else {
                subtotal += price;
            }
         }

        taxTotal = subtotal * tax;
        finalTotal = subtotal + taxTotal;

        output = "\nSubtotal: " + pattern1.format(subtotal);
        output += "\nTax Total: " + pattern1.format(taxTotal);
        output += "\nFinal Total: " + pattern1.format(finalTotal);


        System.out.println(output);
    }
}
