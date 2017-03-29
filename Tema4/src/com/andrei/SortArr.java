package com.andrei;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by Andrei on 3/27/2017.
 */
public class SortArr {

//   9. Se da un sir. Sa se verifice daca sirul este ordonat crescator , iar daca nu este sa se ordoneze si
//      sa se afiseze in ordine crescatoare
//      de ex pt sirul {2,3,4} se va afisa “crescator” iar pt sirul {3,2,4}  si va ordina si afisa {2,3,4}



    public static ArrayList<Integer> toSort (ArrayList<Integer> unsortedList){
        ArrayList<Integer> sortedList = new ArrayList<Integer>();

        while (unsortedList.size() > 0){
            Integer min = unsortedList.get(0);
            for (int i = 0; i < unsortedList.size(); i++) {
                if (min > unsortedList.get(i)) {
                    min = unsortedList.get(i);
                }
            }
            unsortedList.remove(min);
            sortedList.add(min);
        }
            return sortedList;
    }





}
