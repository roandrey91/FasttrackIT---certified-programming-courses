package com.andrei;
import java.util.ArrayList;
/**
 * Created by Andrei on 3/20/2017.
 */



public class MaxFromList {

    public static double getMax(ArrayList<Double> array) {
        double max = 0;

        for (double number : array) {
            if (number > max) {
                max = number;
            }
        }

        return max;
    }




}
