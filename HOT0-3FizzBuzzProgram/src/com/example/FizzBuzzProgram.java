package com.example;

import javax.swing.JOptionPane;

public class FizzBuzzProgram {
    public static void main(String[] args) {

        JOptionPane.showInputDialog("Please Enter A Number Between 1 and 100:");

        // Print out the numbers 1 - 100 and determine if they will print "Prime", "Fizz", "Buzz", or "FizzBuzz"
        for(int i = 1; i <= 100; ++i)
        {

            if((i % 3 == 0) && (i % 5 == 0))
            {
                System.out.println("FizzBuzz");
            }
            else if (i % 3 == 0)
            {
                System.out.println("Fizz");
            }
            else if(i % 5 == 0)
            {
                System.out.println("Buzz");
            }
            else if (i % 2 != 0)
            {
                System.out.println("Prime");
            }
            else
            {
                System.out.println(i);
            }
        }
    }
}
