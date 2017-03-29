package com.andrei;

/**
 * Created by Andrei on 3/27/2017.
 */
public class IntegerNumberForSum extends OnPower{

//    8. Se da un numar intreg x si un numar intreg n. Sa se calculeze urmatoarea suma:
//    suma = 1+(x la puterea 1) +(x la puterea 2) + (x la puterea 3) + ….+ (x la puterea n) .
//  2 3  =   1 + 2 + 2 * 2 + 2*2*2 = 1 + x ^ 1 + x ^ n -1 + x ^ n


    public static void toCalculate(int x, int n){
       int sum = 1;
       int pow = 1;
       for (int i =1; i <=n; i++){
         pow *= x;
         sum += pow;
       }
         System.out.println("Result of sum is : " +sum);
    }



}
