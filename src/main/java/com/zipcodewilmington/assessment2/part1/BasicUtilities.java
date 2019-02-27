package com.zipcodewilmington.assessment2.part1;

public class BasicUtilities {
    public Boolean isGreaterThan5(int value) {
        Boolean ans = true;

        if (value >=5) {

            ans = true;
        } else {
            ans = false;
        }
        return ans;
    }
    public Boolean isLessThan7(int value) {
  Boolean ans = true;

        if (value <=7) {

            ans = true;
        } else {
            ans = false;
        }
        return ans;
    }

    public Boolean isBetween5And7(int valueToEvaluate) {
        Boolean ans = true;

        if ((valueToEvaluate >= 5) && (valueToEvaluate <= 7)) {

        ans = true;
    }
        else {
            ans = false;
        }
        return ans;
    }

    public Boolean startsWith(String string, Character character) {
        Boolean ans = true;
        if (string.startsWith(character.toString())) {

            ans = true;
        } else {
            ans = false;
        }
        return ans;
    }
}
