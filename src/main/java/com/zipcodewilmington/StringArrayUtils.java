package com.zipcodewilmington;

/**
 * Created by leon on 1/29/18.
 */
public class StringArrayUtils {
    /**
     * @param array array of String objects
     * @return first element of specified array
     */ // TODO
    public static String getFirstElement(String[] array) {

        return array[0];
    }

    /**
     * @param array array of String objects
     * @return second element in specified array
     */
    public static String getSecondElement(String[] array) {

        return array[1];
    }

    /**
     * @param array array of String objects
     * @return last element in specified array
     */ // TODO
    public static String getLastElement(String[] array) {
        return array[array.length - 1];
    }

    /**
     * @param array array of String objects
     * @return second to last element in specified array
     */ // TODO
    public static String getSecondToLastElement(String[] array) {
        return array[array.length - 2];
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return true if the array contains the specified `value`
     */ // TODO
    public static boolean contains(String[] array, String value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].equalsIgnoreCase(value)) {
                return true;
            }
        }
        return false;
    }

    /**
     * @param array of String objects
     * @return an array with identical contents in reverse order
     */ // TODO
    public static String[] reverse(String[] array) {
        String[] strArray = new String[array.length];
        int count = 0;
        for (int i = array.length - 1; i >= 0; i--) {
            strArray[count] = array[i];
            count = count + 1;
        }
        return strArray;
    }

    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
    public static boolean isPalindromic(String[] array) {
        int length = array.length;
        int iterations = array.length / 2;
        for (int i = 0; i < iterations; i ++)
        {
            if (!array [i].equals(array [length - 1 - i]))
            {
                return false;
            }
        }
        return true;
    }


    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */ // TODO
    public static boolean isPangramic(String[] array) {
        boolean[] isPresent = new boolean[26];
        for (int i = 0; i < array.length; i++) {
            String input = array[i];
            int index = 0;
            for (int id = 0; id < input.length(); id++) {
                if (input.charAt(id) >= 'a' && input.charAt(id) <= 'z') {
                    index = input.charAt(id) - 'a';
                } else if (input.charAt(id) >= 'A' && input.charAt(id) <= 'Z') {
                    index = input.charAt(id) - 'A';
                }
                isPresent[index] = true;
            }
        }
        for (int k = 0; k < 26; k++) {
            if (!isPresent[k]) {
                return false;
            }
        }
        return true;
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return number of occurrences the specified `value` has occurred
     */ // TODO
    public static int getNumberOfOccurrences(String[] array, String value) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i].equalsIgnoreCase(value)) {
                count = count + 1;
            }
        }
        return count;
    }

    /**
     * @param array         array of String objects
     * @param valueToRemove value to remove from array
     * @return array with identical contents excluding values of `value`
     */ // TODO
    public static String[] removeValue(String[] array, String valueToRemove) {

        String[] temp = new String[array.length];
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            if (!array[i].equals(valueToRemove)) {
                temp[counter] = array[i];
                counter = counter + 1;
            }
        }
        String[] result = new String[counter];
        for (int i = 0; i < array.length; i++) {
            if (temp[i] != null) {
                result[i] = temp[i];
            }
        }
        return result;
    }

    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {
        String[] temp = new String[array.length];
        int counter = 0;
        String strCompare = null;
        for (int i = 0; i < array.length; i++) {
            if (!array[i].equals(strCompare)) {
                temp[counter] = array[i];
                strCompare = array[i];
                counter = counter + 1;
            }
        }
        String[] result = new String[counter];
        for (int i = 0; i < temp.length; i++) {
            if (temp[i] != null) {
                result[i] = temp[i];
            }
        }
        return result;
    }

    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {
        String[] temp = new String[array.length];
        int counter = 0;


        temp[0] = array[0];

        String previous = array[0];
        for (int x=1; x<array.length; x++){
            if((array[x].equals(previous))){
                temp[counter] += array[x];
            }
            else{
                counter++;
                temp[counter] = array[x];
                previous = array[x];
            }
        }
        String[] result = new String[counter+1];
        for (int i = 0; i < temp.length; i++) {
            if (temp[i] != null) {
                result[i] = temp[i];
            }
        }
        return result;
    }

}
