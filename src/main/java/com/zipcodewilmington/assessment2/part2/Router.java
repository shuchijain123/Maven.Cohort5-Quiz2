package com.zipcodewilmington.assessment2.part2;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.Map;


public class Router {
    SortedMap<String, String> mymap = new TreeMap<>();

    public void add(String path, String controller) {

        mymap.put(path, controller);


    }

    public Integer size() {


        return mymap.size();
    }

    public String getController(String path) {

        return mymap.get(path);
    }

    public void update(String path, String studentController) {

        mymap.replace(path, studentController);
    }

    public void remove(String path) {
        mymap.remove(path);
    }


    @Override

    public String toString() {

        String result = "";
        StringBuilder sb = new StringBuilder();


        for (Map.Entry<String, String> entry : mymap.entrySet()) {


            sb.append(entry.getKey()+" "+"->"+" " + entry.getValue() + "\n");

            result = sb.toString();


        }
        return result;

    }
}