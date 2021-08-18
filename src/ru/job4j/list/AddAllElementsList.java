package ru.job4j.list;

import java.util.List;

public class AddAllElementsList {
    public static int containsElement(List<String> left, List<String> right, String str) {
        int onelist = left.indexOf(str);
        int twolist = right.indexOf(str);
        if (onelist > 0 && twolist > 0) {
            left.remove(onelist);
            left.addAll(right);
        }
        int outOnelist = left.indexOf(str);
        return outOnelist;
    }
}