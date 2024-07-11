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

        if(!isSorted(array)){
            try {
                throw new ArrayNotSortedException("The specified array must be sorted for binary search");
            } catch (ArrayNotSortedException e) {
                throw new RuntimeException(e);
            }
        }

        try {
            index = binarySearch.indexOf(4, array);
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

    /**
     * @param arr the targeted array to be checked
     * @return a result of the check, if the array is sorted it will return true, otherwise, false
     * */
    private static boolean isSorted(int[] arr){

        for (int i = 0; i < arr.length-1; i++){
            if(arr[i] > arr[i+1])
                return false;
        }
        return true;
    }

}
