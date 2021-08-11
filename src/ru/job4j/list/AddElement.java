package ru.job4j.list;

import java.util.ArrayList;
import java.util.List;

public class AddElement {
    public static <bolean> boolean addNewElement(List<String> list, String str) {
        boolean out = false;
        List<String> check = new ArrayList<>(list);
        list.add(str);
        out = list.equals(check) ? false: true;
        return out;
    }
}