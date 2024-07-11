package xyz.sk1.examples.binarysearch;

import xyz.sk1.examples.binarysearch.exceptions.ArrayNotSortedException;
import xyz.sk1.examples.binarysearch.utilities.BinarySearch;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {

    private static final Logger LOGGER = Logger.getAnonymousLogger();

    public static void main(String[] args) {
        int[] array = {3, 5, 8, 9, 11, 13, 15, 18}; //already sorted
        BinarySearch binarySearch = new BinarySearch();
        int index = 0;

        /*populate(array, 20);*/

        try {
            index = binarySearch.indexOf(11, array);
        } catch (ArrayNotSortedException e) {
            e.printStackTrace();
        }

        var result = (index != -1) ? String.valueOf(index) : "not found";

        LOGGER.log(Level.INFO, "The index of the number is " + result);

    }

    /*private static void populate(int[] array, int maxRandomBound){
        for (int x=0;x<array.length;x++){
            array[x] = new Random().nextInt(maxRandomBound);
        }
    }*/

}
