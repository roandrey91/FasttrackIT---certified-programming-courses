package com.andrei;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Andrei on 3/20/2017.
 */
public class OddFromList {


    public  String getOdds(ArrayList<Double> array) {
        StringBuilder sb = new StringBuilder();

        sb.append("[");
        for (double number : array) {
            if (number % 2 != 0) {
                sb.append((int)number);
                sb.append(", ");
            }
        }
        //remove trailing ", " if length > 2
        sb.setLength(sb.length() > 2 ? sb.length() - 2 : sb.length());
        sb.append("]");

        return sb.toString();
    }
}
