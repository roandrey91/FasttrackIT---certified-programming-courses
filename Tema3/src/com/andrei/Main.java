package com.andrei;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Transform from Fahrenheit to  Celsius
        Temperature temperature = new Temperature();
        System.out.println("Input awaiting a valid temperature in Fahrenheit: ");
        System.out.println("Your temperature in Celsius is: "
                + temperature.transformFinC(sc.nextDouble()));

        // Avarage of two imput numbers
        Avarage2Number avarage2Number = new Avarage2Number();
        System.out.println("Imput awaiting 2 valid numbers : ");
        System.out.println("The average between the two introduced number is: "
                + avarage2Number.avarageTwoNumber(sc.nextDouble(),sc.nextDouble()));

        // Avarage of n numbers
        AvarageNNumbers avarageNNumbers = new AvarageNNumbers();
        System.out.println("Input awaiting valid numbers, input will stop when you write a letter: ");
        System.out.println("The average of the entered numbers is : "
                + avarageNNumbers.calcAverage());



        // Max number from list
        System.out.println("Input awaiting valid numbers, imput will stop when you write a letter: ");
        ArrayOfNumbersFromImput arrayOfNumbersFromImput = new ArrayOfNumbersFromImput();
        System.out.println("The maximum value from the provided array is: " +
                   MaxFromList.getMax(arrayOfNumbersFromImput.createArray()));

        // Odd from list
        OddFromList oddFromList = new OddFromList();
        System.out.println("Input awaiting valid numbers, imput will stop when you write a letter: ");
        arrayOfNumbersFromImput.clearArray();
        System.out.println(oddFromList.getOdds(arrayOfNumbersFromImput.createArray()) + " are odd from the provide array.");





 /* // se citesc doua numere, sa se afiseze cele mai mare

        int a = 20 , b = 30;
        System.out.println(a > b ? " a > b " : " a < b ");

  //se citesc 3 numere, sa se afiseze cel mai mic
        System.out.println("Sa se introduca 3 numere :");

        int val1 = sc.nextInt(), val2 = sc.nextInt(), val3 = sc.nextInt();
        if ( val1 < val2 && val1 < val3){
            System.out.println("numarul cel mai mic este : " + val1);
        }else if (val2 < val1 && val2 < val3){
            System.out.println("numarul cel mai mic este : " + val2);
        }else if (val3 < val1 && val3 <val2){
            System.out.println("numarul cel mai mic este : " + val3);
        }

  //se citesc numere pana se introduce 0. sa se afiseze cel mai mare (aici folositi un do while)

  //se citeste un numar. sa se afiseze luna corespunzatoare acelui numar sau mesajul “eroare” daca numarul nu este intre 1 si 12

        System.out.println("Sa se introduca un numar intre 1 - 12 :");
        int luna = sc.nextInt();
        switch (luna){
            case 1 :
                System.out.println("luna ianuarie");
             break;
            case 2 :
                System.out.println("luna februarie");
             break;
            case 3 :
                System.out.println("luna martie");
             break;
            case 4 :
                System.out.println("luna aprilie");
             break;
            case 5 :
                System.out.println("luna mai");
             break;
            case 6 :
                System.out.println("luna iunie");
             break;
            case 7 :
                System.out.println("luna iulie");
             break;
            case 8 :
                System.out.println("luna august");
                break;
            case 9 :
                System.out.println("luna septembrie");
                break;
            case 10 :
                System.out.println("luna octombrie");
                break;
            case 11 :
                System.out.println("luna noiembrie");
                break;
            case 12 :
                System.out.println("luna decembrie");
                break;
            default:
                System.out.println("eroare");
        }

// sau cu map

        Map m1 = new HashMap();
        m1.put(1 , "ianuarie");
        m1.put(2 , "februarie");
        m1.put(3 , "martie");
        System.out.println("introduceti un numar :");
        System.out.println(m1.get(sc.nextInt()));

 //

*/







    }
}
