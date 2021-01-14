package com.example;

import java.util.Scanner;

public class FibonacciProgram {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        int n = 0;

        System.out.print("Enter A Positive Number: ");
        n = userInput.nextInt();

        System.out.println("Your Fibonacci Answer is : " + f(n));
    }

    public static int f(int n)
    {
        if(n <= 1)
        {
            return n;
        }
        return f(n - 1) + f(n - 2);
    }
}
