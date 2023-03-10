package com.zipcodewilmington;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

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

        return array[array.length-1];
    }

    /**
     * @param array array of String objects
     * @return second to last element in specified array
     */ // TODO
    public static String getSecondToLastElement(String[] array) {


        return array[array.length-2];
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return true if the array contains the specified `value`
     */ // TODO
    public static boolean contains(String[] array, String value) {
        for(int i = 0; i < array.length; i++){
            if(array[i] == value){
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
        String[] arrayReverse = new String[array.length];
        int j = array.length;
        for(int i =0; i < array.length; i++){
            arrayReverse[j-1] = array[i];
            j -= 1;
        }

        return arrayReverse;
    }

    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
    public static boolean isPalindromic(String[] array) {
        String[] arrayReverse = new String[array.length];
        int j = array.length;
        for(int i =0; i < array.length; i++){
            arrayReverse[j-1] = array[i];
            j -= 1;
        }
        for(int k = 0; k < array.length; k++){
            if(array[k] == arrayReverse[k]){
                return true;
            }
        }
        return false;
    }

    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */ // TODO
    public static boolean isPangramic(String[] array) {
        String sum = "";
        HashSet<Character> set = new HashSet<>();

        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        char[] newArr = sum.toLowerCase().replaceAll(" ", "").toCharArray();


        for(char letter : newArr){
            set.add(letter);
        }
        if(set.size() == 26){
            return true;
        }
        System.out.println(newArr);

        return false;

    }


    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return number of occurrences the specified `value` has occurred
     */ // TODO
    public static int getNumberOfOccurrences(String[] array, String value) {
        int counter = 0;
        for(int i = 0; i < array.length; i++){
            if(array[i].substring(0, array[i].length()) == value){
                counter++;
            }
        }

        return counter;
    }

    /**
     * @param array         array of String objects
     * @param valueToRemove value to remove from array
     * @return array with identical contents excluding values of `value`
     */ // TODO
    public static String[] removeValue(String[] array, String valueToRemove) {
        String[] result = new String[array.length-1];

        for(int i = 0, k = 0; i < array.length; i++){
            if(array[i] != valueToRemove){
                result[k] = array[i];
                k++;
            }
        }

        return result;
    }

    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {
        List<String> newList = new ArrayList<>(Arrays.asList(array));


        for (int i = 0; i < newList.size() - 1; i++) {
            if(newList.get(i).equals(newList.get(i + 1))){
                    newList.remove(i);
                    i--;
            }
        }

        return newList.toArray(new String[newList.size()]);
    }


    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {
        StringBuilder builder = new StringBuilder();
        for( int i = 0; i < array.length; i++){
            if(i == array.length-1) {
                builder.append(array[i]);
            }
            else if(array[i] == array[i + 1]){
                builder.append(array[i]);
            } else if(array[i] != array[i]+1){
                builder.append(array[i] + ",");
            }
        }
        String resultString = new String(builder.toString());
        String[] finalString = resultString.split(",");
        System.out.println(finalString);
        return finalString;
    }
}
