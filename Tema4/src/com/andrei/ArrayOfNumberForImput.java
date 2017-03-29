package com.andrei;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Andrei on 3/27/2017.
 */
public class ArrayOfNumberForImput {


    private ArrayList<Integer> array;
    {
        array = new ArrayList<>();
    }

    public ArrayList<Integer> createArray() {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextInt()) {
            array.add(scanner.nextInt());
        }

        return array;
    }

    public void clearArray() {
        array.clear();
    }

}
