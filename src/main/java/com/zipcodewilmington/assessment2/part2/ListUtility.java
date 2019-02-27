package com.zipcodewilmington.assessment2.part2;

import java.util.*;
import java.util.stream.Collectors;

public class ListUtility {
    List myList = new ArrayList();

    public Boolean add(int i) {

        Boolean ans = true;



        myList.add(i);
        if (contains(i)){
            ans = true;

        }
        else
        {
            ans = false;
        }

        return ans;
    }

    public Integer size() {


        return myList.size();
    }

    public List<Integer> getUnique() {
        List mynewList = new ArrayList();
        Integer[] arr = (Integer[])myList.toArray(new Integer[myList.size()]);
       for (int i=0;i <myList.size()-1 ;i++){

           if (arr[i]!=(arr[i+1])) mynewList.add(arr[i]);
           return mynewList;
       }




        return null;
    }

    public String join() {
        Integer[] arr = (Integer[])myList.toArray(new Integer[myList.size()]);

        String result =  myJoin(arr, ", ");
        return result;

    }

    public Integer mostCommon() {

        ArrayUtility myarray = new ArrayUtility();
        Integer[] arr = (Integer[])myList.toArray(new Integer[myList.size()]);



        Integer common = myarray.mostCommon(arr);


        return common;
    }

    public Boolean contains(Integer valueToAdd) {
Boolean ans = true;

    if (myList.contains(valueToAdd)) {


            ans = true;
        }
        else {

            ans = false;
        }
        return ans;
    }


    public static String myJoin(Integer[] arr, String separator) {
        if (null == arr || 0 == arr.length) return "";

        StringBuilder sb = new StringBuilder(256);
        sb.append(arr[0]);

        //if (arr.length == 1) return sb.toString();

        for (int i = 1; i < arr.length; i++) sb.append(separator).append(arr[i]);

        return sb.toString();
    }

}
