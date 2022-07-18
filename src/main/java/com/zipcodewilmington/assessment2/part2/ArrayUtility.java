package com.zipcodewilmington.assessment2.part2;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayUtility {
    public Integer[] merge(Integer[] array1, Integer[] array2) {
        ArrayList<Integer> arrayToAl1 = new ArrayList<>(Arrays.asList(array1));
        ArrayList<Integer> arrayToAl2 = new ArrayList<>(Arrays.asList(array2));
        ArrayList<Integer> al1AndAl2 = new ArrayList<>();

        al1AndAl2.addAll(arrayToAl1);
        al1AndAl2.addAll(arrayToAl2);
        return al1AndAl2.toArray(new Integer[0]);
    }

    public Integer[] rotate(Integer[] array, Integer index) {
//        int aLen = array.length;
//        int temp[];
//        int k = 0;
//        for (int i = index; i < array.length; i++) {
//            temp[k] = array[i];
//            k++;
//        }
//        for (int i = 0; i < index; i++) {
//            temp[k] = array[i];
//            k++;
//        }
//        for (int i = 0; i < array.length; i++) {
//            array[i] = temp[i];
//        }
        return null;
    }




    public Integer countOccurrence(Integer[] array1, Integer[] array2, Integer valueToEvaluate) {
        int count = 0;
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] == valueToEvaluate) {
                count++;
            }
        }
        for (int i = 0; i < array2.length; i++) {
            if (array2[i] == valueToEvaluate) {
                count++;
            }
        }
        return count;
    }

    public static Integer mostCommon(Integer[] array) {
        Integer maxCount = 0;
        Integer element_having_max_freq = 0;
        for (Integer i = 0; i < array.length; i++) {
            Integer count = 0;
            for (Integer j = 0; j < array.length; j++) {
                if (array[i] == array[j])
                    count++;
            }

            if (count > maxCount) {
                maxCount = count;
                element_having_max_freq = array[i];
            }

        }
        return element_having_max_freq;
    }
}

