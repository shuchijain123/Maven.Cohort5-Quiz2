package com.zipcodewilmington.assessment2.part1;

import java.util.ArrayList;

public class IntegerArrayUtilities {
    public Boolean hasEvenLength(Integer[] array) {

        Boolean ans = true;

        if (array.length % 2 == 0) {
            ans = true;
        } else {
            ans =false;
        }
        return ans;
    }
    public Integer [] range(int start, int stop) {
        ArrayList <Integer> mylist = new ArrayList<>();
        Integer[] myarray = new Integer[]{};

        for (int i=start;i<stop;i++){


           mylist.add(i);
            myarray = (Integer[])mylist.toArray(new Integer[mylist.size()]);


        }

      return myarray;



    }

    public Integer getSumOfFirstTwo(Integer[] array) {
        int sum = 0;

            sum = array[0] + array[1];

        return sum;
    }


    public Integer getProductOfFirstTwo(Integer[] array) {
        int product = 1;

        product = array[0] * array[1];

        return product;
    }
}
