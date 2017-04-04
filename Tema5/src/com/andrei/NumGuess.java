package com.andrei;

import java.util.Scanner;

/**
 * A simply app with two methods for a simply game to guess number.
 * Created by Andrei on 4/4/2017.
 */
public class NumGuess {

    static Scanner sc = new Scanner(System.in);

    public static void numGuessed() {
        System.out.print("Enter a number btw 1 - 10 :");
        boolean win = false;
        int randomNum = randomNumber();
        int counter = 0;
        while (!win) {
            int number = sc.nextInt();
            counter++;
            if (number == randomNum) {
                System.out.println("You have guessed the number " + number + " after " + counter + " tentative!");
                win = true;
            } else if (number < randomNum) {
                System.out.println("Try bigger one!");
            } else if (number > randomNum) {
                System.out.println("Try a smaller one!");
            }
        }
    }


    public static int randomNumber() {
        // numar intre 0 -1 , exemplu  0.999 sau 0.233
        double randomNumber = Math.random();
        // inmultind  cu 10 avem numere intre 0 si aproape 10
        randomNumber = randomNumber * 10;
        // adunand 1  ajungem la un maxim de 10.999
        randomNumber = randomNumber + 1;
        // transformand in int  orice numar ca 6.999 devine 6
        int randomInt = (int) randomNumber;
        return randomInt;
    }


}
