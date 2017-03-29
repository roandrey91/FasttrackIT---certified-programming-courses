package com.andrei;

import java.lang.reflect.Array;

/**
 * Created by Andrei on 3/26/2017.
 */
public class GetIndexOfNumber {


//    1. Se da un sir de numere ordonate crescator.
//    Se va determina daca un numar n exista in sir, si daca exista se va afisa pozitia pe care s-a gasit, altfel se va afisa -1.
//    Cu ce difera algoritmul cand sirul este ordonat crescator de cazul cand sirul este neordonat.
//    sirul va fi definit asa, numerele sunt de exemplu.
//    int[] a = {1,3,4,6,7,8,10,12,14,23};




    public static int getIndexOf( int toSearch, int[] tab )
    {

        for( int i=0; i< tab.length ; i ++ )
            if( tab[ i ] == toSearch)
                return i;

        return -1;
    }





    }



