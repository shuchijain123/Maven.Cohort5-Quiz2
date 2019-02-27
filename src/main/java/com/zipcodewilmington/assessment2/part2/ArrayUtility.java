package com.zipcodewilmington.assessment2.part2;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayUtility {


    public Integer[] merge(Integer[] array1, Integer[] array2) {


        ArrayList<Integer> list  = new ArrayList(Arrays.asList(array1));
        ArrayList<Integer> list2  = new ArrayList(Arrays.asList(array2));

        list.addAll(list2);



        Integer[] obarr = new Integer[list.size()];
        obarr = list.toArray(obarr);


        return obarr;




    }

    public Integer[] rotate(Integer[] array, Integer index) {


        for (int i = 0; i < index; i++) {

            int temp = array[0];
            for (int j = 0; j < array.length - 1; j++) {

                array[j] = array[j + 1]; } array[array.length - 1] = temp;
        } return array;

    }








    public Integer countOccurrence(Integer[] array1, Integer[] array2, Integer valueToEvaluate){
ArrayUtility myarray = new ArrayUtility();


       Integer[] newArray = myarray.merge(array1, array2);


    int count = 0;

        for (int i = 0; i < newArray.length; i++) {

        if (newArray[i] == valueToEvaluate) {


            count++;
        }


    }


        return count;
    }

    public Integer mostCommon(Integer[] array) {


        int count = 1, tempCount;
        int popular = (int) array[0];
        int temp = 0;
        for (int i = 0; i < (array.length - 1); i++) {
            if (array[i] != null)
                temp = (int) array[i];
            tempCount = 0;
            for (int j = 1; j < array.length; j++) {
                if (array[j] != null && temp == (int) array[j])
                    tempCount++;
            }
            if (tempCount > count) {
                popular = temp;
                count = tempCount;
            }
        }
        return popular;
    }
}
