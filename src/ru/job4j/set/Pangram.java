package ru.job4j.set;

import java.util.HashSet;
import java.util.Set;

public class Pangram {
    public static boolean checkString(String s) {
        boolean outBoolean = false;
        Set<String> setStr = new HashSet<>();
        for (String out : s.split("")) {
            if (!out.contains(" ")) {
                setStr.add(out.toUpperCase());
            }
           }
        int sizeSet = setStr.size();
        if (sizeSet == 26) {
            outBoolean = true;
             }
        return outBoolean;
    }
}