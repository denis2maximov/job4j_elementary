package ru.job4j.list;

import java.util.Collections;
import java.util.List;

public class SubList {
    public static List<String> getElementsBetweenIndexes(List<String> list, String el) {
        int intIndex = Collections.frequency(list, el);

        if (intIndex <= 1) {
            list.clear();
            return list;
        } else {
            return list.subList(list.indexOf(el), list.lastIndexOf(el));
        }
    }
}