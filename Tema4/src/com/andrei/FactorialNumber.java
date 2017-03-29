package com.andrei;

import java.util.Scanner;

/**
 * Created by Andrei on 3/26/2017.
 */
public class FactorialNumber {

    public static void factorialNumber(){
        long n, c, fact = 1;

        System.out.println("Enter an integer to calculate it's factorial :");
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();

        if ( n < 0 )
            System.out.println("Number should't be negative.");
        else
        {
            for ( c = 1 ; c <= n ; c++ )
                fact = fact*c;

            System.out.println("Factorial of "+n+" is = "+fact);
        }

    }
}
