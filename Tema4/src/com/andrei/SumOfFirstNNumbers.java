package com.andrei;

/**
 * Created by Andrei on 3/26/2017.
 */
public class SumOfFirstNNumbers {

//    Se se calculeze suma primelor n numere naturale, unde n este declarat ca si
//    int n = 20; //sau o alta valoare

    public static void sumOf (int n){
       int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum += i ;
        }
        System.out.println(sum);
    }
}
