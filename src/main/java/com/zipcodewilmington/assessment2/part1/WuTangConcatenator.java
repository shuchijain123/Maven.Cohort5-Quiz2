package com.zipcodewilmington.assessment2.part1;

public class WuTangConcatenator {
    Integer input;

    public WuTangConcatenator(Integer input) {
     this.input = input;



    }

    public Boolean isWu() {

        Boolean wunum = true;




        if (input % 3 == 0) {
            wunum = true;
        } else {
            wunum = false;
        }
        return wunum;
    }

    public Boolean isTang() {
        Boolean wunum = true;




        if (input % 5 == 0) {
            wunum = true;
        } else {
            wunum = false;
        }
        return wunum;
    }



    public Boolean isWuTang() {
        Boolean wunum = true;




        if (input % 15 == 0) {
            wunum = true;
        } else {
            wunum = false;
        }
        return wunum;
    }
}
