package com.andrei;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);




          // Problem 1
          int[] a = {1,3,4,6,7,8,10,12,14,23};
          System.out.println("Enter a integer number to find if is in Array or not :");
          System.out.println(GetIndexOfNumber.getIndexOf(sc.nextInt(),a));

          // Problema 2
          System.out.println("Input awaiting valid numbers, to calculate sum of first its numbers - ");
          SumOfFirstNNumbers.sumOf(sc.nextInt());

          // Problema 3
          SumOfNNumberBtw.getSumOf();

          // Problema 4
          System.out.println("Imput awaiting valid number , to see if number belong to problem interval requirements");
          System.out.println(IntervalTrue.isInInterval(sc.nextInt()));

          // Problema 5
          System.out.println("Imput awaiting two number, a to pow of number n : ");
          OnPower.toPower(sc.nextInt(),sc.nextInt());

          // Problema 6
          FactorialNumber.factorialNumber();

          // Problema 7
          PairsOfNumber.toPairs();

          // Problema 8
          System.out.println("Imput awaiting two numbers x and n :");
          IntegerNumberForSum.toCalculate(sc.nextInt(),sc.nextInt());

          // Problema 9
          ArrayOfNumberForImput arrayOfNumberForImput = new ArrayOfNumberForImput();
          System.out.println("Imput awaiting numbers to sort the list of numbers :");
          System.out.println(SortArr.toSort(arrayOfNumberForImput.createArray()));

          // Problema 10
          arrayOfNumberForImput.clearArray();
          System.out.println("Imput awaiting valid numbers: ");
          HalfArray.halfDoubleAndTriple(arrayOfNumberForImput.createArray());

          // Problema 11
          arrayOfNumberForImput.clearArray();
          System.out.println("Imput awaiting valid numbers: ");
          System.out.println(MoveInArray.moveValue(arrayOfNumberForImput.createArray()));

    }
}
