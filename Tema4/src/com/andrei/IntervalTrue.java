package com.andrei;

/**
 * Created by Andrei on 3/26/2017.
 */
public class IntervalTrue {

//   4. Se da un numar. Sa se afiseze ‘true' daca numarul apartine intervalului [9,24]. Altfel sa se afiseze ‘false'.


    public static boolean isInInterval(int numar) {
        int val1 = 9;
        int val2 = 24;
        if (numar >= val1 && numar <= val2)
            return true;
        return false;

    }


}
