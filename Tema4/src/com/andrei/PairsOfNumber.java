package com.andrei;



import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * Created by Andrei on 3/26/2017.
 */
public class PairsOfNumber {

//    7. Se da un sir de numere. Sa se afiseze perechile de numere pentru care  primul numar este mai mare decat al doilea.
//    de ex pt 11 13 9 8 16 se va afisa  13 9 , 9 8


    public static void toPairs (){
        Integer[] array = {11, 13, 9, 8, 16};
        array = sort(array);
        for (Integer b : array){
//            System.out.print( b + ", ");
        }
//        Arrays.sort(array, Collections.reverseOrder());
        for (int i=0; i < array.length-1; i++)
            System.out.println("[" + array[i] + " " + array[i+1] + "]");
    }



    public static Integer[] sort (Integer [] array){
        for (int i =0; i < array.length; i++){
            for (int j =i; j < array.length; j++){
                if (array[i] < array[j]){
                     int n;
                     n = array[i];
                     array[i] = array[j];
                     array[j] = n;
                }
            }
        }
      return array;
    }


}



