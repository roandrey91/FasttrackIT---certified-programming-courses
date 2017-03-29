package com.andrei;

import java.util.Scanner;

/**
 * Created by Andrei on 3/26/2017.
 */
public class SumOfNNumberBtw {

//    3. Se citesc numere naturale pânã când se introduce numãrul 0.
//    Afisati suma obtinutã prin adunarea doar a numerelor mai mari decat 4 si mai mici decat 11.

    public static void getSumOf() {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int number;
        System.out.println("Imput awaiting valid numbers, for exit enter 0. ");
        do {
            number = sc.nextInt();
            if (number > 4 && number < 11){
                sum += number;
            }
        }while (number != 0);
        System.out.println("Result is : " + sum);
        }


    }

