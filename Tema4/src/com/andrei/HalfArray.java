package com.andrei;

import java.util.ArrayList;

/**
 * Created by Andrei on 3/27/2017.
 */
public class HalfArray {


//10. Se da un sir. Pentru prima jumatate a sirului sa se afiseze numerele dublate, iar pentru a doua jumatate
//    sa se afseze numerele triplate daca sunt impare si numerele asa cum sunt in sir daca sunt pare.


    public static void halfDoubleAndTriple(ArrayList<Integer> arrayList) {
        ArrayList<Integer> result = new ArrayList<>();
            Integer val1 ;
            for (int i = 0; i <= arrayList.size() / 2; i++) {
                val1 = arrayList.get(i) * 2;
                arrayList.remove(val1);
                result.add(val1);
                System.out.println(result);

                for (int j = 0; j < arrayList.size(); j++) {
                    if (val1 % 2 != 0) {
                        val1 = arrayList.get(j) * 3;
                        arrayList.remove(val1);
                        result.add(val1);
                    }else {
                        val1 = arrayList.get(j);
                        arrayList.remove(val1);
                        result.add(val1);
                    }
                }
            }
        System.out.println("Result :" + result);
        }

    }






