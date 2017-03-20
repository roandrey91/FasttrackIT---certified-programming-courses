package com.andrei;

import java.util.Scanner;

/**
 * Created by Andrei on 3/20/2017.
 */
public class AvarageNNumbers {
    private int count;
    private double sum;

    {
        sum = 0;
        count = 0;
    }

    public double calcAverage() {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextDouble()) {
            addToSum(scanner.nextDouble());
        }

        return sum / count;
    }

    private void addToSum(double number) {
        sum += number;
        count++;
    }



}


