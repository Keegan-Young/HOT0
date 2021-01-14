package com.example;

import javax.swing.JOptionPane;

public class PerfectSquareProgram {
    public static void main(String[] args) {
        int number = 1;
        int numberSquared;
        int sum = 0;

        while(number <= 100)
        {
            numberSquared = (number * number);
            sum = sum + numberSquared;
            ++number;
        }

        JOptionPane.showMessageDialog(null, "The sum of the first 100 perfect squares" +
                                        " (1^2 + 2^2 + 3^2 + 4^2 + 5^2 + ... 100^2) is: " + sum);
    }
}
