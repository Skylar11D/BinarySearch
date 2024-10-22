package xyz.sk1.examples.binarysearch.utilities;

import xyz.sk1.examples.binarysearch.exceptions.ArrayNotSortedException;

/**
 * BinarySearch algorithm is incredibly fast,
 * its time of complexity ranges from O(1) for the best case to O(log n) for the worst case,
 * however, adding additional linear checker for seeing if the array is sorted or not may impact its overall performance
 * significantly because the algorithm won't work if it's not sorted,
 * so make sure that the targeted array to be searched is already sorted to get the best
 * performance out of the BinarySearch algorithm,
 * in this example the checker can be excluded to test the real performance of this algorithm.
 * @Author Skylar
 * @see <a href="https://www.sk1.xyz">Author website</a>
 * */

public class BinarySearch {

    /**
    * @param targetNumber the number to be searched for in the array
    * @param targetArray the array of which the targeted number resides in
    * @return the index of the targeted number, otherwise, -1*/
    public int indexOf(int targetNumber, int[] targetArray) throws ArrayNotSortedException {

        //if(!isSorted(array))
            //throw new ArrayNotSortedException("The specified array must be sorted for binary search");

        int lowIndex = 0, highIndex = targetArray.length-1, middleIndex = lowIndex+(highIndex-lowIndex)/2;

        while (lowIndex <= highIndex){
            if (targetNumber == targetArray[middleIndex]) {
                return middleIndex;
            }

            if(targetNumber < targetArray[middleIndex]){
                highIndex = middleIndex-1; //eliminates the right half
            }

            if(targetNumber > targetArray[middleIndex]){
                lowIndex = middleIndex+1; //eliminates the left half
            }

        }

        return -1;
    }

    /**
     * @param arr the targeted array to be checked
     * @return a result of the check, if the array is sorted it will return true, otherwise, false
     * */
    private boolean isSorted(int[] arr){

        for (int i = 0; i < arr.length-1; i++){
            if(arr[i] > arr[i+1])
                return false;
        }
        return true;
    }

}
