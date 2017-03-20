package com.andrei;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Andrei on 3/20/2017.
 */
public class ArrayOfNumbersFromImput {


        private ArrayList<Double> array;
        {
            array = new ArrayList<Double>();
        }

        public ArrayList<Double> createArray() {
            Scanner scanner = new Scanner(System.in);

            while (scanner.hasNextDouble()) {
                array.add(scanner.nextDouble());
            }

            return array;
        }

        public void clearArray() {
            array.clear();
        }

    }

