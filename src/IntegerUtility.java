// package edu.kit.informatik;

/** This class contains 6 different methods to manipulate or to analyse integer arrays.
 *
 * @author upiol
 * @version 1.0
 */

public final class IntegerUtility {

    /**
     * private constructor
     */

    private IntegerUtility() {
    }

    /**
     * Removes all smaller elements in an integer array than a given integer.
     *
     * @param values integer array to be manipulated
     * @param threshold integer value that will determine the new array
     * @return new version of given integer array with elements that are greater than threshhold.
     */

    public static int[] greaterThan(int[] values, int threshold) {

        int returnArraySize = 0;

        for (int value: values) { // Determines the size of return array

            if (value > threshold) {

                returnArraySize++;
            }

        }

        int[] returnArray = new int[returnArraySize];

        int index = 0;

        for (int value: values) { // This loop adds all integers that are greater than threshold to return array.

            if (value > threshold) {

                returnArray[index] = value;
                index++;
            }

        }

        return returnArray;
    }

    /**
     * Detects odd numbers in an integer array.
     *
     * @param values integer array to be examined.
     * @return integer array with odd elements of given integer array.
     */

    public static int[] getOdds(int[] values) {

        int returnArraySize = 0;

        final int numberTwo = 2;

        for (int value: values) { // Determines the size of return array

            if (value % numberTwo != 0) {

                returnArraySize++;
            }

        }

        int returnArray[] = new int[returnArraySize];

        int index = 0;

        for (int value: values) { // This loop adds all odd integers to return array

            if (value % numberTwo != 0) {

                returnArray[index] = value;
                index++;
            }
        }

        return returnArray;

    }

    /**
     * Detects the index of an integer in an integer array.
     *
     * @param values integer array to be examined
     * @param key integer to be searched in the given array
     * @return index of given integer in the array. -1 if integer is not an element of array.
     */

    public static int search(int[] values, int key) {

        boolean loopBroken = false;

        int index = 0;

        for (int value: values) { // Adds 1 for every round and gets broken when the searched integer gets found.

            if (value == key) {

                loopBroken = true;

                break;
            }

            index++;

        }

        if (loopBroken) {

            return index;
        }

        else { // Not broken loop means that the searched integer was not found.

            return -1;
        }

    }

    /**
     * Changes the order of an integer array to ascending numerical order.
     * @param values integer array to be manipulated
     * @return integer array with ascending numerical order
     */


    public static int[] sort(int[] values) {

        int arraySize = 0;

        for (int value: values) { // Determines the size of return array

            arraySize++;
        }

        // It is not necessary to create a returnArray

        for (int i = 0; i < arraySize - 1; i++) { // Performs bubble sort

            for (int j = 0; j < arraySize - i - 1; j++) { // Swaps elements if they are out of order

                if (values[j] > values[j + 1]) {

                    int bigger = values[j];

                    values[j] = values[j + 1];

                    values[j + 1] = bigger;
                }
            }
        }

        return values;

    }

    /**
     *
     * Calculates the median of an integer array
     * @param values integer array to be examined.
     * @return median of given integer array
     */

    public static double median(int[] values) {

        double medianValue;

        final int numberTwo = 2;

        int[] sortedArray = sort(values); // sorts the given array in ascending order for an easier process

        int sortedArraySize = 0;

        for (int number: sortedArray) { // Determines the size of array

            sortedArraySize++;
        }

        int mid = sortedArraySize / numberTwo; // Determines the middle index of array

        if (sortedArraySize % numberTwo != 0) { // Median is in the middle if array size is an odd number

            medianValue = sortedArray[mid];

        }

        else { // Median is average of two numbers in the middle if array size is not an odd number

            long sum = (long) sortedArray[mid] + sortedArray[mid - 1];

            // we switch to long because limit of integer can be exceeded in summation


            medianValue = ((double) sum) / numberTwo;

        }

        return medianValue;

    }

    /**
     *
     * Detects common elements of two integer arrays.
     * @param a integer array one
     * @param b integer array two
     * @return integer array with common elements of given arrays. It is empty if there are no common elements.
     */

    public static int[] common(int[] a, int[] b) {

        int arrayASize = 0;

        int arrayBSize = 0;

        for (int number: a) { // Determines the size of array a

            arrayASize++;
        }

        for (int number: b) { // Determines the size of array b

            arrayBSize++;
        }

        int[] sortedInputArray = new int[arrayASize];

        int returnArraySize = Math.min(arrayASize, arrayBSize);

        // return array cannot be bigger than the smaller input array

        int[] returnArray = new int[returnArraySize];

        int index = 0;

        sortedInputArray = sort(a); // sorts array a in ascending order for easier process

        for (int i = 0; i < arrayASize; i++) { // Iterates through a

            if (i > 0 && sortedInputArray[i] == sortedInputArray[i - 1]) { // Skip duplicate elements

                continue;
            }
            for (int j = 0; j < arrayBSize; j++) { // Iterates through b to find common elements

                if (sortedInputArray[i] == b[j]) { // Loop gets broken if a common integer is found

                    returnArray[index] = sortedInputArray[i];

                    index++;

                    break;

                }
            }
        }

        if (index < returnArraySize) { // If common elements are less than array size, creates a smaller array

            int[] shortenedArray = new int[index];
            System.arraycopy(returnArray, 0, shortenedArray, 0, index);

            returnArray = shortenedArray;
        }

        return returnArray;

    }

}