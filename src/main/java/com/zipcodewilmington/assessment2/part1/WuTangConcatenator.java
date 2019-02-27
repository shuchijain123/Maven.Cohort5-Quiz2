package com.zipcodewilmington.assessment2.part1;

public class WuTangConcatenator {

    public WuTangConcatenator(Integer input) {



    }

    public Boolean isWu() {

        Boolean wunum = true;


       Integer input =0;

        if (input % 3 == 0) {
            wunum = true;
        } else {
            wunum = false;
        }
        return wunum;
    }

    public Boolean isTang() {
        return null;
    }

    public Boolean isWuTang() {
        return null;
    }
}
