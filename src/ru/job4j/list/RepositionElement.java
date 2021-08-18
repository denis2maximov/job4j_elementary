package ru.job4j.list;

import java.util.List;

public class RepositionElement {
    public static List<String> changePosition(List<String> list, int index) {
        String endElement = list.remove(list.size() - 1);
        if (index >= list.size() - 1) {
            System.out.println("Index not found");
        } else if (index < list.size() - 1) {
            list.set(index, endElement);
        }

        return list;
    }
}