package com.andrei;

/**
 * Created by Andrei on 3/26/2017.
 */
public class OnPower {

//   5. Se dau doua numere a si n. sa se afiseze numarul a la puterea n
//    de ex
//    a =3
//    b = 20
//    se va calcula 3*3 *3

    public static void toPower (int a, int n){
        int pow = 1;
        for (int i =1; i <= n; i++){
            pow *= a;
        }System.out.println("Result of a to pow n is : "+ pow);
    }




}
