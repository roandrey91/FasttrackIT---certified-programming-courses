package com.andrei;

import java.util.ArrayList;

/**
 * Created by Andrei on 3/28/2017.
 */
public class MoveInArray {

//11. Se da un sir. Sa se extraga toate numerele intre doua valori si sa se puna intr-un alt sir care apoi sa se afiseze.

    public static ArrayList<Integer> moveValue(ArrayList<Integer> arrayList) {
        ArrayList<Integer> newArray = new ArrayList<>();
        Integer number = arrayList.get(0);
        for (int i = 0; i < arrayList.size()-1; i++) {
             number = arrayList.get(i+1);
             arrayList.remove(number);
             newArray.add(number);
        }
        System.out.println("First array : " + arrayList);

        return newArray;
    }

}
