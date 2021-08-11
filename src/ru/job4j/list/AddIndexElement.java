package ru.job4j.list;

import java.util.ArrayList;
import java.util.List;

public class AddIndexElement {
    public static boolean addNewElement(List<String> list, int index, String str) {
        boolean out = false;
        List<String> check = new ArrayList<>(list);
        if (!list.contains(str)) {
            list.add(index, str);
        }
        out = list.equals(check) ? false : true;
        return out;
    }
}